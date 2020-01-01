package cn.henu.controller.user;

import cn.henu.pojo.Article;
import cn.henu.pojo.Category;
import cn.henu.pojo.Notice;
import cn.henu.pojo.Photo;
import cn.henu.service.*;
import cn.henu.vo.ArticleVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
public class UserIndexController {

    @Autowired
    private ArticleService articleService;
    @Autowired
    private PictureService pictureService;
    @Autowired
    private SortService sortService;
    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/user/index")
    public String index(@RequestParam(required = false,defaultValue = "1",value = "pn")Integer pn, @RequestParam(defaultValue = "4") Integer pageSize, HttpServletRequest request)throws  Exception{
        Page<Article> page = PageHelper.startPage(pn, pageSize);
        List<Article> articles=new LinkedList<Article>();
        articles=articleService.findAllArticle();
        //这里借用articleKeywords来保存文章类名
        for (int i=0;i<articles.size();i++){
            //先从文章中把所属类ID取出来,ArticleLike属性中
            String categoryName=sortService.findByCategoryId(articles.get(i).getArticleLike()).getCategoryName();
            //把查询到的名称放到articleKeyword属性中
            articles.get(i).setArticleKeyword(categoryName);
        }
        Collections.sort(articles, new Comparator<Article>() {
            @Override
            public int compare(Article o1, Article o2) {
                return o2.getArticleId()-o1.getArticleId();
            }
        });
        PageInfo<Article> plist = new PageInfo<>(articles);
        request.setAttribute("articlelist", plist.getList());
        int articlePageNum;
        if(articleService.countArticle()%pageSize==0){
            articlePageNum=articleService.countArticle()/pageSize;
        }else{
            articlePageNum=articleService.countArticle()/pageSize+1;
        }
        //把最新加入的前四个图片放出来
        List<Photo> allPhoto = pictureService.findAllPhoto();
        List<Photo> allPhotoTop=new LinkedList<Photo>();
        Collections.sort(allPhoto);
        for(int i=1;i<4;i++){
            allPhotoTop.add(allPhoto.get(i));
        }
        //这里使用一个单独的photo来设置前台的active属性
        request.setAttribute("photoOne",allPhoto.get(0));
        request.setAttribute("topPhoto",allPhotoTop);
        //加载最新通知
        List<Notice> allNotice = noticeService.findAllNotice();
        Collections.sort(allNotice, new Comparator<Notice>() {
            @Override
            public int compare(Notice o1, Notice o2) {
                return o2.getNoticeId()-o1.getNoticeId();
            }
        });
        request.setAttribute("noticeTop",allNotice.get(0));
        request.setAttribute("pageSize",articlePageNum);
        request.setAttribute("currPage",pn);
        request.setAttribute("topListHot",findTopHotArticle(request));
        //这里设置展示的分类
        request.setAttribute("categorysList",allCategory());
        return "/user/index";
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
