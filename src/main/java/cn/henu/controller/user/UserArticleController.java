package cn.henu.controller.user;

import cn.henu.pojo.Article;
import cn.henu.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Controller
public class UserArticleController {
    @Autowired
    private ArticleService articleService;

    public void findTopHotPhoto( HttpServletRequest request){
        List list=new LinkedList<Article>();
        list=articleService.findAllArticle();
        Collections.sort(list);
        List <Article> listTop= new LinkedList<Article>();
        for (int i=0;i<3;i++){
            listTop.set(i, (Article) list.get(i));
        }
    }
}
