package cn.henu.service;

import cn.henu.pojo.Articlecategoryref;
import cn.henu.pojo.Category;

import java.util.List;

public interface SortService {
    String addCategory (Category category);
    List<Category> findAll();
    int countBlogInCategory(int categoryId);
    Articlecategoryref findByArticleId(int articleId);
    Category findByCategoryId(int categoryId);
    int delCategoryById(int categoryId);
    int updateByCategoryId(Category category);
    int countCategorys();
}
