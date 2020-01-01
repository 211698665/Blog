package cn.henu.controller.user;

import cn.henu.pojo.Article;
import cn.henu.pojo.Category;
import cn.henu.pojo.Saying;
import cn.henu.pojo.Timeline;
import cn.henu.service.ArticleService;
import cn.henu.service.SortService;
import cn.henu.service.TimelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class UserTimeController {

    @Autowired
    private TimelineService timelineService;
    @Autowired
    private ArticleService articleService;
    @Autowired
    private SortService sortService;
    @RequestMapping("/user/time")
    public String  userTime(HttpServletRequest request) throws ParseException {
        List<Saying> listSayings=timelineService.findAllSaying();
        for (int i=0;i<listSayings.size();i++){
            listSayings.get(i).setSayingAuthor(byteStringUtils(listSayings.get(i).getSayingAuthor()));
            listSayings.get(i).setSayingContent(byteStringUtils(listSayings.get(i).getSayingContent()));
        }
        List<Timeline> listTimelines=timelineService.findAllTimeLine();
        SimpleDateFormat formatdate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date="";
        for (int i=0;i<listTimelines.size();i++){
            date=formatdate.format(listTimelines.get(i).getTimelineUpdateTime());
            Date newDate=formatdate.parse(date);
            java.sql.Date formaldate=new java.sql.Date(newDate.getTime());
            listTimelines.get(i).setTimelineUpdateTime(formaldate);
        }
        request.setAttribute("sayings",listSayings);
        request.setAttribute("timelines",listTimelines);
        request.setAttribute("topListHot",findTopHotArticle(request));
        request.setAttribute("categorysList",allCategory());
        return "/user/user_time";
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
    public String byteStringUtils(String str){
        char [] arr=str.toCharArray();
        String str2="";
        for (char c:arr) {
            str2+=c+" ";
        }
        return str2;
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
