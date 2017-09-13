package com.gt.axis.bean.wxmp.staff;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 员工返回对象
 * Created by psr on 2017/9/12 0012.
 */
public class StaffRes {

    private Integer id; // 员工ID

    private String loginName; // 登录名

    private String phone; // 手机电话

    private String email; // 邮箱

//    @JSONField(name = "job_number")
    private String jobNumber; // 工号

    private Integer gender; // 性别(0表示男性, 1表示女性)

//    @JSONField(name = "shop_id")
    private Integer shopId; // wx_shop 门店店铺id

    private Integer status; // 状态(0 正常用户, 1 冻结用户)

//    @JSONField(name = "create_time")
    private String createTime; // 创建时间

//    @JSONField(name = "create_person")
    private Integer createPerson; // 创建人，bus_user

//    @JSONField(name = "recent_ip")
    private String recentIp; // 最近登陆IP

    private String remark; // 备注

    private String name; // 员工姓名

    private Integer positionid; // 职位id  取自t_common_erp_position

    private Integer branid; // 部门ID

    /**
     * 员工ID
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * 登录名
     * @return
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 手机电话
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 邮箱
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * 工号
     * @return
     */
    public String getJobNumber() {
        return jobNumber;
    }

    /**
     * 性别(0表示男性, 1表示女性)
     * @return
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * wx_shop 门店店铺id
     * @return
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * 状态(0 正常用户, 1 冻结用户)
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 创建时间
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 创建人，bus_user
     * @return
     */
    public Integer getCreatePerson() {
        return createPerson;
    }

    /**
     * 最近登陆IP
     * @return
     */
    public String getRecentIp() {
        return recentIp;
    }

    /**
     * 备注
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 员工姓名
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 职位id  取自t_common_erp_position
     * @return
     */
    public Integer getPositionid() {
        return positionid;
    }

    /**
     * 部门ID
     * @return
     */
    public Integer getBranid() {
        return branid;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setCreatePerson(Integer createPerson) {
        this.createPerson = createPerson;
    }

    public void setRecentIp(String recentIp) {
        this.recentIp = recentIp;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }

    public void setBranid(Integer branid) {
        this.branid = branid;
    }
}
