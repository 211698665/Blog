package cn.henu.service;

import cn.henu.pojo.Article;
import cn.henu.pojo.Category;

import java.util.List;

public interface ArticleService {
    List<Article> findAllArticle();
    int countArticle();
    int addArticle(Article article, Category category);
    Article findById(int id);
    int updateViewCount(int id,int count);
    int delByArticleId(int articleId);
    int updateByPrimaryKey(Article article);
    int findArticleByKeyWordSize(String keyword);
    List<Article> findArticleByKeyWord(String keyword);
    List<Article> findArticleByCategoryId(int categoryId);
}
