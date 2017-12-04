package com.gt.axis.bean.wxmp.bus;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

/**
 * BusUser对象
 * Created by psr on 2017/9/11 0011.
 */
public class BusUser {

    private Integer id; // 商家ID

    private String name; // 商家名称

    private String password; // 密码里面是null

    private String email; // 邮箱

    private String phone; // 手机电话

    private String gender; // 性别(0表示男性, 1表示女性)

    private String registerIp; // 注册ip

    private String recentIp; // 最近登录ip

    private BigDecimal fansCurrency; // 粉币

    private Integer level; // 会员等级

    private String status; // 状态(0 正常用户, -1 冻结用户)

    private Float flow; // 流量

    private Integer pid; // 子账号父类的账号id，0是主账号，1不是子账号

    private Integer smsCount; // 所剩下的短信条数

    private String realname; // 商家真实姓名

    private Date ctime; // 创建时间

    private Date mtime; // 最近修改时间

    @JSONField(name = "city_id")
    private Integer cityId; // 城市ID

    private Date startTime; // 商家会员开始时间

    private Date endTime; // 商家会员结束时间

    private Integer years; // 商家会员年限

    private Integer industryid; // 商家行业，对应字典1018

    private Integer advert; // 多粉平台下面的广告，是否显示，0 显示，1不显示

    @JSONField(name = "busmoney_level")
    private String busmoneyLevel; // 代理相关信息，不考虑

    private String regionids; // 代理相关信息，不考虑

    private String isagent; // 代理相关信息，不考虑

    private String agentid; // 代理相关信息，不考虑

    @JSONField(name = "login_source")
    private Integer loginSource; // 登录来源，不考虑

    private Integer isBinding; // 是否解绑公众号 0：否 1:解绑

    @JSONField(name = "unbundling_time")
    private Date unbundlingTime; // 解绑时间

    @JSONField(name = "fixed_phone")
    private String fixedPhone; // 微站商户存在的固话

    @JSONField(name = "customer_id")
    private String customerId; // 微站商户存在的字段

    @JSONField(name = "merchant_name")
    private String merchantName; // 无用（以前用来商家发短信的前缀，现在没用）

    @JSONField(name = "add_source")
    private Integer addSource; // 微站商户存在的字段

    @JSONField(name = "wz_auth")
    private Integer wzAuth; // 微站商户存在的字段

    /**
     * 商家ID
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * 商家名称
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 密码里面是null
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * 邮箱
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * 手机电话
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 性别(0表示男性, 1表示女性)
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     * 注册ip
     * @return
     */
    public String getRegisterIp() {
        return registerIp;
    }

    /**
     * 最近登录ip
     * @return
     */
    public String getRecentIp() {
        return recentIp;
    }

    /**
     * 粉币
     * @return
     */
    public BigDecimal getFansCurrency() {
        return fansCurrency;
    }

    /**
     * 会员等级
     * @return
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 状态(0 正常用户, -1 冻结用户)
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * 流量
     * @return
     */
    public Float getFlow() {
        return flow;
    }

    /**
     * 多粉平台下面的广告，是否显示，0 显示，1不显示
     * @return
     */
    public Integer getAdvert() {
        return advert;
    }

    /**
     * 代理相关信息，不考虑
     * @return
     */
    public String getBusmoneyLevel() {
        return busmoneyLevel;
    }

    /**
     * 代理相关信息，不考虑
     * @return
     */
    public String getRegionids() {
        return regionids;
    }

    /**
     * 代理相关信息，不考虑
     * @return
     */
    public String getIsagent() {
        return isagent;
    }

    /**
     * 代理相关信息，不考虑
     * @return
     */
    public String getAgentid() {
        return agentid;
    }

    /**
     * 登录来源，不考虑
     * @return
     */
    public Integer getLoginSource() {
        return loginSource;
    }

    /**
     * 是否解绑公众号 0：否 1:解绑
     * @return
     */
    public Integer getIsBinding() {
        return isBinding;
    }

    /**
     * 解绑时间
     * @return
     */
    public Date getUnbundlingTime() {
        return unbundlingTime;
    }

    /**
     * 微站商户存在的固话
     * @return
     */
    public String getFixedPhone() {
        return fixedPhone;
    }

    /**
     * 微站商户存在的字段
     * @return
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 无用（以前用来商家发短信的前缀，现在没用）
     * @return
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * 微站商户存在的字段
     * @return
     */
    public Integer getAddSource() {
        return addSource;
    }

    /**
     * 微站商户存在的字段
     * @return
     */
    public Integer getWzAuth() {
        return wzAuth;
    }

    /**
     * 子账号父类的账号id，0是主账号，1不是子账号
     * @return
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 所剩下的短信条数
     * @return
     */
    public Integer getSmsCount() {
        return smsCount;
    }

    /**
     * 商家真实姓名
     * @return
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 创建时间
     * @return
     */
    public Date getCtime() {
        return ctime;
    }

    /**
     * 最近修改时间
     * @return
     */
    public Date getMtime() {
        return mtime;
    }

    /**
     * 城市ID
     * @return
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 商家会员开始时间
     * @return
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 商家会员结束时间
     * @return
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 商家会员年限
     * @return
     */
    public Integer getYears() {
        return years;
    }

    /**
     * 商家行业，对应字典1018
     * @return
     */
    public Integer getIndustryid() {
        return industryid;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public void setRecentIp(String recentIp) {
        this.recentIp = recentIp;
    }

    public void setFansCurrency(BigDecimal fansCurrency) {
        this.fansCurrency = fansCurrency;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setFlow(Float flow) {
        this.flow = flow;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setSmsCount(Integer smsCount) {
        this.smsCount = smsCount;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public void setIndustryid(Integer industryid) {
        this.industryid = industryid;
    }

    public void setAdvert(Integer advert) {
        this.advert = advert;
    }

    public void setBusmoneyLevel(String busmoneyLevel) {
        this.busmoneyLevel = busmoneyLevel;
    }

    public void setRegionids(String regionids) {
        this.regionids = regionids;
    }

    public void setIsagent(String isagent) {
        this.isagent = isagent;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    public void setLoginSource(Integer loginSource) {
        this.loginSource = loginSource;
    }

    public void setIsBinding(Integer isBinding) {
        this.isBinding = isBinding;
    }

    public void setUnbundlingTime(Date unbundlingTime) {
        this.unbundlingTime = unbundlingTime;
    }

    public void setFixedPhone(String fixedPhone) {
        this.fixedPhone = fixedPhone;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public void setAddSource(Integer addSource) {
        this.addSource = addSource;
    }

    public void setWzAuth(Integer wzAuth) {
        this.wzAuth = wzAuth;
    }

    public void setName(String name) {
        this.name = name;
    }
}
