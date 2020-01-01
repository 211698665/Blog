package cn.henu.service.impl;

import cn.henu.dao.ArticlecategoryrefMapper;
import cn.henu.pojo.Articlecategoryref;
import cn.henu.service.ArticleAndCotegoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleAndCotegoryServiceImlp implements ArticleAndCotegoryService {
    @Autowired
    private ArticlecategoryrefMapper articlecategoryrefMapper;

    @Override
    public int insert(Articlecategoryref articlecategoryref) {
        return articlecategoryrefMapper.insert(articlecategoryref);
    }

    @Override
    public List<Articlecategoryref> selectByCategoryId(int id) {
        return articlecategoryrefMapper.selectByCategoryId(id);
    }

    @Override
    public Articlecategoryref selectByArticleId(int articleId) {
        return articlecategoryrefMapper.selectByArticleId(articleId);
    }

    @Override
    public int deleteByArticleId(int articleId) {
        return articlecategoryrefMapper.deleteByArticleId(articleId);
    }

    @Override
    public int updateCategoryAndArticleByArticleId(Articlecategoryref articlecategoryref) {
        return articlecategoryrefMapper.updateCategoryAndArticleByArticleId(articlecategoryref);
    }
}
