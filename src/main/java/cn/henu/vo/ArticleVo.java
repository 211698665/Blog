package cn.henu.vo;

import java.util.Comparator;
import java.util.Date;

public class ArticleVo implements Comparable<ArticleVo> {
    private Integer articleId;
    private Integer userId;
    private String articleTitle;
    private String articleSummary;
    private Integer articleLike;
    private Integer articleComment;
    private Integer articleClick;
    private String articleKeyword;
    private Date articleUpdatetime;
    private Date articleCreatetime;
    private String articleImage;
    private String articleContent;
    private Integer articleStatus;
    private String articleCategory;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary;
    }

    public Integer getArticleLike() {
        return articleLike;
    }

    public void setArticleLike(Integer articleLike) {
        this.articleLike = articleLike;
    }

    public Integer getArticleComment() {
        return articleComment;
    }

    public void setArticleComment(Integer articleComment) {
        this.articleComment = articleComment;
    }

    public Integer getArticleClick() {
        return articleClick;
    }

    public void setArticleClick(Integer articleClick) {
        this.articleClick = articleClick;
    }

    public String getArticleKeyword() {
        return articleKeyword;
    }

    public void setArticleKeyword(String articleKeyword) {
        this.articleKeyword = articleKeyword;
    }

    public Date getArticleUpdatetime() {
        return articleUpdatetime;
    }

    public void setArticleUpdatetime(Date articleUpdatetime) {
        this.articleUpdatetime = articleUpdatetime;
    }

    public Date getArticleCreatetime() {
        return articleCreatetime;
    }

    public void setArticleCreatetime(Date articleCreatetime) {
        this.articleCreatetime = articleCreatetime;
    }

    public String getArticleImage() {
        return articleImage;
    }

    public void setArticleImage(String articleImage) {
        this.articleImage = articleImage;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Integer getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;
    }

    @Override
    public String toString() {
        return "ArticleVo{" +
                "articleId=" + articleId +
                ", userId=" + userId +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleSummary='" + articleSummary + '\'' +
                ", articleLike=" + articleLike +
                ", articleComment=" + articleComment +
                ", articleClick=" + articleClick +
                ", articleKeyword='" + articleKeyword + '\'' +
                ", articleUpdatetime=" + articleUpdatetime +
                ", articleCreatetime=" + articleCreatetime +
                ", articleImage='" + articleImage + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleStatus=" + articleStatus +
                ", articleCategory='" + articleCategory + '\'' +
                '}';
    }


    @Override
    public int compareTo(ArticleVo o) {
        return o.getArticleId()-this.getArticleId();
    }
}
