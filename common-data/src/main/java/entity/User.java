package entity;

import javax.persistence.*;

@Table(name = "t_user")
public class User {
    @Id
    private Long id;

    /**
     * 图像
     */
    private String avatar;

    /**
     * 是否实名
     */
    @Column(name = "is_real")
    private Boolean isReal;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 姓名
     */
    private String name;

    /**
     * 昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码盐
     */
    private String saltkey;

    /**
     * 状态【0：启用；1：禁用】
     */
    private String status;

    /**
     * 分润
     */
    @Column(name = "sum_fee_split")
    private Integer sumFeeSplit;

    /**
     * 用户Token
     */
    private String token;

    /**
     * 用户名
     */
    private String username;

    @Column(name = "grade_id")
    private Long gradeId;

    private Long pid;

    /**
     * 子商户商户编号
     */
    @Column(name = "customer_number")
    private String customerNumber;

    /**
     * 姓名
     */
    @Column(name = "customer_type")
    private String customerType;

    /**
     * 身份证号
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 签约名
     */
    @Column(name = "signed_name")
    private String signedName;

    /**
     * 是否绑卡
     */
    @Column(name = "is_bind")
    private Boolean isBind;

    /**
     * 抽奖次数
     */
    @Column(name = "prize_count")
    private Integer prizeCount;

    /**
     * 余额
     */
    private Integer residual;

    /**
     * 积分
     */
    private Integer bonus;

    /**
     * 分享图片1
     */
    private String share1;

    /**
     * 分享图片2
     */
    private String share2;

    /**
     * 分享图片3
     */
    private String share3;

    /**
     * 分享图片4
     */
    private String share4;

    /**
     * 分享图片5
     */
    private String share5;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取图像
     *
     * @return avatar - 图像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置图像
     *
     * @param avatar 图像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取是否实名
     *
     * @return is_real - 是否实名
     */
    public Boolean getIsReal() {
        return isReal;
    }

    /**
     * 设置是否实名
     *
     * @param isReal 是否实名
     */
    public void setIsReal(Boolean isReal) {
        this.isReal = isReal;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取昵称
     *
     * @return nick_name - 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置昵称
     *
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取密码盐
     *
     * @return saltkey - 密码盐
     */
    public String getSaltkey() {
        return saltkey;
    }

    /**
     * 设置密码盐
     *
     * @param saltkey 密码盐
     */
    public void setSaltkey(String saltkey) {
        this.saltkey = saltkey;
    }

    /**
     * 获取状态【0：启用；1：禁用】
     *
     * @return status - 状态【0：启用；1：禁用】
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态【0：启用；1：禁用】
     *
     * @param status 状态【0：启用；1：禁用】
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取分润
     *
     * @return sum_fee_split - 分润
     */
    public Integer getSumFeeSplit() {
        return sumFeeSplit;
    }

    /**
     * 设置分润
     *
     * @param sumFeeSplit 分润
     */
    public void setSumFeeSplit(Integer sumFeeSplit) {
        this.sumFeeSplit = sumFeeSplit;
    }

    /**
     * 获取用户Token
     *
     * @return token - 用户Token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置用户Token
     *
     * @param token 用户Token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return grade_id
     */
    public Long getGradeId() {
        return gradeId;
    }

    /**
     * @param gradeId
     */
    public void setGradeId(Long gradeId) {
        this.gradeId = gradeId;
    }

    /**
     * @return pid
     */
    public Long getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Long pid) {
        this.pid = pid;
    }

    /**
     * 获取子商户商户编号
     *
     * @return customer_number - 子商户商户编号
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * 设置子商户商户编号
     *
     * @param customerNumber 子商户商户编号
     */
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    /**
     * 获取姓名
     *
     * @return customer_type - 姓名
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * 设置姓名
     *
     * @param customerType 姓名
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    /**
     * 获取身份证号
     *
     * @return id_card - 身份证号
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置身份证号
     *
     * @param idCard 身份证号
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取邮箱
     *
     * @return mail - 邮箱
     */
    public String getMail() {
        return mail;
    }

    /**
     * 设置邮箱
     *
     * @param mail 邮箱
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 获取签约名
     *
     * @return signed_name - 签约名
     */
    public String getSignedName() {
        return signedName;
    }

    /**
     * 设置签约名
     *
     * @param signedName 签约名
     */
    public void setSignedName(String signedName) {
        this.signedName = signedName;
    }

    /**
     * 获取是否绑卡
     *
     * @return is_bind - 是否绑卡
     */
    public Boolean getIsBind() {
        return isBind;
    }

    /**
     * 设置是否绑卡
     *
     * @param isBind 是否绑卡
     */
    public void setIsBind(Boolean isBind) {
        this.isBind = isBind;
    }

    /**
     * 获取抽奖次数
     *
     * @return prize_count - 抽奖次数
     */
    public Integer getPrizeCount() {
        return prizeCount;
    }

    /**
     * 设置抽奖次数
     *
     * @param prizeCount 抽奖次数
     */
    public void setPrizeCount(Integer prizeCount) {
        this.prizeCount = prizeCount;
    }

    /**
     * 获取余额
     *
     * @return residual - 余额
     */
    public Integer getResidual() {
        return residual;
    }

    /**
     * 设置余额
     *
     * @param residual 余额
     */
    public void setResidual(Integer residual) {
        this.residual = residual;
    }

    /**
     * 获取积分
     *
     * @return bonus - 积分
     */
    public Integer getBonus() {
        return bonus;
    }

    /**
     * 设置积分
     *
     * @param bonus 积分
     */
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    /**
     * 获取分享图片1
     *
     * @return share1 - 分享图片1
     */
    public String getShare1() {
        return share1;
    }

    /**
     * 设置分享图片1
     *
     * @param share1 分享图片1
     */
    public void setShare1(String share1) {
        this.share1 = share1;
    }

    /**
     * 获取分享图片2
     *
     * @return share2 - 分享图片2
     */
    public String getShare2() {
        return share2;
    }

    /**
     * 设置分享图片2
     *
     * @param share2 分享图片2
     */
    public void setShare2(String share2) {
        this.share2 = share2;
    }

    /**
     * 获取分享图片3
     *
     * @return share3 - 分享图片3
     */
    public String getShare3() {
        return share3;
    }

    /**
     * 设置分享图片3
     *
     * @param share3 分享图片3
     */
    public void setShare3(String share3) {
        this.share3 = share3;
    }

    /**
     * 获取分享图片4
     *
     * @return share4 - 分享图片4
     */
    public String getShare4() {
        return share4;
    }

    /**
     * 设置分享图片4
     *
     * @param share4 分享图片4
     */
    public void setShare4(String share4) {
        this.share4 = share4;
    }

    /**
     * 获取分享图片5
     *
     * @return share5 - 分享图片5
     */
    public String getShare5() {
        return share5;
    }

    /**
     * 设置分享图片5
     *
     * @param share5 分享图片5
     */
    public void setShare5(String share5) {
        this.share5 = share5;
    }
}