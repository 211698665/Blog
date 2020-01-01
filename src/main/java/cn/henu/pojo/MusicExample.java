package cn.henu.pojo;

import java.util.ArrayList;
import java.util.List;

public class MusicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MusicExample() {
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

        public Criteria andMusicIdIsNull() {
            addCriterion("music_id is null");
            return (Criteria) this;
        }

        public Criteria andMusicIdIsNotNull() {
            addCriterion("music_id is not null");
            return (Criteria) this;
        }

        public Criteria andMusicIdEqualTo(Integer value) {
            addCriterion("music_id =", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdNotEqualTo(Integer value) {
            addCriterion("music_id <>", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdGreaterThan(Integer value) {
            addCriterion("music_id >", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("music_id >=", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdLessThan(Integer value) {
            addCriterion("music_id <", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdLessThanOrEqualTo(Integer value) {
            addCriterion("music_id <=", value, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdIn(List<Integer> values) {
            addCriterion("music_id in", values, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdNotIn(List<Integer> values) {
            addCriterion("music_id not in", values, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdBetween(Integer value1, Integer value2) {
            addCriterion("music_id between", value1, value2, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("music_id not between", value1, value2, "musicId");
            return (Criteria) this;
        }

        public Criteria andMusicStatusIsNull() {
            addCriterion("music_status is null");
            return (Criteria) this;
        }

        public Criteria andMusicStatusIsNotNull() {
            addCriterion("music_status is not null");
            return (Criteria) this;
        }

        public Criteria andMusicStatusEqualTo(Integer value) {
            addCriterion("music_status =", value, "musicStatus");
            return (Criteria) this;
        }

        public Criteria andMusicStatusNotEqualTo(Integer value) {
            addCriterion("music_status <>", value, "musicStatus");
            return (Criteria) this;
        }

        public Criteria andMusicStatusGreaterThan(Integer value) {
            addCriterion("music_status >", value, "musicStatus");
            return (Criteria) this;
        }

        public Criteria andMusicStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("music_status >=", value, "musicStatus");
            return (Criteria) this;
        }

        public Criteria andMusicStatusLessThan(Integer value) {
            addCriterion("music_status <", value, "musicStatus");
            return (Criteria) this;
        }

        public Criteria andMusicStatusLessThanOrEqualTo(Integer value) {
            addCriterion("music_status <=", value, "musicStatus");
            return (Criteria) this;
        }

        public Criteria andMusicStatusIn(List<Integer> values) {
            addCriterion("music_status in", values, "musicStatus");
            return (Criteria) this;
        }

        public Criteria andMusicStatusNotIn(List<Integer> values) {
            addCriterion("music_status not in", values, "musicStatus");
            return (Criteria) this;
        }

        public Criteria andMusicStatusBetween(Integer value1, Integer value2) {
            addCriterion("music_status between", value1, value2, "musicStatus");
            return (Criteria) this;
        }

        public Criteria andMusicStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("music_status not between", value1, value2, "musicStatus");
            return (Criteria) this;
        }

        public Criteria andMusicNameIsNull() {
            addCriterion("music_name is null");
            return (Criteria) this;
        }

        public Criteria andMusicNameIsNotNull() {
            addCriterion("music_name is not null");
            return (Criteria) this;
        }

        public Criteria andMusicNameEqualTo(String value) {
            addCriterion("music_name =", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotEqualTo(String value) {
            addCriterion("music_name <>", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameGreaterThan(String value) {
            addCriterion("music_name >", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameGreaterThanOrEqualTo(String value) {
            addCriterion("music_name >=", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameLessThan(String value) {
            addCriterion("music_name <", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameLessThanOrEqualTo(String value) {
            addCriterion("music_name <=", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameLike(String value) {
            addCriterion("music_name like", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotLike(String value) {
            addCriterion("music_name not like", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameIn(List<String> values) {
            addCriterion("music_name in", values, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotIn(List<String> values) {
            addCriterion("music_name not in", values, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameBetween(String value1, String value2) {
            addCriterion("music_name between", value1, value2, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotBetween(String value1, String value2) {
            addCriterion("music_name not between", value1, value2, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicAuthorIsNull() {
            addCriterion("music_author is null");
            return (Criteria) this;
        }

        public Criteria andMusicAuthorIsNotNull() {
            addCriterion("music_author is not null");
            return (Criteria) this;
        }

        public Criteria andMusicAuthorEqualTo(String value) {
            addCriterion("music_author =", value, "musicAuthor");
            return (Criteria) this;
        }

        public Criteria andMusicAuthorNotEqualTo(String value) {
            addCriterion("music_author <>", value, "musicAuthor");
            return (Criteria) this;
        }

        public Criteria andMusicAuthorGreaterThan(String value) {
            addCriterion("music_author >", value, "musicAuthor");
            return (Criteria) this;
        }

        public Criteria andMusicAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("music_author >=", value, "musicAuthor");
            return (Criteria) this;
        }

        public Criteria andMusicAuthorLessThan(String value) {
            addCriterion("music_author <", value, "musicAuthor");
            return (Criteria) this;
        }

        public Criteria andMusicAuthorLessThanOrEqualTo(String value) {
            addCriterion("music_author <=", value, "musicAuthor");
            return (Criteria) this;
        }

        public Criteria andMusicAuthorLike(String value) {
            addCriterion("music_author like", value, "musicAuthor");
            return (Criteria) this;
        }

        public Criteria andMusicAuthorNotLike(String value) {
            addCriterion("music_author not like", value, "musicAuthor");
            return (Criteria) this;
        }

        public Criteria andMusicAuthorIn(List<String> values) {
            addCriterion("music_author in", values, "musicAuthor");
            return (Criteria) this;
        }

        public Criteria andMusicAuthorNotIn(List<String> values) {
            addCriterion("music_author not in", values, "musicAuthor");
            return (Criteria) this;
        }

        public Criteria andMusicAuthorBetween(String value1, String value2) {
            addCriterion("music_author between", value1, value2, "musicAuthor");
            return (Criteria) this;
        }

        public Criteria andMusicAuthorNotBetween(String value1, String value2) {
            addCriterion("music_author not between", value1, value2, "musicAuthor");
            return (Criteria) this;
        }

        public Criteria andMusicSrcIsNull() {
            addCriterion("music_src is null");
            return (Criteria) this;
        }

        public Criteria andMusicSrcIsNotNull() {
            addCriterion("music_src is not null");
            return (Criteria) this;
        }

        public Criteria andMusicSrcEqualTo(String value) {
            addCriterion("music_src =", value, "musicSrc");
            return (Criteria) this;
        }

        public Criteria andMusicSrcNotEqualTo(String value) {
            addCriterion("music_src <>", value, "musicSrc");
            return (Criteria) this;
        }

        public Criteria andMusicSrcGreaterThan(String value) {
            addCriterion("music_src >", value, "musicSrc");
            return (Criteria) this;
        }

        public Criteria andMusicSrcGreaterThanOrEqualTo(String value) {
            addCriterion("music_src >=", value, "musicSrc");
            return (Criteria) this;
        }

        public Criteria andMusicSrcLessThan(String value) {
            addCriterion("music_src <", value, "musicSrc");
            return (Criteria) this;
        }

        public Criteria andMusicSrcLessThanOrEqualTo(String value) {
            addCriterion("music_src <=", value, "musicSrc");
            return (Criteria) this;
        }

        public Criteria andMusicSrcLike(String value) {
            addCriterion("music_src like", value, "musicSrc");
            return (Criteria) this;
        }

        public Criteria andMusicSrcNotLike(String value) {
            addCriterion("music_src not like", value, "musicSrc");
            return (Criteria) this;
        }

        public Criteria andMusicSrcIn(List<String> values) {
            addCriterion("music_src in", values, "musicSrc");
            return (Criteria) this;
        }

        public Criteria andMusicSrcNotIn(List<String> values) {
            addCriterion("music_src not in", values, "musicSrc");
            return (Criteria) this;
        }

        public Criteria andMusicSrcBetween(String value1, String value2) {
            addCriterion("music_src between", value1, value2, "musicSrc");
            return (Criteria) this;
        }

        public Criteria andMusicSrcNotBetween(String value1, String value2) {
            addCriterion("music_src not between", value1, value2, "musicSrc");
            return (Criteria) this;
        }

        public Criteria andMusicImgIsNull() {
            addCriterion("music_img is null");
            return (Criteria) this;
        }

        public Criteria andMusicImgIsNotNull() {
            addCriterion("music_img is not null");
            return (Criteria) this;
        }

        public Criteria andMusicImgEqualTo(String value) {
            addCriterion("music_img =", value, "musicImg");
            return (Criteria) this;
        }

        public Criteria andMusicImgNotEqualTo(String value) {
            addCriterion("music_img <>", value, "musicImg");
            return (Criteria) this;
        }

        public Criteria andMusicImgGreaterThan(String value) {
            addCriterion("music_img >", value, "musicImg");
            return (Criteria) this;
        }

        public Criteria andMusicImgGreaterThanOrEqualTo(String value) {
            addCriterion("music_img >=", value, "musicImg");
            return (Criteria) this;
        }

        public Criteria andMusicImgLessThan(String value) {
            addCriterion("music_img <", value, "musicImg");
            return (Criteria) this;
        }

        public Criteria andMusicImgLessThanOrEqualTo(String value) {
            addCriterion("music_img <=", value, "musicImg");
            return (Criteria) this;
        }

        public Criteria andMusicImgLike(String value) {
            addCriterion("music_img like", value, "musicImg");
            return (Criteria) this;
        }

        public Criteria andMusicImgNotLike(String value) {
            addCriterion("music_img not like", value, "musicImg");
            return (Criteria) this;
        }

        public Criteria andMusicImgIn(List<String> values) {
            addCriterion("music_img in", values, "musicImg");
            return (Criteria) this;
        }

        public Criteria andMusicImgNotIn(List<String> values) {
            addCriterion("music_img not in", values, "musicImg");
            return (Criteria) this;
        }

        public Criteria andMusicImgBetween(String value1, String value2) {
            addCriterion("music_img between", value1, value2, "musicImg");
            return (Criteria) this;
        }

        public Criteria andMusicImgNotBetween(String value1, String value2) {
            addCriterion("music_img not between", value1, value2, "musicImg");
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