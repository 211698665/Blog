package cn.henu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhotoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhotoExample() {
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

        public Criteria andPhotoIdIsNull() {
            addCriterion("photo_id is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIdIsNotNull() {
            addCriterion("photo_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoIdEqualTo(Integer value) {
            addCriterion("photo_id =", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdNotEqualTo(Integer value) {
            addCriterion("photo_id <>", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdGreaterThan(Integer value) {
            addCriterion("photo_id >", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("photo_id >=", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdLessThan(Integer value) {
            addCriterion("photo_id <", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdLessThanOrEqualTo(Integer value) {
            addCriterion("photo_id <=", value, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdIn(List<Integer> values) {
            addCriterion("photo_id in", values, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdNotIn(List<Integer> values) {
            addCriterion("photo_id not in", values, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdBetween(Integer value1, Integer value2) {
            addCriterion("photo_id between", value1, value2, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("photo_id not between", value1, value2, "photoId");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNull() {
            addCriterion("photo_url is null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNotNull() {
            addCriterion("photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlEqualTo(String value) {
            addCriterion("photo_url =", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotEqualTo(String value) {
            addCriterion("photo_url <>", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThan(String value) {
            addCriterion("photo_url >", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("photo_url >=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThan(String value) {
            addCriterion("photo_url <", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("photo_url <=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLike(String value) {
            addCriterion("photo_url like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotLike(String value) {
            addCriterion("photo_url not like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIn(List<String> values) {
            addCriterion("photo_url in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotIn(List<String> values) {
            addCriterion("photo_url not in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlBetween(String value1, String value2) {
            addCriterion("photo_url between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("photo_url not between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoTitleIsNull() {
            addCriterion("photo_title is null");
            return (Criteria) this;
        }

        public Criteria andPhotoTitleIsNotNull() {
            addCriterion("photo_title is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoTitleEqualTo(String value) {
            addCriterion("photo_title =", value, "photoTitle");
            return (Criteria) this;
        }

        public Criteria andPhotoTitleNotEqualTo(String value) {
            addCriterion("photo_title <>", value, "photoTitle");
            return (Criteria) this;
        }

        public Criteria andPhotoTitleGreaterThan(String value) {
            addCriterion("photo_title >", value, "photoTitle");
            return (Criteria) this;
        }

        public Criteria andPhotoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("photo_title >=", value, "photoTitle");
            return (Criteria) this;
        }

        public Criteria andPhotoTitleLessThan(String value) {
            addCriterion("photo_title <", value, "photoTitle");
            return (Criteria) this;
        }

        public Criteria andPhotoTitleLessThanOrEqualTo(String value) {
            addCriterion("photo_title <=", value, "photoTitle");
            return (Criteria) this;
        }

        public Criteria andPhotoTitleLike(String value) {
            addCriterion("photo_title like", value, "photoTitle");
            return (Criteria) this;
        }

        public Criteria andPhotoTitleNotLike(String value) {
            addCriterion("photo_title not like", value, "photoTitle");
            return (Criteria) this;
        }

        public Criteria andPhotoTitleIn(List<String> values) {
            addCriterion("photo_title in", values, "photoTitle");
            return (Criteria) this;
        }

        public Criteria andPhotoTitleNotIn(List<String> values) {
            addCriterion("photo_title not in", values, "photoTitle");
            return (Criteria) this;
        }

        public Criteria andPhotoTitleBetween(String value1, String value2) {
            addCriterion("photo_title between", value1, value2, "photoTitle");
            return (Criteria) this;
        }

        public Criteria andPhotoTitleNotBetween(String value1, String value2) {
            addCriterion("photo_title not between", value1, value2, "photoTitle");
            return (Criteria) this;
        }

        public Criteria andPhotoDescIsNull() {
            addCriterion("photo_desc is null");
            return (Criteria) this;
        }

        public Criteria andPhotoDescIsNotNull() {
            addCriterion("photo_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoDescEqualTo(String value) {
            addCriterion("photo_desc =", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescNotEqualTo(String value) {
            addCriterion("photo_desc <>", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescGreaterThan(String value) {
            addCriterion("photo_desc >", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescGreaterThanOrEqualTo(String value) {
            addCriterion("photo_desc >=", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescLessThan(String value) {
            addCriterion("photo_desc <", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescLessThanOrEqualTo(String value) {
            addCriterion("photo_desc <=", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescLike(String value) {
            addCriterion("photo_desc like", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescNotLike(String value) {
            addCriterion("photo_desc not like", value, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescIn(List<String> values) {
            addCriterion("photo_desc in", values, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescNotIn(List<String> values) {
            addCriterion("photo_desc not in", values, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescBetween(String value1, String value2) {
            addCriterion("photo_desc between", value1, value2, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoDescNotBetween(String value1, String value2) {
            addCriterion("photo_desc not between", value1, value2, "photoDesc");
            return (Criteria) this;
        }

        public Criteria andPhotoUpdateTimeIsNull() {
            addCriterion("photo_update_time is null");
            return (Criteria) this;
        }

        public Criteria andPhotoUpdateTimeIsNotNull() {
            addCriterion("photo_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoUpdateTimeEqualTo(Date value) {
            addCriterion("photo_update_time =", value, "photoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoUpdateTimeNotEqualTo(Date value) {
            addCriterion("photo_update_time <>", value, "photoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoUpdateTimeGreaterThan(Date value) {
            addCriterion("photo_update_time >", value, "photoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("photo_update_time >=", value, "photoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoUpdateTimeLessThan(Date value) {
            addCriterion("photo_update_time <", value, "photoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("photo_update_time <=", value, "photoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoUpdateTimeIn(List<Date> values) {
            addCriterion("photo_update_time in", values, "photoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoUpdateTimeNotIn(List<Date> values) {
            addCriterion("photo_update_time not in", values, "photoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("photo_update_time between", value1, value2, "photoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("photo_update_time not between", value1, value2, "photoUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoCreateTimeIsNull() {
            addCriterion("photo_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPhotoCreateTimeIsNotNull() {
            addCriterion("photo_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoCreateTimeEqualTo(Date value) {
            addCriterion("photo_create_time =", value, "photoCreateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoCreateTimeNotEqualTo(Date value) {
            addCriterion("photo_create_time <>", value, "photoCreateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoCreateTimeGreaterThan(Date value) {
            addCriterion("photo_create_time >", value, "photoCreateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("photo_create_time >=", value, "photoCreateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoCreateTimeLessThan(Date value) {
            addCriterion("photo_create_time <", value, "photoCreateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("photo_create_time <=", value, "photoCreateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoCreateTimeIn(List<Date> values) {
            addCriterion("photo_create_time in", values, "photoCreateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoCreateTimeNotIn(List<Date> values) {
            addCriterion("photo_create_time not in", values, "photoCreateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoCreateTimeBetween(Date value1, Date value2) {
            addCriterion("photo_create_time between", value1, value2, "photoCreateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("photo_create_time not between", value1, value2, "photoCreateTime");
            return (Criteria) this;
        }

        public Criteria andPhotoStatusIsNull() {
            addCriterion("photo_status is null");
            return (Criteria) this;
        }

        public Criteria andPhotoStatusIsNotNull() {
            addCriterion("photo_status is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoStatusEqualTo(Integer value) {
            addCriterion("photo_status =", value, "photoStatus");
            return (Criteria) this;
        }

        public Criteria andPhotoStatusNotEqualTo(Integer value) {
            addCriterion("photo_status <>", value, "photoStatus");
            return (Criteria) this;
        }

        public Criteria andPhotoStatusGreaterThan(Integer value) {
            addCriterion("photo_status >", value, "photoStatus");
            return (Criteria) this;
        }

        public Criteria andPhotoStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("photo_status >=", value, "photoStatus");
            return (Criteria) this;
        }

        public Criteria andPhotoStatusLessThan(Integer value) {
            addCriterion("photo_status <", value, "photoStatus");
            return (Criteria) this;
        }

        public Criteria andPhotoStatusLessThanOrEqualTo(Integer value) {
            addCriterion("photo_status <=", value, "photoStatus");
            return (Criteria) this;
        }

        public Criteria andPhotoStatusIn(List<Integer> values) {
            addCriterion("photo_status in", values, "photoStatus");
            return (Criteria) this;
        }

        public Criteria andPhotoStatusNotIn(List<Integer> values) {
            addCriterion("photo_status not in", values, "photoStatus");
            return (Criteria) this;
        }

        public Criteria andPhotoStatusBetween(Integer value1, Integer value2) {
            addCriterion("photo_status between", value1, value2, "photoStatus");
            return (Criteria) this;
        }

        public Criteria andPhotoStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("photo_status not between", value1, value2, "photoStatus");
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