package com.gt.axis.bean.wxmp.erp;

/**
 * Erp菜单请求对象
 * Created by psr on 2017/9/11 0011.
 */
public class ErpApiReq {

    private Integer loginStyle; // 登录人属性0是员工，1是老板（必填）

    private Integer userId; // 登录人的ID（必填）

    /**
     * 登录人属性0是员工，1是老板（必填）
     * @param loginStyle
     */
    public void setLoginStyle(Integer loginStyle) {
        this.loginStyle = loginStyle;
    }

    /**
     * 登录人的ID（必填）
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLoginStyle() {
        return loginStyle;
    }

    public Integer getUserId() {
        return userId;
    }
}
