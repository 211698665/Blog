package cn.henu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TimelineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimelineExample() {
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

        public Criteria andTimelineIdIsNull() {
            addCriterion("timeline_id is null");
            return (Criteria) this;
        }

        public Criteria andTimelineIdIsNotNull() {
            addCriterion("timeline_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimelineIdEqualTo(Integer value) {
            addCriterion("timeline_id =", value, "timelineId");
            return (Criteria) this;
        }

        public Criteria andTimelineIdNotEqualTo(Integer value) {
            addCriterion("timeline_id <>", value, "timelineId");
            return (Criteria) this;
        }

        public Criteria andTimelineIdGreaterThan(Integer value) {
            addCriterion("timeline_id >", value, "timelineId");
            return (Criteria) this;
        }

        public Criteria andTimelineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("timeline_id >=", value, "timelineId");
            return (Criteria) this;
        }

        public Criteria andTimelineIdLessThan(Integer value) {
            addCriterion("timeline_id <", value, "timelineId");
            return (Criteria) this;
        }

        public Criteria andTimelineIdLessThanOrEqualTo(Integer value) {
            addCriterion("timeline_id <=", value, "timelineId");
            return (Criteria) this;
        }

        public Criteria andTimelineIdIn(List<Integer> values) {
            addCriterion("timeline_id in", values, "timelineId");
            return (Criteria) this;
        }

        public Criteria andTimelineIdNotIn(List<Integer> values) {
            addCriterion("timeline_id not in", values, "timelineId");
            return (Criteria) this;
        }

        public Criteria andTimelineIdBetween(Integer value1, Integer value2) {
            addCriterion("timeline_id between", value1, value2, "timelineId");
            return (Criteria) this;
        }

        public Criteria andTimelineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("timeline_id not between", value1, value2, "timelineId");
            return (Criteria) this;
        }

        public Criteria andTimelineTitleIsNull() {
            addCriterion("timeline_title is null");
            return (Criteria) this;
        }

        public Criteria andTimelineTitleIsNotNull() {
            addCriterion("timeline_title is not null");
            return (Criteria) this;
        }

        public Criteria andTimelineTitleEqualTo(String value) {
            addCriterion("timeline_title =", value, "timelineTitle");
            return (Criteria) this;
        }

        public Criteria andTimelineTitleNotEqualTo(String value) {
            addCriterion("timeline_title <>", value, "timelineTitle");
            return (Criteria) this;
        }

        public Criteria andTimelineTitleGreaterThan(String value) {
            addCriterion("timeline_title >", value, "timelineTitle");
            return (Criteria) this;
        }

        public Criteria andTimelineTitleGreaterThanOrEqualTo(String value) {
            addCriterion("timeline_title >=", value, "timelineTitle");
            return (Criteria) this;
        }

        public Criteria andTimelineTitleLessThan(String value) {
            addCriterion("timeline_title <", value, "timelineTitle");
            return (Criteria) this;
        }

        public Criteria andTimelineTitleLessThanOrEqualTo(String value) {
            addCriterion("timeline_title <=", value, "timelineTitle");
            return (Criteria) this;
        }

        public Criteria andTimelineTitleLike(String value) {
            addCriterion("timeline_title like", value, "timelineTitle");
            return (Criteria) this;
        }

        public Criteria andTimelineTitleNotLike(String value) {
            addCriterion("timeline_title not like", value, "timelineTitle");
            return (Criteria) this;
        }

        public Criteria andTimelineTitleIn(List<String> values) {
            addCriterion("timeline_title in", values, "timelineTitle");
            return (Criteria) this;
        }

        public Criteria andTimelineTitleNotIn(List<String> values) {
            addCriterion("timeline_title not in", values, "timelineTitle");
            return (Criteria) this;
        }

        public Criteria andTimelineTitleBetween(String value1, String value2) {
            addCriterion("timeline_title between", value1, value2, "timelineTitle");
            return (Criteria) this;
        }

        public Criteria andTimelineTitleNotBetween(String value1, String value2) {
            addCriterion("timeline_title not between", value1, value2, "timelineTitle");
            return (Criteria) this;
        }

        public Criteria andTimelineDescIsNull() {
            addCriterion("timeline_desc is null");
            return (Criteria) this;
        }

        public Criteria andTimelineDescIsNotNull() {
            addCriterion("timeline_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTimelineDescEqualTo(String value) {
            addCriterion("timeline_desc =", value, "timelineDesc");
            return (Criteria) this;
        }

        public Criteria andTimelineDescNotEqualTo(String value) {
            addCriterion("timeline_desc <>", value, "timelineDesc");
            return (Criteria) this;
        }

        public Criteria andTimelineDescGreaterThan(String value) {
            addCriterion("timeline_desc >", value, "timelineDesc");
            return (Criteria) this;
        }

        public Criteria andTimelineDescGreaterThanOrEqualTo(String value) {
            addCriterion("timeline_desc >=", value, "timelineDesc");
            return (Criteria) this;
        }

        public Criteria andTimelineDescLessThan(String value) {
            addCriterion("timeline_desc <", value, "timelineDesc");
            return (Criteria) this;
        }

        public Criteria andTimelineDescLessThanOrEqualTo(String value) {
            addCriterion("timeline_desc <=", value, "timelineDesc");
            return (Criteria) this;
        }

        public Criteria andTimelineDescLike(String value) {
            addCriterion("timeline_desc like", value, "timelineDesc");
            return (Criteria) this;
        }

        public Criteria andTimelineDescNotLike(String value) {
            addCriterion("timeline_desc not like", value, "timelineDesc");
            return (Criteria) this;
        }

        public Criteria andTimelineDescIn(List<String> values) {
            addCriterion("timeline_desc in", values, "timelineDesc");
            return (Criteria) this;
        }

        public Criteria andTimelineDescNotIn(List<String> values) {
            addCriterion("timeline_desc not in", values, "timelineDesc");
            return (Criteria) this;
        }

        public Criteria andTimelineDescBetween(String value1, String value2) {
            addCriterion("timeline_desc between", value1, value2, "timelineDesc");
            return (Criteria) this;
        }

        public Criteria andTimelineDescNotBetween(String value1, String value2) {
            addCriterion("timeline_desc not between", value1, value2, "timelineDesc");
            return (Criteria) this;
        }

        public Criteria andTimelineUpdateTimeIsNull() {
            addCriterion("timeline_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTimelineUpdateTimeIsNotNull() {
            addCriterion("timeline_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTimelineUpdateTimeEqualTo(Date value) {
            addCriterion("timeline_update_time =", value, "timelineUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTimelineUpdateTimeNotEqualTo(Date value) {
            addCriterion("timeline_update_time <>", value, "timelineUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTimelineUpdateTimeGreaterThan(Date value) {
            addCriterion("timeline_update_time >", value, "timelineUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTimelineUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("timeline_update_time >=", value, "timelineUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTimelineUpdateTimeLessThan(Date value) {
            addCriterion("timeline_update_time <", value, "timelineUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTimelineUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("timeline_update_time <=", value, "timelineUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTimelineUpdateTimeIn(List<Date> values) {
            addCriterion("timeline_update_time in", values, "timelineUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTimelineUpdateTimeNotIn(List<Date> values) {
            addCriterion("timeline_update_time not in", values, "timelineUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTimelineUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("timeline_update_time between", value1, value2, "timelineUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTimelineUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("timeline_update_time not between", value1, value2, "timelineUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTimelineStatusIsNull() {
            addCriterion("timeline_status is null");
            return (Criteria) this;
        }

        public Criteria andTimelineStatusIsNotNull() {
            addCriterion("timeline_status is not null");
            return (Criteria) this;
        }

        public Criteria andTimelineStatusEqualTo(Integer value) {
            addCriterion("timeline_status =", value, "timelineStatus");
            return (Criteria) this;
        }

        public Criteria andTimelineStatusNotEqualTo(Integer value) {
            addCriterion("timeline_status <>", value, "timelineStatus");
            return (Criteria) this;
        }

        public Criteria andTimelineStatusGreaterThan(Integer value) {
            addCriterion("timeline_status >", value, "timelineStatus");
            return (Criteria) this;
        }

        public Criteria andTimelineStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("timeline_status >=", value, "timelineStatus");
            return (Criteria) this;
        }

        public Criteria andTimelineStatusLessThan(Integer value) {
            addCriterion("timeline_status <", value, "timelineStatus");
            return (Criteria) this;
        }

        public Criteria andTimelineStatusLessThanOrEqualTo(Integer value) {
            addCriterion("timeline_status <=", value, "timelineStatus");
            return (Criteria) this;
        }

        public Criteria andTimelineStatusIn(List<Integer> values) {
            addCriterion("timeline_status in", values, "timelineStatus");
            return (Criteria) this;
        }

        public Criteria andTimelineStatusNotIn(List<Integer> values) {
            addCriterion("timeline_status not in", values, "timelineStatus");
            return (Criteria) this;
        }

        public Criteria andTimelineStatusBetween(Integer value1, Integer value2) {
            addCriterion("timeline_status between", value1, value2, "timelineStatus");
            return (Criteria) this;
        }

        public Criteria andTimelineStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("timeline_status not between", value1, value2, "timelineStatus");
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