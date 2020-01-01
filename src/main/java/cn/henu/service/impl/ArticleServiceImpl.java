package cn.henu.service.impl;

import cn.henu.dao.ArticleMapper;
import cn.henu.dao.ArticlecategoryrefMapper;
import cn.henu.pojo.Article;
import cn.henu.pojo.Articlecategoryref;
import cn.henu.pojo.Category;
import cn.henu.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ArticlecategoryrefMapper articlecategoryrefMapper;

    @Override
    public List<Article> findAllArticle() {
        List<Article> list=new LinkedList<Article>();
        List<Article> listRight=new LinkedList<Article>();
        list=articleMapper.selectAll();
        for (int i=0;i<list.size();i++){
            if(list.get(i).getArticleStatus()==1){
                listRight.add(list.get(i));
            }
        }
        return listRight;
    }
    @Override
    public int countArticle() {
        List<Article> list=new LinkedList<Article>();
        List<Article> listRight=new LinkedList<Article>();
        list=articleMapper.selectAll();
        for (int i=0;i<list.size();i++){
            if(list.get(i).getArticleStatus()==1){
                listRight.add(list.get(i));
            }
        }
        return listRight.size();
    }

    @Override
    public int addArticle(Article article, Category category) {
        return articleMapper.insert(article);
    }

    @Override
    public Article findById(int id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateViewCount(int id, int count) {
        return articleMapper.updateViewCount(id,count);
    }

    @Override
    public int delByArticleId(int articleId) {
        return articleMapper.deleteByPrimaryKey(articleId);
    }

    @Override
    public int updateByPrimaryKey(Article article) {
        return articleMapper.updateByPrimaryKey(article);
    }

    @Override
    public int findArticleByKeyWordSize(String keyword) {
        return articleMapper.findArticleByKeyWord(keyword).size();
    }

    @Override
    public List<Article> findArticleByKeyWord(String keyword) {
        return articleMapper.findArticleByKeyWord(keyword);
    }

    @Override
    public List<Article> findArticleByCategoryId(int categoryId) {
        List<Articlecategoryref> articlecategoryrefs = articlecategoryrefMapper.selectByCategoryId(categoryId);
        List<Article> listCategorys=new LinkedList<Article>();
        for(int i=0;i<articlecategoryrefs.size();i++){
            listCategorys.add(articleMapper.selectByPrimaryKey(articlecategoryrefs.get(i).getArticleId()));
        }
        return listCategorys;
    }
}
