package cn.henu.service;

import cn.henu.pojo.Articlecategoryref;

import java.util.List;

public interface ArticleAndCotegoryService {
    int insert(Articlecategoryref articlecategoryref);
    List<Articlecategoryref> selectByCategoryId(int id);
    Articlecategoryref selectByArticleId(int articleId);
    int deleteByArticleId(int articleId);
    int updateCategoryAndArticleByArticleId(Articlecategoryref articlecategoryref);
}
