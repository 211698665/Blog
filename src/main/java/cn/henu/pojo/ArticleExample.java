package cn.henu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Integer value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Integer value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Integer value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Integer> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNull() {
            addCriterion("article_title is null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIsNotNull() {
            addCriterion("article_title is not null");
            return (Criteria) this;
        }

        public Criteria andArticleTitleEqualTo(String value) {
            addCriterion("article_title =", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotEqualTo(String value) {
            addCriterion("article_title <>", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThan(String value) {
            addCriterion("article_title >", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleGreaterThanOrEqualTo(String value) {
            addCriterion("article_title >=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThan(String value) {
            addCriterion("article_title <", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLessThanOrEqualTo(String value) {
            addCriterion("article_title <=", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleLike(String value) {
            addCriterion("article_title like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotLike(String value) {
            addCriterion("article_title not like", value, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleIn(List<String> values) {
            addCriterion("article_title in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotIn(List<String> values) {
            addCriterion("article_title not in", values, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleBetween(String value1, String value2) {
            addCriterion("article_title between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleTitleNotBetween(String value1, String value2) {
            addCriterion("article_title not between", value1, value2, "articleTitle");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryIsNull() {
            addCriterion("article_summary is null");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryIsNotNull() {
            addCriterion("article_summary is not null");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryEqualTo(String value) {
            addCriterion("article_summary =", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryNotEqualTo(String value) {
            addCriterion("article_summary <>", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryGreaterThan(String value) {
            addCriterion("article_summary >", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("article_summary >=", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryLessThan(String value) {
            addCriterion("article_summary <", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryLessThanOrEqualTo(String value) {
            addCriterion("article_summary <=", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryLike(String value) {
            addCriterion("article_summary like", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryNotLike(String value) {
            addCriterion("article_summary not like", value, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryIn(List<String> values) {
            addCriterion("article_summary in", values, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryNotIn(List<String> values) {
            addCriterion("article_summary not in", values, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryBetween(String value1, String value2) {
            addCriterion("article_summary between", value1, value2, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleSummaryNotBetween(String value1, String value2) {
            addCriterion("article_summary not between", value1, value2, "articleSummary");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIsNull() {
            addCriterion("article_like is null");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIsNotNull() {
            addCriterion("article_like is not null");
            return (Criteria) this;
        }

        public Criteria andArticleLikeEqualTo(Integer value) {
            addCriterion("article_like =", value, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNotEqualTo(Integer value) {
            addCriterion("article_like <>", value, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeGreaterThan(Integer value) {
            addCriterion("article_like >", value, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_like >=", value, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeLessThan(Integer value) {
            addCriterion("article_like <", value, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeLessThanOrEqualTo(Integer value) {
            addCriterion("article_like <=", value, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeIn(List<Integer> values) {
            addCriterion("article_like in", values, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNotIn(List<Integer> values) {
            addCriterion("article_like not in", values, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeBetween(Integer value1, Integer value2) {
            addCriterion("article_like between", value1, value2, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("article_like not between", value1, value2, "articleLike");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIsNull() {
            addCriterion("article_comment is null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIsNotNull() {
            addCriterion("article_comment is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCommentEqualTo(Integer value) {
            addCriterion("article_comment =", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentNotEqualTo(Integer value) {
            addCriterion("article_comment <>", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentGreaterThan(Integer value) {
            addCriterion("article_comment >", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_comment >=", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLessThan(Integer value) {
            addCriterion("article_comment <", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentLessThanOrEqualTo(Integer value) {
            addCriterion("article_comment <=", value, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentIn(List<Integer> values) {
            addCriterion("article_comment in", values, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentNotIn(List<Integer> values) {
            addCriterion("article_comment not in", values, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentBetween(Integer value1, Integer value2) {
            addCriterion("article_comment between", value1, value2, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("article_comment not between", value1, value2, "articleComment");
            return (Criteria) this;
        }

        public Criteria andArticleClickIsNull() {
            addCriterion("article_click is null");
            return (Criteria) this;
        }

        public Criteria andArticleClickIsNotNull() {
            addCriterion("article_click is not null");
            return (Criteria) this;
        }

        public Criteria andArticleClickEqualTo(Integer value) {
            addCriterion("article_click =", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickNotEqualTo(Integer value) {
            addCriterion("article_click <>", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickGreaterThan(Integer value) {
            addCriterion("article_click >", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_click >=", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickLessThan(Integer value) {
            addCriterion("article_click <", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickLessThanOrEqualTo(Integer value) {
            addCriterion("article_click <=", value, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickIn(List<Integer> values) {
            addCriterion("article_click in", values, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickNotIn(List<Integer> values) {
            addCriterion("article_click not in", values, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickBetween(Integer value1, Integer value2) {
            addCriterion("article_click between", value1, value2, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleClickNotBetween(Integer value1, Integer value2) {
            addCriterion("article_click not between", value1, value2, "articleClick");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordIsNull() {
            addCriterion("article_keyword is null");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordIsNotNull() {
            addCriterion("article_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordEqualTo(String value) {
            addCriterion("article_keyword =", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordNotEqualTo(String value) {
            addCriterion("article_keyword <>", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordGreaterThan(String value) {
            addCriterion("article_keyword >", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("article_keyword >=", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordLessThan(String value) {
            addCriterion("article_keyword <", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordLessThanOrEqualTo(String value) {
            addCriterion("article_keyword <=", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordLike(String value) {
            addCriterion("article_keyword like", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordNotLike(String value) {
            addCriterion("article_keyword not like", value, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordIn(List<String> values) {
            addCriterion("article_keyword in", values, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordNotIn(List<String> values) {
            addCriterion("article_keyword not in", values, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordBetween(String value1, String value2) {
            addCriterion("article_keyword between", value1, value2, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleKeywordNotBetween(String value1, String value2) {
            addCriterion("article_keyword not between", value1, value2, "articleKeyword");
            return (Criteria) this;
        }

        public Criteria andArticleUpdatetimeIsNull() {
            addCriterion("article_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andArticleUpdatetimeIsNotNull() {
            addCriterion("article_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andArticleUpdatetimeEqualTo(Date value) {
            addCriterion("article_updatetime =", value, "articleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdatetimeNotEqualTo(Date value) {
            addCriterion("article_updatetime <>", value, "articleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdatetimeGreaterThan(Date value) {
            addCriterion("article_updatetime >", value, "articleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("article_updatetime >=", value, "articleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdatetimeLessThan(Date value) {
            addCriterion("article_updatetime <", value, "articleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("article_updatetime <=", value, "articleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdatetimeIn(List<Date> values) {
            addCriterion("article_updatetime in", values, "articleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdatetimeNotIn(List<Date> values) {
            addCriterion("article_updatetime not in", values, "articleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("article_updatetime between", value1, value2, "articleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andArticleUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("article_updatetime not between", value1, value2, "articleUpdatetime");
            return (Criteria) this;
        }

        public Criteria andArticleCreatetimeIsNull() {
            addCriterion("article_createtime is null");
            return (Criteria) this;
        }

        public Criteria andArticleCreatetimeIsNotNull() {
            addCriterion("article_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andArticleCreatetimeEqualTo(Date value) {
            addCriterion("article_createtime =", value, "articleCreatetime");
            return (Criteria) this;
        }

        public Criteria andArticleCreatetimeNotEqualTo(Date value) {
            addCriterion("article_createtime <>", value, "articleCreatetime");
            return (Criteria) this;
        }

        public Criteria andArticleCreatetimeGreaterThan(Date value) {
            addCriterion("article_createtime >", value, "articleCreatetime");
            return (Criteria) this;
        }

        public Criteria andArticleCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("article_createtime >=", value, "articleCreatetime");
            return (Criteria) this;
        }

        public Criteria andArticleCreatetimeLessThan(Date value) {
            addCriterion("article_createtime <", value, "articleCreatetime");
            return (Criteria) this;
        }

        public Criteria andArticleCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("article_createtime <=", value, "articleCreatetime");
            return (Criteria) this;
        }

        public Criteria andArticleCreatetimeIn(List<Date> values) {
            addCriterion("article_createtime in", values, "articleCreatetime");
            return (Criteria) this;
        }

        public Criteria andArticleCreatetimeNotIn(List<Date> values) {
            addCriterion("article_createtime not in", values, "articleCreatetime");
            return (Criteria) this;
        }

        public Criteria andArticleCreatetimeBetween(Date value1, Date value2) {
            addCriterion("article_createtime between", value1, value2, "articleCreatetime");
            return (Criteria) this;
        }

        public Criteria andArticleCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("article_createtime not between", value1, value2, "articleCreatetime");
            return (Criteria) this;
        }

        public Criteria andArticleStatusIsNull() {
            addCriterion("article_status is null");
            return (Criteria) this;
        }

        public Criteria andArticleStatusIsNotNull() {
            addCriterion("article_status is not null");
            return (Criteria) this;
        }

        public Criteria andArticleStatusEqualTo(Integer value) {
            addCriterion("article_status =", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusNotEqualTo(Integer value) {
            addCriterion("article_status <>", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusGreaterThan(Integer value) {
            addCriterion("article_status >", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_status >=", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusLessThan(Integer value) {
            addCriterion("article_status <", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("article_status <=", value, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusIn(List<Integer> values) {
            addCriterion("article_status in", values, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusNotIn(List<Integer> values) {
            addCriterion("article_status not in", values, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusBetween(Integer value1, Integer value2) {
            addCriterion("article_status between", value1, value2, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("article_status not between", value1, value2, "articleStatus");
            return (Criteria) this;
        }

        public Criteria andArticleImageIsNull() {
            addCriterion("article_image is null");
            return (Criteria) this;
        }

        public Criteria andArticleImageIsNotNull() {
            addCriterion("article_image is not null");
            return (Criteria) this;
        }

        public Criteria andArticleImageEqualTo(String value) {
            addCriterion("article_image =", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageNotEqualTo(String value) {
            addCriterion("article_image <>", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageGreaterThan(String value) {
            addCriterion("article_image >", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageGreaterThanOrEqualTo(String value) {
            addCriterion("article_image >=", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageLessThan(String value) {
            addCriterion("article_image <", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageLessThanOrEqualTo(String value) {
            addCriterion("article_image <=", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageLike(String value) {
            addCriterion("article_image like", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageNotLike(String value) {
            addCriterion("article_image not like", value, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageIn(List<String> values) {
            addCriterion("article_image in", values, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageNotIn(List<String> values) {
            addCriterion("article_image not in", values, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageBetween(String value1, String value2) {
            addCriterion("article_image between", value1, value2, "articleImage");
            return (Criteria) this;
        }

        public Criteria andArticleImageNotBetween(String value1, String value2) {
            addCriterion("article_image not between", value1, value2, "articleImage");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}