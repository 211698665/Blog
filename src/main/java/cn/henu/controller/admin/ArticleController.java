package cn.henu.controller.admin;

import cn.henu.pojo.Article;
import cn.henu.pojo.Articlecategoryref;
import cn.henu.pojo.Category;
import cn.henu.pojo.User;
import cn.henu.service.ArticleAndCotegoryService;
import cn.henu.service.ArticleService;
import cn.henu.service.CommentService;
import cn.henu.service.SortService;
import cn.henu.utils.FastDFSClient;
import cn.henu.vo.ArticleVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@Controller
public class ArticleController {
    @Value("${IMAGE_SERVER_URL}")
    private String IMAGE_SERVER_URL;
    @Autowired
    private ArticleService articleService;
    @Autowired
    private SortService sortService;
    @Autowired
    private ArticleAndCotegoryService articleAndCotegoryService;
    @Autowired
    private CommentService commentService;

    @RequestMapping("/admin/article")
    public ModelAndView findAllArticle(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn, @RequestParam(defaultValue = "10") Integer pageSize, HttpServletRequest request){
        PageHelper.startPage(pn, pageSize);
        List<Article> list=new LinkedList<Article>();
        list=articleService.findAllArticle();
        //这里借用article_like存储所属分类的id
        for (int i=0;i<list.size();i++){
            Articlecategoryref articlecategoryref = articleAndCotegoryService.selectByArticleId(list.get(i).getArticleId());
            System.out.println(articlecategoryref+"验证");
            list.get(i).setArticleLike(articlecategoryref.getCategoryId());
        }
        Collections.sort(list);
        PageInfo<Article> plist = new PageInfo<>(list);
        ModelAndView view = new ModelAndView();
        view.addObject("articlelist", plist.getList());
        view.setViewName("admin/article");
        int articlePageNum;
        if(articleService.countArticle()%10==0){
            articlePageNum=articleService.countArticle()/10;
        }else{
            articlePageNum=articleService.countArticle()/10+1;
        }
        request.setAttribute("pageSize",articlePageNum);
        request.setAttribute("currPage",pn);
        return view;
    }
    @RequestMapping("/admin/addArticlePage")
    public String addArticlePage(HttpServletRequest request){
        request.setAttribute("allcategorys",sortService.findAll());
        return "/admin/add_article";
    }

    @RequestMapping("/admin/addArticle")
    public void addArticle(ArticleVo articleVo, @RequestParam("photoFile") MultipartFile file, HttpServletRequest request, HttpServletResponse response) throws IOException {
        Article article = new Article();
        article.setArticleContent(StringEscapeUtils.unescapeHtml4(articleVo.getArticleContent()));
        article.setArticleKeyword(articleVo.getArticleKeyword());
        article.setArticleStatus(articleVo.getArticleStatus());
        article.setArticleTitle(articleVo.getArticleTitle());
        article.setArticleSummary(articleVo.getArticleSummary());
        article.setArticleComment(0);
        article.setArticleClick(100);
        Object obj= request.getSession().getAttribute("user");
        //获取session中的userID如果不存在或者不是Integer说明出现异常
        if(obj!=null && obj instanceof User){
            article.setUserId((int)((User) obj).getUserId());
        }else{
            request.setAttribute("addPhotoStatus","error");
        }
        Date date = new Date();
        article.setArticleUpdatetime(date);
        article.setArticleCreatetime(date);
        //调用service进行添加操作
        Map fileurl=uploadFile(file);
        if(Integer.parseInt(fileurl.get("error").toString())==0){
            //获取error存的值
            article.setArticleImage(fileurl.get("url").toString());
        }else{
            article.setArticleImage("");
        }
        article.setArticleLike(Integer.parseInt(articleVo.getArticleCategory()));
        int res=articleService.addArticle(article,new Category());
        Articlecategoryref articlecategoryref=new Articlecategoryref();
        articlecategoryref.setArticleId(article.getArticleId());
        //这里所属类的id存储在了VO的ArticleCategory字段中
        articlecategoryref.setCategoryId(Integer.parseInt(articleVo.getArticleCategory()));
        //在文章类中，借用articleLike字段来存储所属类的Id
        articlecategoryref.setUserId(1); //这里注意设置UserId
        articleAndCotegoryService.insert(articlecategoryref);
        request.setAttribute("addArticleStatus",res);
        response.sendRedirect("/admin/article");
    }
    public Map uploadFile(@RequestParam("photoFile") MultipartFile uploadFile) {
        try {
            //把图片上传到图片服务器
            FastDFSClient fastDFSClient = new FastDFSClient("classpath:conf/client.conf");
            //获取文件的扩展名
            String filename = uploadFile.getOriginalFilename();
            String extName=filename.substring(filename.lastIndexOf(".")+1);
            //得到文件的地址和文件名
            String url = fastDFSClient.uploadFile(uploadFile.getBytes(), extName);
            //补充为完整的url
            url=IMAGE_SERVER_URL+url;
            //封装到Map中返回
            Map map = new HashMap<>();
            map.put("error", 0);
            map.put("url", url);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            Map map = new HashMap<>();
            map.put("error", 1);
            map.put("message", "图片上传失败");
            return map;
        }
    }


