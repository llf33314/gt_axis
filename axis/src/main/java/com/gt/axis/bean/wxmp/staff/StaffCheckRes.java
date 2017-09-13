package com.gt.axis.bean.wxmp.staff;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 员工账号名密码验证返回对象
 * Created by psr on 2017/9/12 0012.
 */
public class StaffCheckRes {

    private Integer code; // 0 代表登陆成功，1：其余一些验证不通过的原因

    private String msg; // 登录不上的原因

    private Integer userId; // 员工ID

    /**
     * 0 代表登陆成功，1：其余一些验证不通过的原因
     * @return
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 登录不上的原因
     * @return
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 员工ID
     * @return
     */
    public Integer getUserId() {
        return userId;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
