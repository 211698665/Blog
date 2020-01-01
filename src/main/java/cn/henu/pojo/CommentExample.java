package cn.henu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
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

        public Criteria andCommentNameIsNull() {
            addCriterion("comment_name is null");
            return (Criteria) this;
        }

        public Criteria andCommentNameIsNotNull() {
            addCriterion("comment_name is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNameEqualTo(String value) {
            addCriterion("comment_name =", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotEqualTo(String value) {
            addCriterion("comment_name <>", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameGreaterThan(String value) {
            addCriterion("comment_name >", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameGreaterThanOrEqualTo(String value) {
            addCriterion("comment_name >=", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameLessThan(String value) {
            addCriterion("comment_name <", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameLessThanOrEqualTo(String value) {
            addCriterion("comment_name <=", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameLike(String value) {
            addCriterion("comment_name like", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotLike(String value) {
            addCriterion("comment_name not like", value, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameIn(List<String> values) {
            addCriterion("comment_name in", values, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotIn(List<String> values) {
            addCriterion("comment_name not in", values, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameBetween(String value1, String value2) {
            addCriterion("comment_name between", value1, value2, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentNameNotBetween(String value1, String value2) {
            addCriterion("comment_name not between", value1, value2, "commentName");
            return (Criteria) this;
        }

        public Criteria andCommentQqIsNull() {
            addCriterion("comment_qq is null");
            return (Criteria) this;
        }

        public Criteria andCommentQqIsNotNull() {
            addCriterion("comment_qq is not null");
            return (Criteria) this;
        }

        public Criteria andCommentQqEqualTo(String value) {
            addCriterion("comment_qq =", value, "commentQq");
            return (Criteria) this;
        }

        public Criteria andCommentQqNotEqualTo(String value) {
            addCriterion("comment_qq <>", value, "commentQq");
            return (Criteria) this;
        }

        public Criteria andCommentQqGreaterThan(String value) {
            addCriterion("comment_qq >", value, "commentQq");
            return (Criteria) this;
        }

        public Criteria andCommentQqGreaterThanOrEqualTo(String value) {
            addCriterion("comment_qq >=", value, "commentQq");
            return (Criteria) this;
        }

        public Criteria andCommentQqLessThan(String value) {
            addCriterion("comment_qq <", value, "commentQq");
            return (Criteria) this;
        }

        public Criteria andCommentQqLessThanOrEqualTo(String value) {
            addCriterion("comment_qq <=", value, "commentQq");
            return (Criteria) this;
        }

        public Criteria andCommentQqLike(String value) {
            addCriterion("comment_qq like", value, "commentQq");
            return (Criteria) this;
        }

        public Criteria andCommentQqNotLike(String value) {
            addCriterion("comment_qq not like", value, "commentQq");
            return (Criteria) this;
        }

        public Criteria andCommentQqIn(List<String> values) {
            addCriterion("comment_qq in", values, "commentQq");
            return (Criteria) this;
        }

        public Criteria andCommentQqNotIn(List<String> values) {
            addCriterion("comment_qq not in", values, "commentQq");
            return (Criteria) this;
        }

        public Criteria andCommentQqBetween(String value1, String value2) {
            addCriterion("comment_qq between", value1, value2, "commentQq");
            return (Criteria) this;
        }

        public Criteria andCommentQqNotBetween(String value1, String value2) {
            addCriterion("comment_qq not between", value1, value2, "commentQq");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNull() {
            addCriterion("comment_content is null");
            return (Criteria) this;
        }

        public Criteria andCommentContentIsNotNull() {
            addCriterion("comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andCommentContentEqualTo(String value) {
            addCriterion("comment_content =", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotEqualTo(String value) {
            addCriterion("comment_content <>", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThan(String value) {
            addCriterion("comment_content >", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("comment_content >=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThan(String value) {
            addCriterion("comment_content <", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLessThanOrEqualTo(String value) {
            addCriterion("comment_content <=", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentLike(String value) {
            addCriterion("comment_content like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotLike(String value) {
            addCriterion("comment_content not like", value, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentIn(List<String> values) {
            addCriterion("comment_content in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotIn(List<String> values) {
            addCriterion("comment_content not in", values, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentBetween(String value1, String value2) {
            addCriterion("comment_content between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentContentNotBetween(String value1, String value2) {
            addCriterion("comment_content not between", value1, value2, "commentContent");
            return (Criteria) this;
        }

        public Criteria andCommentHeadIsNull() {
            addCriterion("comment_head is null");
            return (Criteria) this;
        }

        public Criteria andCommentHeadIsNotNull() {
            addCriterion("comment_head is not null");
            return (Criteria) this;
        }

        public Criteria andCommentHeadEqualTo(String value) {
            addCriterion("comment_head =", value, "commentHead");
            return (Criteria) this;
        }

        public Criteria andCommentHeadNotEqualTo(String value) {
            addCriterion("comment_head <>", value, "commentHead");
            return (Criteria) this;
        }

        public Criteria andCommentHeadGreaterThan(String value) {
            addCriterion("comment_head >", value, "commentHead");
            return (Criteria) this;
        }

        public Criteria andCommentHeadGreaterThanOrEqualTo(String value) {
            addCriterion("comment_head >=", value, "commentHead");
            return (Criteria) this;
        }

        public Criteria andCommentHeadLessThan(String value) {
            addCriterion("comment_head <", value, "commentHead");
            return (Criteria) this;
        }

        public Criteria andCommentHeadLessThanOrEqualTo(String value) {
            addCriterion("comment_head <=", value, "commentHead");
            return (Criteria) this;
        }

        public Criteria andCommentHeadLike(String value) {
            addCriterion("comment_head like", value, "commentHead");
            return (Criteria) this;
        }

        public Criteria andCommentHeadNotLike(String value) {
            addCriterion("comment_head not like", value, "commentHead");
            return (Criteria) this;
        }

        public Criteria andCommentHeadIn(List<String> values) {
            addCriterion("comment_head in", values, "commentHead");
            return (Criteria) this;
        }

        public Criteria andCommentHeadNotIn(List<String> values) {
            addCriterion("comment_head not in", values, "commentHead");
            return (Criteria) this;
        }

        public Criteria andCommentHeadBetween(String value1, String value2) {
            addCriterion("comment_head between", value1, value2, "commentHead");
            return (Criteria) this;
        }

        public Criteria andCommentHeadNotBetween(String value1, String value2) {
            addCriterion("comment_head not between", value1, value2, "commentHead");
            return (Criteria) this;
        }

        public Criteria andCommentIpIsNull() {
            addCriterion("comment_ip is null");
            return (Criteria) this;
        }

        public Criteria andCommentIpIsNotNull() {
            addCriterion("comment_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIpEqualTo(String value) {
            addCriterion("comment_ip =", value, "commentIp");
            return (Criteria) this;
        }

        public Criteria andCommentIpNotEqualTo(String value) {
            addCriterion("comment_ip <>", value, "commentIp");
            return (Criteria) this;
        }

        public Criteria andCommentIpGreaterThan(String value) {
            addCriterion("comment_ip >", value, "commentIp");
            return (Criteria) this;
        }

        public Criteria andCommentIpGreaterThanOrEqualTo(String value) {
            addCriterion("comment_ip >=", value, "commentIp");
            return (Criteria) this;
        }

        public Criteria andCommentIpLessThan(String value) {
            addCriterion("comment_ip <", value, "commentIp");
            return (Criteria) this;
        }

        public Criteria andCommentIpLessThanOrEqualTo(String value) {
            addCriterion("comment_ip <=", value, "commentIp");
            return (Criteria) this;
        }

        public Criteria andCommentIpLike(String value) {
            addCriterion("comment_ip like", value, "commentIp");
            return (Criteria) this;
        }

        public Criteria andCommentIpNotLike(String value) {
            addCriterion("comment_ip not like", value, "commentIp");
            return (Criteria) this;
        }

        public Criteria andCommentIpIn(List<String> values) {
            addCriterion("comment_ip in", values, "commentIp");
            return (Criteria) this;
        }

        public Criteria andCommentIpNotIn(List<String> values) {
            addCriterion("comment_ip not in", values, "commentIp");
            return (Criteria) this;
        }

        public Criteria andCommentIpBetween(String value1, String value2) {
            addCriterion("comment_ip between", value1, value2, "commentIp");
            return (Criteria) this;
        }

        public Criteria andCommentIpNotBetween(String value1, String value2) {
            addCriterion("comment_ip not between", value1, value2, "commentIp");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeIsNull() {
            addCriterion("comment_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeIsNotNull() {
            addCriterion("comment_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeEqualTo(Date value) {
            addCriterion("comment_create_time =", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeNotEqualTo(Date value) {
            addCriterion("comment_create_time <>", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeGreaterThan(Date value) {
            addCriterion("comment_create_time >", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_create_time >=", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeLessThan(Date value) {
            addCriterion("comment_create_time <", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("comment_create_time <=", value, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeIn(List<Date> values) {
            addCriterion("comment_create_time in", values, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeNotIn(List<Date> values) {
            addCriterion("comment_create_time not in", values, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeBetween(Date value1, Date value2) {
            addCriterion("comment_create_time between", value1, value2, "commentCreateTime");
            return (Criteria) this;
        }

        public Criteria andCommentCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("comment_create_time not between", value1, value2, "commentCreateTime");
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