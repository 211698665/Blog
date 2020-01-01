package cn.henu.controller.user;

import cn.henu.dao.ArticleMapper;
import cn.henu.pojo.Article;
import cn.henu.pojo.Category;
import cn.henu.service.ArticleService;
import cn.henu.service.SortService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class UserSearchController {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private SortService sortService;
    @RequestMapping("/user/searchList")
    public String searchList(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn, @RequestParam(defaultValue = "6") Integer pageSize, HttpServletRequest request)throws  Exception{
        Page<Article> page = PageHelper.startPage(pn, pageSize);
        String keyword = request.getParameter("keyword");
        //根据关键词进行模糊查询
        List<Article> list= articleService.findArticleByKeyWord(keyword);
        for (int i=0;i<list.size();i++){
            //先从文章中把所属类ID取出来,ArticleLike属性中
            String categoryName=sortService.findByCategoryId(list.get(i).getArticleLike()).getCategoryName();
            //把查询到的名称放到articleKeyword属性中
            list.get(i).setArticleKeyword(categoryName);
        }
        Collections.sort(list, new Comparator<Article>(){
            public int compare(Article a1, Article a2) {
                return a2.getArticleId()-a1.getArticleId();
            }
        });
        System.out.println(articleService.findArticleByKeyWordSize(keyword)+"keywordtaioshu");
        PageInfo<Article> plist = new PageInfo<>(list);
        request.setAttribute("articlelist", plist.getList());
        int articlePageNum;
        if(articleService.findArticleByKeyWordSize(keyword)%pageSize==0){
            articlePageNum=articleService.findArticleByKeyWordSize(keyword)/pageSize;
        }else{
            articlePageNum=articleService.findArticleByKeyWordSize(keyword)/pageSize+1;
        }
        request.setAttribute("pageSize",articlePageNum);
        request.setAttribute("currPage",pn);
        request.setAttribute("topListHot",findTopHotArticle(request));
        //这里设置展示的分类
        request.setAttribute("keyword",keyword);
        request.setAttribute("categorysList",allCategory());
        return "/user/search_list";
        //把得到的查询结果进行分页
    }
    public List<Article> findTopHotArticle(HttpServletRequest request) throws ParseException {
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
}
