package cn.henu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SayingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SayingExample() {
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

        public Criteria andSayingIdIsNull() {
            addCriterion("saying_id is null");
            return (Criteria) this;
        }

        public Criteria andSayingIdIsNotNull() {
            addCriterion("saying_id is not null");
            return (Criteria) this;
        }

        public Criteria andSayingIdEqualTo(Integer value) {
            addCriterion("saying_id =", value, "sayingId");
            return (Criteria) this;
        }

        public Criteria andSayingIdNotEqualTo(Integer value) {
            addCriterion("saying_id <>", value, "sayingId");
            return (Criteria) this;
        }

        public Criteria andSayingIdGreaterThan(Integer value) {
            addCriterion("saying_id >", value, "sayingId");
            return (Criteria) this;
        }

        public Criteria andSayingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("saying_id >=", value, "sayingId");
            return (Criteria) this;
        }

        public Criteria andSayingIdLessThan(Integer value) {
            addCriterion("saying_id <", value, "sayingId");
            return (Criteria) this;
        }

        public Criteria andSayingIdLessThanOrEqualTo(Integer value) {
            addCriterion("saying_id <=", value, "sayingId");
            return (Criteria) this;
        }

        public Criteria andSayingIdIn(List<Integer> values) {
            addCriterion("saying_id in", values, "sayingId");
            return (Criteria) this;
        }

        public Criteria andSayingIdNotIn(List<Integer> values) {
            addCriterion("saying_id not in", values, "sayingId");
            return (Criteria) this;
        }

        public Criteria andSayingIdBetween(Integer value1, Integer value2) {
            addCriterion("saying_id between", value1, value2, "sayingId");
            return (Criteria) this;
        }

        public Criteria andSayingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("saying_id not between", value1, value2, "sayingId");
            return (Criteria) this;
        }

        public Criteria andSayingAuthorIsNull() {
            addCriterion("saying_author is null");
            return (Criteria) this;
        }

        public Criteria andSayingAuthorIsNotNull() {
            addCriterion("saying_author is not null");
            return (Criteria) this;
        }

        public Criteria andSayingAuthorEqualTo(String value) {
            addCriterion("saying_author =", value, "sayingAuthor");
            return (Criteria) this;
        }

        public Criteria andSayingAuthorNotEqualTo(String value) {
            addCriterion("saying_author <>", value, "sayingAuthor");
            return (Criteria) this;
        }

        public Criteria andSayingAuthorGreaterThan(String value) {
            addCriterion("saying_author >", value, "sayingAuthor");
            return (Criteria) this;
        }

        public Criteria andSayingAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("saying_author >=", value, "sayingAuthor");
            return (Criteria) this;
        }

        public Criteria andSayingAuthorLessThan(String value) {
            addCriterion("saying_author <", value, "sayingAuthor");
            return (Criteria) this;
        }

        public Criteria andSayingAuthorLessThanOrEqualTo(String value) {
            addCriterion("saying_author <=", value, "sayingAuthor");
            return (Criteria) this;
        }

        public Criteria andSayingAuthorLike(String value) {
            addCriterion("saying_author like", value, "sayingAuthor");
            return (Criteria) this;
        }

        public Criteria andSayingAuthorNotLike(String value) {
            addCriterion("saying_author not like", value, "sayingAuthor");
            return (Criteria) this;
        }

        public Criteria andSayingAuthorIn(List<String> values) {
            addCriterion("saying_author in", values, "sayingAuthor");
            return (Criteria) this;
        }

        public Criteria andSayingAuthorNotIn(List<String> values) {
            addCriterion("saying_author not in", values, "sayingAuthor");
            return (Criteria) this;
        }

        public Criteria andSayingAuthorBetween(String value1, String value2) {
            addCriterion("saying_author between", value1, value2, "sayingAuthor");
            return (Criteria) this;
        }

        public Criteria andSayingAuthorNotBetween(String value1, String value2) {
            addCriterion("saying_author not between", value1, value2, "sayingAuthor");
            return (Criteria) this;
        }

        public Criteria andSayingContentIsNull() {
            addCriterion("saying_content is null");
            return (Criteria) this;
        }

        public Criteria andSayingContentIsNotNull() {
            addCriterion("saying_content is not null");
            return (Criteria) this;
        }

        public Criteria andSayingContentEqualTo(String value) {
            addCriterion("saying_content =", value, "sayingContent");
            return (Criteria) this;
        }

        public Criteria andSayingContentNotEqualTo(String value) {
            addCriterion("saying_content <>", value, "sayingContent");
            return (Criteria) this;
        }

        public Criteria andSayingContentGreaterThan(String value) {
            addCriterion("saying_content >", value, "sayingContent");
            return (Criteria) this;
        }

        public Criteria andSayingContentGreaterThanOrEqualTo(String value) {
            addCriterion("saying_content >=", value, "sayingContent");
            return (Criteria) this;
        }

        public Criteria andSayingContentLessThan(String value) {
            addCriterion("saying_content <", value, "sayingContent");
            return (Criteria) this;
        }

        public Criteria andSayingContentLessThanOrEqualTo(String value) {
            addCriterion("saying_content <=", value, "sayingContent");
            return (Criteria) this;
        }

        public Criteria andSayingContentLike(String value) {
            addCriterion("saying_content like", value, "sayingContent");
            return (Criteria) this;
        }

        public Criteria andSayingContentNotLike(String value) {
            addCriterion("saying_content not like", value, "sayingContent");
            return (Criteria) this;
        }

        public Criteria andSayingContentIn(List<String> values) {
            addCriterion("saying_content in", values, "sayingContent");
            return (Criteria) this;
        }

        public Criteria andSayingContentNotIn(List<String> values) {
            addCriterion("saying_content not in", values, "sayingContent");
            return (Criteria) this;
        }

        public Criteria andSayingContentBetween(String value1, String value2) {
            addCriterion("saying_content between", value1, value2, "sayingContent");
            return (Criteria) this;
        }

        public Criteria andSayingContentNotBetween(String value1, String value2) {
            addCriterion("saying_content not between", value1, value2, "sayingContent");
            return (Criteria) this;
        }

        public Criteria andSayingUpdateTimeIsNull() {
            addCriterion("saying_update_time is null");
            return (Criteria) this;
        }

        public Criteria andSayingUpdateTimeIsNotNull() {
            addCriterion("saying_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andSayingUpdateTimeEqualTo(Date value) {
            addCriterion("saying_update_time =", value, "sayingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSayingUpdateTimeNotEqualTo(Date value) {
            addCriterion("saying_update_time <>", value, "sayingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSayingUpdateTimeGreaterThan(Date value) {
            addCriterion("saying_update_time >", value, "sayingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSayingUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("saying_update_time >=", value, "sayingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSayingUpdateTimeLessThan(Date value) {
            addCriterion("saying_update_time <", value, "sayingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSayingUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("saying_update_time <=", value, "sayingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSayingUpdateTimeIn(List<Date> values) {
            addCriterion("saying_update_time in", values, "sayingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSayingUpdateTimeNotIn(List<Date> values) {
            addCriterion("saying_update_time not in", values, "sayingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSayingUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("saying_update_time between", value1, value2, "sayingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSayingUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("saying_update_time not between", value1, value2, "sayingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andSayingCreateTimeIsNull() {
            addCriterion("saying_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSayingCreateTimeIsNotNull() {
            addCriterion("saying_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSayingCreateTimeEqualTo(Date value) {
            addCriterion("saying_create_time =", value, "sayingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSayingCreateTimeNotEqualTo(Date value) {
            addCriterion("saying_create_time <>", value, "sayingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSayingCreateTimeGreaterThan(Date value) {
            addCriterion("saying_create_time >", value, "sayingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSayingCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("saying_create_time >=", value, "sayingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSayingCreateTimeLessThan(Date value) {
            addCriterion("saying_create_time <", value, "sayingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSayingCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("saying_create_time <=", value, "sayingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSayingCreateTimeIn(List<Date> values) {
            addCriterion("saying_create_time in", values, "sayingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSayingCreateTimeNotIn(List<Date> values) {
            addCriterion("saying_create_time not in", values, "sayingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSayingCreateTimeBetween(Date value1, Date value2) {
            addCriterion("saying_create_time between", value1, value2, "sayingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSayingCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("saying_create_time not between", value1, value2, "sayingCreateTime");
            return (Criteria) this;
        }

        public Criteria andSayingStatusIsNull() {
            addCriterion("saying_status is null");
            return (Criteria) this;
        }

        public Criteria andSayingStatusIsNotNull() {
            addCriterion("saying_status is not null");
            return (Criteria) this;
        }

        public Criteria andSayingStatusEqualTo(Integer value) {
            addCriterion("saying_status =", value, "sayingStatus");
            return (Criteria) this;
        }

        public Criteria andSayingStatusNotEqualTo(Integer value) {
            addCriterion("saying_status <>", value, "sayingStatus");
            return (Criteria) this;
        }

        public Criteria andSayingStatusGreaterThan(Integer value) {
            addCriterion("saying_status >", value, "sayingStatus");
            return (Criteria) this;
        }

        public Criteria andSayingStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("saying_status >=", value, "sayingStatus");
            return (Criteria) this;
        }

        public Criteria andSayingStatusLessThan(Integer value) {
            addCriterion("saying_status <", value, "sayingStatus");
            return (Criteria) this;
        }

        public Criteria andSayingStatusLessThanOrEqualTo(Integer value) {
            addCriterion("saying_status <=", value, "sayingStatus");
            return (Criteria) this;
        }

        public Criteria andSayingStatusIn(List<Integer> values) {
            addCriterion("saying_status in", values, "sayingStatus");
            return (Criteria) this;
        }

        public Criteria andSayingStatusNotIn(List<Integer> values) {
            addCriterion("saying_status not in", values, "sayingStatus");
            return (Criteria) this;
        }

        public Criteria andSayingStatusBetween(Integer value1, Integer value2) {
            addCriterion("saying_status between", value1, value2, "sayingStatus");
            return (Criteria) this;
        }

        public Criteria andSayingStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("saying_status not between", value1, value2, "sayingStatus");
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