package cn.henu.pojo;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CategoryExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryPidIsNull() {
            addCriterion("category_pid is null");
            return (Criteria) this;
        }

        public Criteria andCategoryPidIsNotNull() {
            addCriterion("category_pid is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryPidEqualTo(Integer value) {
            addCriterion("category_pid =", value, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidNotEqualTo(Integer value) {
            addCriterion("category_pid <>", value, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidGreaterThan(Integer value) {
            addCriterion("category_pid >", value, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_pid >=", value, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidLessThan(Integer value) {
            addCriterion("category_pid <", value, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidLessThanOrEqualTo(Integer value) {
            addCriterion("category_pid <=", value, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidIn(List<Integer> values) {
            addCriterion("category_pid in", values, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidNotIn(List<Integer> values) {
            addCriterion("category_pid not in", values, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidBetween(Integer value1, Integer value2) {
            addCriterion("category_pid between", value1, value2, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryPidNotBetween(Integer value1, Integer value2) {
            addCriterion("category_pid not between", value1, value2, "categoryPid");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryDescIsNull() {
            addCriterion("category_desc is null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescIsNotNull() {
            addCriterion("category_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescEqualTo(String value) {
            addCriterion("category_desc =", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotEqualTo(String value) {
            addCriterion("category_desc <>", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescGreaterThan(String value) {
            addCriterion("category_desc >", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescGreaterThanOrEqualTo(String value) {
            addCriterion("category_desc >=", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescLessThan(String value) {
            addCriterion("category_desc <", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescLessThanOrEqualTo(String value) {
            addCriterion("category_desc <=", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescLike(String value) {
            addCriterion("category_desc like", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotLike(String value) {
            addCriterion("category_desc not like", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescIn(List<String> values) {
            addCriterion("category_desc in", values, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotIn(List<String> values) {
            addCriterion("category_desc not in", values, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescBetween(String value1, String value2) {
            addCriterion("category_desc between", value1, value2, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotBetween(String value1, String value2) {
            addCriterion("category_desc not between", value1, value2, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryImgIsNull() {
            addCriterion("category_img is null");
            return (Criteria) this;
        }

        public Criteria andCategoryImgIsNotNull() {
            addCriterion("category_img is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryImgEqualTo(String value) {
            addCriterion("category_img =", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgNotEqualTo(String value) {
            addCriterion("category_img <>", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgGreaterThan(String value) {
            addCriterion("category_img >", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgGreaterThanOrEqualTo(String value) {
            addCriterion("category_img >=", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgLessThan(String value) {
            addCriterion("category_img <", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgLessThanOrEqualTo(String value) {
            addCriterion("category_img <=", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgLike(String value) {
            addCriterion("category_img like", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgNotLike(String value) {
            addCriterion("category_img not like", value, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgIn(List<String> values) {
            addCriterion("category_img in", values, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgNotIn(List<String> values) {
            addCriterion("category_img not in", values, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgBetween(String value1, String value2) {
            addCriterion("category_img between", value1, value2, "categoryImg");
            return (Criteria) this;
        }

        public Criteria andCategoryImgNotBetween(String value1, String value2) {
            addCriterion("category_img not between", value1, value2, "categoryImg");
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

        public Criteria andCategoryStatusIsNull() {
            addCriterion("category_status is null");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusIsNotNull() {
            addCriterion("category_status is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusEqualTo(Integer value) {
            addCriterion("category_status =", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusNotEqualTo(Integer value) {
            addCriterion("category_status <>", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusGreaterThan(Integer value) {
            addCriterion("category_status >", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_status >=", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusLessThan(Integer value) {
            addCriterion("category_status <", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusLessThanOrEqualTo(Integer value) {
            addCriterion("category_status <=", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusIn(List<Integer> values) {
            addCriterion("category_status in", values, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusNotIn(List<Integer> values) {
            addCriterion("category_status not in", values, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusBetween(Integer value1, Integer value2) {
            addCriterion("category_status between", value1, value2, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("category_status not between", value1, value2, "categoryStatus");
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