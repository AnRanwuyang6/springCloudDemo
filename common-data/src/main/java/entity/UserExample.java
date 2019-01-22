package entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andIsRealIsNull() {
            addCriterion("is_real is null");
            return (Criteria) this;
        }

        public Criteria andIsRealIsNotNull() {
            addCriterion("is_real is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealEqualTo(Boolean value) {
            addCriterion("is_real =", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotEqualTo(Boolean value) {
            addCriterion("is_real <>", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealGreaterThan(Boolean value) {
            addCriterion("is_real >", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_real >=", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLessThan(Boolean value) {
            addCriterion("is_real <", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealLessThanOrEqualTo(Boolean value) {
            addCriterion("is_real <=", value, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealIn(List<Boolean> values) {
            addCriterion("is_real in", values, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotIn(List<Boolean> values) {
            addCriterion("is_real not in", values, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealBetween(Boolean value1, Boolean value2) {
            addCriterion("is_real between", value1, value2, "isReal");
            return (Criteria) this;
        }

        public Criteria andIsRealNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_real not between", value1, value2, "isReal");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSaltkeyIsNull() {
            addCriterion("saltkey is null");
            return (Criteria) this;
        }

        public Criteria andSaltkeyIsNotNull() {
            addCriterion("saltkey is not null");
            return (Criteria) this;
        }

        public Criteria andSaltkeyEqualTo(String value) {
            addCriterion("saltkey =", value, "saltkey");
            return (Criteria) this;
        }

        public Criteria andSaltkeyNotEqualTo(String value) {
            addCriterion("saltkey <>", value, "saltkey");
            return (Criteria) this;
        }

        public Criteria andSaltkeyGreaterThan(String value) {
            addCriterion("saltkey >", value, "saltkey");
            return (Criteria) this;
        }

        public Criteria andSaltkeyGreaterThanOrEqualTo(String value) {
            addCriterion("saltkey >=", value, "saltkey");
            return (Criteria) this;
        }

        public Criteria andSaltkeyLessThan(String value) {
            addCriterion("saltkey <", value, "saltkey");
            return (Criteria) this;
        }

        public Criteria andSaltkeyLessThanOrEqualTo(String value) {
            addCriterion("saltkey <=", value, "saltkey");
            return (Criteria) this;
        }

        public Criteria andSaltkeyLike(String value) {
            addCriterion("saltkey like", value, "saltkey");
            return (Criteria) this;
        }

        public Criteria andSaltkeyNotLike(String value) {
            addCriterion("saltkey not like", value, "saltkey");
            return (Criteria) this;
        }

        public Criteria andSaltkeyIn(List<String> values) {
            addCriterion("saltkey in", values, "saltkey");
            return (Criteria) this;
        }

        public Criteria andSaltkeyNotIn(List<String> values) {
            addCriterion("saltkey not in", values, "saltkey");
            return (Criteria) this;
        }

        public Criteria andSaltkeyBetween(String value1, String value2) {
            addCriterion("saltkey between", value1, value2, "saltkey");
            return (Criteria) this;
        }

        public Criteria andSaltkeyNotBetween(String value1, String value2) {
            addCriterion("saltkey not between", value1, value2, "saltkey");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSumFeeSplitIsNull() {
            addCriterion("sum_fee_split is null");
            return (Criteria) this;
        }

        public Criteria andSumFeeSplitIsNotNull() {
            addCriterion("sum_fee_split is not null");
            return (Criteria) this;
        }

        public Criteria andSumFeeSplitEqualTo(Integer value) {
            addCriterion("sum_fee_split =", value, "sumFeeSplit");
            return (Criteria) this;
        }

        public Criteria andSumFeeSplitNotEqualTo(Integer value) {
            addCriterion("sum_fee_split <>", value, "sumFeeSplit");
            return (Criteria) this;
        }

        public Criteria andSumFeeSplitGreaterThan(Integer value) {
            addCriterion("sum_fee_split >", value, "sumFeeSplit");
            return (Criteria) this;
        }

        public Criteria andSumFeeSplitGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum_fee_split >=", value, "sumFeeSplit");
            return (Criteria) this;
        }

        public Criteria andSumFeeSplitLessThan(Integer value) {
            addCriterion("sum_fee_split <", value, "sumFeeSplit");
            return (Criteria) this;
        }

        public Criteria andSumFeeSplitLessThanOrEqualTo(Integer value) {
            addCriterion("sum_fee_split <=", value, "sumFeeSplit");
            return (Criteria) this;
        }

        public Criteria andSumFeeSplitIn(List<Integer> values) {
            addCriterion("sum_fee_split in", values, "sumFeeSplit");
            return (Criteria) this;
        }

        public Criteria andSumFeeSplitNotIn(List<Integer> values) {
            addCriterion("sum_fee_split not in", values, "sumFeeSplit");
            return (Criteria) this;
        }

        public Criteria andSumFeeSplitBetween(Integer value1, Integer value2) {
            addCriterion("sum_fee_split between", value1, value2, "sumFeeSplit");
            return (Criteria) this;
        }

        public Criteria andSumFeeSplitNotBetween(Integer value1, Integer value2) {
            addCriterion("sum_fee_split not between", value1, value2, "sumFeeSplit");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Long value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Long value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Long value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Long value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Long value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Long> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Long> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Long value1, Long value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Long value1, Long value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberIsNull() {
            addCriterion("customer_number is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberIsNotNull() {
            addCriterion("customer_number is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberEqualTo(String value) {
            addCriterion("customer_number =", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotEqualTo(String value) {
            addCriterion("customer_number <>", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberGreaterThan(String value) {
            addCriterion("customer_number >", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberGreaterThanOrEqualTo(String value) {
            addCriterion("customer_number >=", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberLessThan(String value) {
            addCriterion("customer_number <", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberLessThanOrEqualTo(String value) {
            addCriterion("customer_number <=", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberLike(String value) {
            addCriterion("customer_number like", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotLike(String value) {
            addCriterion("customer_number not like", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberIn(List<String> values) {
            addCriterion("customer_number in", values, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotIn(List<String> values) {
            addCriterion("customer_number not in", values, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberBetween(String value1, String value2) {
            addCriterion("customer_number between", value1, value2, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotBetween(String value1, String value2) {
            addCriterion("customer_number not between", value1, value2, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("customer_type is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("customer_type is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("customer_type =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("customer_type <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("customer_type >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_type >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("customer_type <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("customer_type <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("customer_type like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("customer_type not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("customer_type in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("customer_type not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("customer_type between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("customer_type not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andSignedNameIsNull() {
            addCriterion("signed_name is null");
            return (Criteria) this;
        }

        public Criteria andSignedNameIsNotNull() {
            addCriterion("signed_name is not null");
            return (Criteria) this;
        }

        public Criteria andSignedNameEqualTo(String value) {
            addCriterion("signed_name =", value, "signedName");
            return (Criteria) this;
        }

        public Criteria andSignedNameNotEqualTo(String value) {
            addCriterion("signed_name <>", value, "signedName");
            return (Criteria) this;
        }

        public Criteria andSignedNameGreaterThan(String value) {
            addCriterion("signed_name >", value, "signedName");
            return (Criteria) this;
        }

        public Criteria andSignedNameGreaterThanOrEqualTo(String value) {
            addCriterion("signed_name >=", value, "signedName");
            return (Criteria) this;
        }

        public Criteria andSignedNameLessThan(String value) {
            addCriterion("signed_name <", value, "signedName");
            return (Criteria) this;
        }

        public Criteria andSignedNameLessThanOrEqualTo(String value) {
            addCriterion("signed_name <=", value, "signedName");
            return (Criteria) this;
        }

        public Criteria andSignedNameLike(String value) {
            addCriterion("signed_name like", value, "signedName");
            return (Criteria) this;
        }

        public Criteria andSignedNameNotLike(String value) {
            addCriterion("signed_name not like", value, "signedName");
            return (Criteria) this;
        }

        public Criteria andSignedNameIn(List<String> values) {
            addCriterion("signed_name in", values, "signedName");
            return (Criteria) this;
        }

        public Criteria andSignedNameNotIn(List<String> values) {
            addCriterion("signed_name not in", values, "signedName");
            return (Criteria) this;
        }

        public Criteria andSignedNameBetween(String value1, String value2) {
            addCriterion("signed_name between", value1, value2, "signedName");
            return (Criteria) this;
        }

        public Criteria andSignedNameNotBetween(String value1, String value2) {
            addCriterion("signed_name not between", value1, value2, "signedName");
            return (Criteria) this;
        }

        public Criteria andIsBindIsNull() {
            addCriterion("is_bind is null");
            return (Criteria) this;
        }

        public Criteria andIsBindIsNotNull() {
            addCriterion("is_bind is not null");
            return (Criteria) this;
        }

        public Criteria andIsBindEqualTo(Boolean value) {
            addCriterion("is_bind =", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindNotEqualTo(Boolean value) {
            addCriterion("is_bind <>", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindGreaterThan(Boolean value) {
            addCriterion("is_bind >", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_bind >=", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindLessThan(Boolean value) {
            addCriterion("is_bind <", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindLessThanOrEqualTo(Boolean value) {
            addCriterion("is_bind <=", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindIn(List<Boolean> values) {
            addCriterion("is_bind in", values, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindNotIn(List<Boolean> values) {
            addCriterion("is_bind not in", values, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindBetween(Boolean value1, Boolean value2) {
            addCriterion("is_bind between", value1, value2, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_bind not between", value1, value2, "isBind");
            return (Criteria) this;
        }

        public Criteria andPrizeCountIsNull() {
            addCriterion("prize_count is null");
            return (Criteria) this;
        }

        public Criteria andPrizeCountIsNotNull() {
            addCriterion("prize_count is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeCountEqualTo(Integer value) {
            addCriterion("prize_count =", value, "prizeCount");
            return (Criteria) this;
        }

        public Criteria andPrizeCountNotEqualTo(Integer value) {
            addCriterion("prize_count <>", value, "prizeCount");
            return (Criteria) this;
        }

        public Criteria andPrizeCountGreaterThan(Integer value) {
            addCriterion("prize_count >", value, "prizeCount");
            return (Criteria) this;
        }

        public Criteria andPrizeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_count >=", value, "prizeCount");
            return (Criteria) this;
        }

        public Criteria andPrizeCountLessThan(Integer value) {
            addCriterion("prize_count <", value, "prizeCount");
            return (Criteria) this;
        }

        public Criteria andPrizeCountLessThanOrEqualTo(Integer value) {
            addCriterion("prize_count <=", value, "prizeCount");
            return (Criteria) this;
        }

        public Criteria andPrizeCountIn(List<Integer> values) {
            addCriterion("prize_count in", values, "prizeCount");
            return (Criteria) this;
        }

        public Criteria andPrizeCountNotIn(List<Integer> values) {
            addCriterion("prize_count not in", values, "prizeCount");
            return (Criteria) this;
        }

        public Criteria andPrizeCountBetween(Integer value1, Integer value2) {
            addCriterion("prize_count between", value1, value2, "prizeCount");
            return (Criteria) this;
        }

        public Criteria andPrizeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_count not between", value1, value2, "prizeCount");
            return (Criteria) this;
        }

        public Criteria andResidualIsNull() {
            addCriterion("residual is null");
            return (Criteria) this;
        }

        public Criteria andResidualIsNotNull() {
            addCriterion("residual is not null");
            return (Criteria) this;
        }

        public Criteria andResidualEqualTo(Integer value) {
            addCriterion("residual =", value, "residual");
            return (Criteria) this;
        }

        public Criteria andResidualNotEqualTo(Integer value) {
            addCriterion("residual <>", value, "residual");
            return (Criteria) this;
        }

        public Criteria andResidualGreaterThan(Integer value) {
            addCriterion("residual >", value, "residual");
            return (Criteria) this;
        }

        public Criteria andResidualGreaterThanOrEqualTo(Integer value) {
            addCriterion("residual >=", value, "residual");
            return (Criteria) this;
        }

        public Criteria andResidualLessThan(Integer value) {
            addCriterion("residual <", value, "residual");
            return (Criteria) this;
        }

        public Criteria andResidualLessThanOrEqualTo(Integer value) {
            addCriterion("residual <=", value, "residual");
            return (Criteria) this;
        }

        public Criteria andResidualIn(List<Integer> values) {
            addCriterion("residual in", values, "residual");
            return (Criteria) this;
        }

        public Criteria andResidualNotIn(List<Integer> values) {
            addCriterion("residual not in", values, "residual");
            return (Criteria) this;
        }

        public Criteria andResidualBetween(Integer value1, Integer value2) {
            addCriterion("residual between", value1, value2, "residual");
            return (Criteria) this;
        }

        public Criteria andResidualNotBetween(Integer value1, Integer value2) {
            addCriterion("residual not between", value1, value2, "residual");
            return (Criteria) this;
        }

        public Criteria andBonusIsNull() {
            addCriterion("bonus is null");
            return (Criteria) this;
        }

        public Criteria andBonusIsNotNull() {
            addCriterion("bonus is not null");
            return (Criteria) this;
        }

        public Criteria andBonusEqualTo(Integer value) {
            addCriterion("bonus =", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotEqualTo(Integer value) {
            addCriterion("bonus <>", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThan(Integer value) {
            addCriterion("bonus >", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThanOrEqualTo(Integer value) {
            addCriterion("bonus >=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThan(Integer value) {
            addCriterion("bonus <", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThanOrEqualTo(Integer value) {
            addCriterion("bonus <=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusIn(List<Integer> values) {
            addCriterion("bonus in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotIn(List<Integer> values) {
            addCriterion("bonus not in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusBetween(Integer value1, Integer value2) {
            addCriterion("bonus between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotBetween(Integer value1, Integer value2) {
            addCriterion("bonus not between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andShare1IsNull() {
            addCriterion("share1 is null");
            return (Criteria) this;
        }

        public Criteria andShare1IsNotNull() {
            addCriterion("share1 is not null");
            return (Criteria) this;
        }

        public Criteria andShare1EqualTo(String value) {
            addCriterion("share1 =", value, "share1");
            return (Criteria) this;
        }

        public Criteria andShare1NotEqualTo(String value) {
            addCriterion("share1 <>", value, "share1");
            return (Criteria) this;
        }

        public Criteria andShare1GreaterThan(String value) {
            addCriterion("share1 >", value, "share1");
            return (Criteria) this;
        }

        public Criteria andShare1GreaterThanOrEqualTo(String value) {
            addCriterion("share1 >=", value, "share1");
            return (Criteria) this;
        }

        public Criteria andShare1LessThan(String value) {
            addCriterion("share1 <", value, "share1");
            return (Criteria) this;
        }

        public Criteria andShare1LessThanOrEqualTo(String value) {
            addCriterion("share1 <=", value, "share1");
            return (Criteria) this;
        }

        public Criteria andShare1Like(String value) {
            addCriterion("share1 like", value, "share1");
            return (Criteria) this;
        }

        public Criteria andShare1NotLike(String value) {
            addCriterion("share1 not like", value, "share1");
            return (Criteria) this;
        }

        public Criteria andShare1In(List<String> values) {
            addCriterion("share1 in", values, "share1");
            return (Criteria) this;
        }

        public Criteria andShare1NotIn(List<String> values) {
            addCriterion("share1 not in", values, "share1");
            return (Criteria) this;
        }

        public Criteria andShare1Between(String value1, String value2) {
            addCriterion("share1 between", value1, value2, "share1");
            return (Criteria) this;
        }

        public Criteria andShare1NotBetween(String value1, String value2) {
            addCriterion("share1 not between", value1, value2, "share1");
            return (Criteria) this;
        }

        public Criteria andShare2IsNull() {
            addCriterion("share2 is null");
            return (Criteria) this;
        }

        public Criteria andShare2IsNotNull() {
            addCriterion("share2 is not null");
            return (Criteria) this;
        }

        public Criteria andShare2EqualTo(String value) {
            addCriterion("share2 =", value, "share2");
            return (Criteria) this;
        }

        public Criteria andShare2NotEqualTo(String value) {
            addCriterion("share2 <>", value, "share2");
            return (Criteria) this;
        }

        public Criteria andShare2GreaterThan(String value) {
            addCriterion("share2 >", value, "share2");
            return (Criteria) this;
        }

        public Criteria andShare2GreaterThanOrEqualTo(String value) {
            addCriterion("share2 >=", value, "share2");
            return (Criteria) this;
        }

        public Criteria andShare2LessThan(String value) {
            addCriterion("share2 <", value, "share2");
            return (Criteria) this;
        }

        public Criteria andShare2LessThanOrEqualTo(String value) {
            addCriterion("share2 <=", value, "share2");
            return (Criteria) this;
        }

        public Criteria andShare2Like(String value) {
            addCriterion("share2 like", value, "share2");
            return (Criteria) this;
        }

        public Criteria andShare2NotLike(String value) {
            addCriterion("share2 not like", value, "share2");
            return (Criteria) this;
        }

        public Criteria andShare2In(List<String> values) {
            addCriterion("share2 in", values, "share2");
            return (Criteria) this;
        }

        public Criteria andShare2NotIn(List<String> values) {
            addCriterion("share2 not in", values, "share2");
            return (Criteria) this;
        }

        public Criteria andShare2Between(String value1, String value2) {
            addCriterion("share2 between", value1, value2, "share2");
            return (Criteria) this;
        }

        public Criteria andShare2NotBetween(String value1, String value2) {
            addCriterion("share2 not between", value1, value2, "share2");
            return (Criteria) this;
        }

        public Criteria andShare3IsNull() {
            addCriterion("share3 is null");
            return (Criteria) this;
        }

        public Criteria andShare3IsNotNull() {
            addCriterion("share3 is not null");
            return (Criteria) this;
        }

        public Criteria andShare3EqualTo(String value) {
            addCriterion("share3 =", value, "share3");
            return (Criteria) this;
        }

        public Criteria andShare3NotEqualTo(String value) {
            addCriterion("share3 <>", value, "share3");
            return (Criteria) this;
        }

        public Criteria andShare3GreaterThan(String value) {
            addCriterion("share3 >", value, "share3");
            return (Criteria) this;
        }

        public Criteria andShare3GreaterThanOrEqualTo(String value) {
            addCriterion("share3 >=", value, "share3");
            return (Criteria) this;
        }

        public Criteria andShare3LessThan(String value) {
            addCriterion("share3 <", value, "share3");
            return (Criteria) this;
        }

        public Criteria andShare3LessThanOrEqualTo(String value) {
            addCriterion("share3 <=", value, "share3");
            return (Criteria) this;
        }

        public Criteria andShare3Like(String value) {
            addCriterion("share3 like", value, "share3");
            return (Criteria) this;
        }

        public Criteria andShare3NotLike(String value) {
            addCriterion("share3 not like", value, "share3");
            return (Criteria) this;
        }

        public Criteria andShare3In(List<String> values) {
            addCriterion("share3 in", values, "share3");
            return (Criteria) this;
        }

        public Criteria andShare3NotIn(List<String> values) {
            addCriterion("share3 not in", values, "share3");
            return (Criteria) this;
        }

        public Criteria andShare3Between(String value1, String value2) {
            addCriterion("share3 between", value1, value2, "share3");
            return (Criteria) this;
        }

        public Criteria andShare3NotBetween(String value1, String value2) {
            addCriterion("share3 not between", value1, value2, "share3");
            return (Criteria) this;
        }

        public Criteria andShare4IsNull() {
            addCriterion("share4 is null");
            return (Criteria) this;
        }

        public Criteria andShare4IsNotNull() {
            addCriterion("share4 is not null");
            return (Criteria) this;
        }

        public Criteria andShare4EqualTo(String value) {
            addCriterion("share4 =", value, "share4");
            return (Criteria) this;
        }

        public Criteria andShare4NotEqualTo(String value) {
            addCriterion("share4 <>", value, "share4");
            return (Criteria) this;
        }

        public Criteria andShare4GreaterThan(String value) {
            addCriterion("share4 >", value, "share4");
            return (Criteria) this;
        }

        public Criteria andShare4GreaterThanOrEqualTo(String value) {
            addCriterion("share4 >=", value, "share4");
            return (Criteria) this;
        }

        public Criteria andShare4LessThan(String value) {
            addCriterion("share4 <", value, "share4");
            return (Criteria) this;
        }

        public Criteria andShare4LessThanOrEqualTo(String value) {
            addCriterion("share4 <=", value, "share4");
            return (Criteria) this;
        }

        public Criteria andShare4Like(String value) {
            addCriterion("share4 like", value, "share4");
            return (Criteria) this;
        }

        public Criteria andShare4NotLike(String value) {
            addCriterion("share4 not like", value, "share4");
            return (Criteria) this;
        }

        public Criteria andShare4In(List<String> values) {
            addCriterion("share4 in", values, "share4");
            return (Criteria) this;
        }

        public Criteria andShare4NotIn(List<String> values) {
            addCriterion("share4 not in", values, "share4");
            return (Criteria) this;
        }

        public Criteria andShare4Between(String value1, String value2) {
            addCriterion("share4 between", value1, value2, "share4");
            return (Criteria) this;
        }

        public Criteria andShare4NotBetween(String value1, String value2) {
            addCriterion("share4 not between", value1, value2, "share4");
            return (Criteria) this;
        }

        public Criteria andShare5IsNull() {
            addCriterion("share5 is null");
            return (Criteria) this;
        }

        public Criteria andShare5IsNotNull() {
            addCriterion("share5 is not null");
            return (Criteria) this;
        }

        public Criteria andShare5EqualTo(String value) {
            addCriterion("share5 =", value, "share5");
            return (Criteria) this;
        }

        public Criteria andShare5NotEqualTo(String value) {
            addCriterion("share5 <>", value, "share5");
            return (Criteria) this;
        }

        public Criteria andShare5GreaterThan(String value) {
            addCriterion("share5 >", value, "share5");
            return (Criteria) this;
        }

        public Criteria andShare5GreaterThanOrEqualTo(String value) {
            addCriterion("share5 >=", value, "share5");
            return (Criteria) this;
        }

        public Criteria andShare5LessThan(String value) {
            addCriterion("share5 <", value, "share5");
            return (Criteria) this;
        }

        public Criteria andShare5LessThanOrEqualTo(String value) {
            addCriterion("share5 <=", value, "share5");
            return (Criteria) this;
        }

        public Criteria andShare5Like(String value) {
            addCriterion("share5 like", value, "share5");
            return (Criteria) this;
        }

        public Criteria andShare5NotLike(String value) {
            addCriterion("share5 not like", value, "share5");
            return (Criteria) this;
        }

        public Criteria andShare5In(List<String> values) {
            addCriterion("share5 in", values, "share5");
            return (Criteria) this;
        }

        public Criteria andShare5NotIn(List<String> values) {
            addCriterion("share5 not in", values, "share5");
            return (Criteria) this;
        }

        public Criteria andShare5Between(String value1, String value2) {
            addCriterion("share5 between", value1, value2, "share5");
            return (Criteria) this;
        }

        public Criteria andShare5NotBetween(String value1, String value2) {
            addCriterion("share5 not between", value1, value2, "share5");
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