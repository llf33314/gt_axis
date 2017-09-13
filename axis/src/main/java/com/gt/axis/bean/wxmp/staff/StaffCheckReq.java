package com.gt.axis.bean.wxmp.staff;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 员工账号名密码验证请求对象
 * Created by psr on 2017/9/12 0012.
 */
public class StaffCheckReq {

    @JSONField(name = "login_name")
    private String loginName; // 员工登录名

    private String password; // 员工密码

    /**
     * 员工登录名
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 员工密码
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getPassword() {
        return password;
    }
}