    @RequestMapping("/article/del")
    @ResponseBody
    public String delArticle(@RequestParam("id") String id){
        int articled=Integer.parseInt(id);
        //删除文章的同时，需要先删除文章在ArticleandCategory表中的关系，需要删除评论表中的相关评论
        commentService.delCommentByArticleId(articled);
        articleAndCotegoryService.deleteByArticleId(articled);
        //最后删除文章
        return articleService.delByArticleId(articled)>0?"success":"fail";
    }

    ///admin/updateArticlePage
    @RequestMapping("/admin/updateArticlePage")
    public String updateArticlePage(@RequestParam("id") Integer id,HttpServletRequest request){
        Article article = articleService.findById(id);
        request.setAttribute("categoryChosed",sortService.findByCategoryId(article.getArticleLike()));
        List<Category> list=new LinkedList<Category>();
       List<Category> list2= sortService.findAll();
       //这里是为了避免重复显示已经选择的那个分类
       for (int i=0;i<list2.size();i++){
           if(!list2.get(i).getCategoryName().equals(sortService.findByCategoryId(article.getArticleLike()).getCategoryName())){
               list.add(list2.get(i));
           }
       }
        request.setAttribute("allcategorys",list);
        request.setAttribute("updateArticle",article);
        return "/admin/update_article";
    }
    //更新文章，，，
   @RequestMapping("/article/update")
    public void updateArticle(Article article, HttpServletRequest request, HttpServletResponse response, @RequestParam("photoFile") MultipartFile file) throws Exception {
       Article article1=articleService.findById(article.getArticleId());
       if(!article.getArticleTitle().equals(article1.getArticleTitle())){
           article1.setArticleTitle(article.getArticleTitle());
       }
       if(!article.getArticleLike().equals(article1.getArticleLike())){
           //这个字段存储的是文章的分类
           //修改文章分类
           Articlecategoryref articlecategoryref = new Articlecategoryref();
           articlecategoryref.setCategoryId(article.getArticleLike());
           articlecategoryref.setArticleId(article.getArticleId());
           articleAndCotegoryService.updateCategoryAndArticleByArticleId(articlecategoryref);
           article1.setArticleLike(article.getArticleLike());
       }
       if(!article.getArticleImage().equals(article1.getArticleImage())){
           Map fileurl=uploadFile(file);
           article1.setArticleImage(fileurl.get("url").toString());
       }
       article1.setArticleContent(StringEscapeUtils.unescapeHtml4(article.getArticleContent()));
       article1.setArticleSummary(article.getArticleSummary());
       article1.setArticleKeyword(article.getArticleKeyword());
       article1.setArticleStatus(article.getArticleStatus());
       //修改文章
       articleService.updateByPrimaryKey(article1);

        response.sendRedirect("/admin/article");
    }

}
