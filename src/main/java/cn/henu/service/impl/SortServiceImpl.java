package cn.henu.service.impl;

import cn.henu.dao.ArticleMapper;
import cn.henu.dao.ArticlecategoryrefMapper;
import cn.henu.dao.CategoryMapper;
import cn.henu.dao.CommentMapper;
import cn.henu.pojo.Articlecategoryref;
import cn.henu.pojo.Category;
import cn.henu.service.SortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortServiceImpl  implements SortService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private ArticlecategoryrefMapper articlecategoryrefMapper;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public String addCategory(Category category) {
        return categoryMapper.insert(category)>0?"success":"fail";
    }
    @Override
    public List<Category> findAll() {
        return categoryMapper.selectAll();
    }

    @Override
    public int countBlogInCategory(int categoryId) {
        return articlecategoryrefMapper.selectByCategoryId(categoryId).size();
    }

    @Override
    public Articlecategoryref findByArticleId(int articleId) {
        return articlecategoryrefMapper.selectByArticleId(articleId);
    }

    @Override
    public Category findByCategoryId(int categoryId) {
        return categoryMapper.selectByPrimaryKey(categoryId);
    }

    @Override
    public int delCategoryById(int categoryId) {
        //先获取每一类对应的所有文章，后删除articlecategoryref表中的关系
        List<Articlecategoryref> articlecategoryrefs=articlecategoryrefMapper.selectByCategoryId(categoryId);
        articlecategoryrefMapper.deleteByCategoryId(categoryId);
        //删除评论表中所有该类文章下的所有评论
        for (int i=0;i<articlecategoryrefs.size();i++){
            commentMapper.delCommentByArticleId(articlecategoryrefs.get(i).getArticleId());
        }
        //删除对应的文章
        for (int i=0;i<articlecategoryrefs.size();i++){
            articleMapper.deleteByPrimaryKey(articlecategoryrefs.get(i).getArticleId());
        }

        //删除类
        return categoryMapper.deleteByPrimaryKey(categoryId);
    }

    @Override
    public int updateByCategoryId(Category category) {
        return categoryMapper.updateByPrimaryKey(category);
    }

    @Override
    public int countCategorys() {
        return categoryMapper.countCategorys().size();
    }
}
