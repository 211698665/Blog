package cn.henu.controller.user;

import cn.henu.pojo.*;
import cn.henu.service.ArticleService;
import cn.henu.service.CommentService;
import cn.henu.service.NoticeService;
import cn.henu.service.SortService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class UserArtDetailController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private SortService sortService;
    @RequestMapping("/user/artdetail")
    public String artDetail(@RequestParam("id") String id,@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn, @RequestParam(defaultValue = "10") Integer pageSize, HttpServletRequest request) throws Exception {
        Article article=articleService.findById(Integer.parseInt(id));
        article.setArticleClick(article.getArticleClick()+1);
        articleService.updateViewCount(Integer.parseInt(id),article.getArticleClick());
        SimpleDateFormat formatdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date="";
        date=formatdate.format(article.getArticleUpdatetime());
        Date newDate=formatdate.parse(date);
        java.sql.Date formaldate=new java.sql.Date(newDate.getTime());
        article.setArticleUpdatetime(formaldate);
        article.setArticleContent(StringEscapeUtils.unescapeHtml4(article.getArticleContent()));
        Page<Comment> page = PageHelper.startPage(pn, pageSize);
        List<Comment> comentAll = commentService.selectByArticleId(Integer.parseInt(id));
        PageInfo<Comment> plist = new PageInfo<Comment>(comentAll);
        int categorysPageNum;
        int size = commentService.selectByArticleId(Integer.parseInt(id)).size();
        if(size%pageSize==0){
            categorysPageNum=size/pageSize;
        }else{
            categorysPageNum=size/pageSize+1;
        }
        String date2="";
        for (int i=0;i<comentAll.size();i++){
            date2=formatdate.format(comentAll.get(i).getCommentCreateTime());
            Date newDate2=formatdate.parse(date2);
            java.sql.Date formaldate2=new java.sql.Date(newDate2.getTime());
            comentAll.get(i).setCommentCreateTime(formaldate2);
        }
        //查询评论数目

        request.setAttribute("commentNum",size);
        //artCategory
        //Articlecategoryref articlecategoryref = sortService.findByArticleId(Integer.parseInt(id));
        //这里是借用article_like字段来存储所属分类的ID
        Category artCategory=sortService.findByCategoryId(article.getArticleLike());
        request.setAttribute("artDetail",article);
        request.setAttribute("artCategory",artCategory.getCategoryName());
        request.setAttribute("topListHot",findTopHotPhoto(request));
        request.setAttribute("comments",comentAll);
        request.setAttribute("categorysList",allCategory());
        request.setAttribute("advicesArticle",adviceArticle(article));
        request.setAttribute("pageSize",categorysPageNum);
        System.out.println("categorysPageNums"+categorysPageNum+"curr:"+pn);
        request.setAttribute("currPage",pn);
        return "/user/art_detail";
    }
    public List<Article> findTopHotPhoto(HttpServletRequest request) throws ParseException {
        SimpleDateFormat formatdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date="";
        List<Article> list=new LinkedList<Article>();
        list=articleService.findAllArticle();
        Collections.sort(list);
        for (int i=0;i<3;i++){
            date=formatdate.format(list.get(i).getArticleUpdatetime());
            Date newDate=formatdate.parse(date);
            java.sql.Date formaldate=new java.sql.Date(newDate.getTime());
            list.get(i).setArticleUpdatetime(formaldate);
        }
        List <Article> listTop= new LinkedList<Article>();
        for (int i=0;i<3;i++){
            listTop.add(i, (Article) list.get(i));
        }
        return listTop;
    }
    @RequestMapping("/user/artComment")
    @ResponseBody
    public Comment artComment(Comment comment, HttpServletRequest request) throws ParseException {
        //随机头像
        String[] arr={
            "http://192.168.117.133/group1/M00/00/00/wKh1hV4CHJ2AXhAKAAErpFhITdE294.jpg",
            "http://192.168.117.133/group1/M00/00/00/wKh1hV4CHRmAUsNqAAErpFhITdE941.jpg",
            "http://192.168.117.133/group1/M00/00/00/wKh1hV4CHXKAIDZWAADTCH1MO3Y759.jpg",
            "http://192.168.117.133/group1/M00/00/00/wKh1hV4CHYGAXhQSAACJQNhD8gg196.jpg",
            "http://192.168.117.133/group1/M00/00/00/wKh1hV4CHYuAcE1aAAB-c1qcjJU562.jpg",
            "http://192.168.117.133/group1/M00/00/00/wKh1hV4CHeiAOZpYAAMMDfq9_Xk946.png",
            "http://192.168.117.133/group1/M00/00/00/wKh1hV4CHgaATfRDAAIt-Z3iUwQ705.jpg",
            "http://192.168.117.133/group1/M00/00/00/wKh1hV4CHiqASU39AADArH7B8qc699.jpg",
            "http://192.168.117.133/group1/M00/00/00/wKh1hV4CHlCAFdh9AADug4ZLXoo563.jpg",
        };
        Random random = new Random();
        int index = random.nextInt(9);
        Date date=new Date();
        comment.setCommentHead(arr[index]);
        comment.setCommentCreateTime(date);
        comment.setCommentIp(request.getRemoteAddr());
        commentService.addComment(comment);
        int articleId=Integer.parseInt(request.getParameter("articleId"));
        Article article = articleService.findById(articleId);
        article.setArticleComment(article.getArticleComment()+1);
        //更新article,这里也就是没有做的后台更新文章的部分。
        articleService.updateByPrimaryKey(article);
        SimpleDateFormat formatdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date2="";
        date2=formatdate.format(comment.getCommentCreateTime());
        Date newDate=formatdate.parse(date2);
        java.sql.Date formaldate=new java.sql.Date(newDate.getTime());
        comment.setCommentCreateTime(formaldate);
        return comment;
    }
    public List<Category> allCategory(){
        //这里需要借助category的categoryDesc字段来存储前台的显示class
        List<Category> list=sortService.findAll();
        String[] arr={"label label-success","label label-info","label label-warning","label label-danger","label label-primary "};
        for(int i=0;i<list.size();i++){
            Random random = new Random();
            int index = random.nextInt(5);
            list.get(i).setCategoryDesc(arr[index]);
        }
        return list;
    }
    public List<Article> adviceArticle( Article article) throws ParseException {
        //根据所选文章的Id查看文章的分类，然后从该类中根据关键词相似度进行推荐
        String articleKeyword = article.getArticleKeyword();
        String arr[]=articleKeyword.split(",");
        List<Article> list=new LinkedList<Article>();
        for(int i=0;i<arr.length;i++){
            List<Article> list2 = articleService.findArticleByKeyWord(arr[i]);
            list.addAll(list2);
        }
        Set set = new  HashSet();
        set.addAll(list);
        List<Article> newList= new LinkedList<Article>();
        newList.addAll(set);
        Collections.sort(newList, new Comparator<Article>() {
            @Override
            public int compare(Article o1, Article o2) {
                return o2.getArticleClick()-o1.getArticleClick();
            }
        });
        SimpleDateFormat formatdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date="";
        List<Article> list3=new LinkedList<Article>();
        for (int i=0;i<newList.size();i++){
            if(!((int)newList.get(i).getArticleId()==(int)article.getArticleId())){
                date=formatdate.format(newList.get(i).getArticleUpdatetime());
                Date newDate=formatdate.parse(date);
                java.sql.Date formaldate=new java.sql.Date(newDate.getTime());
                newList.get(i).setArticleUpdatetime(formaldate);
                list3.add(newList.get(i));
            }
        }
        return list3;
    }

}
