package com.gt.axis.bean.wxmp.erp;

/**
 * Erp菜单请求对象
 * Created by psr on 2017/9/11 0011.
 */
public class ErpMenuReq {

    private Integer style; // 登录人属性0是员工，1是老板（必填）

    private Integer userId; // 登录人的ID（必填）

    private Integer loginuc; // 登陆属性 0是电脑端，1是UC端

    private Integer erpstyle; // 所属erp 取自与字典1180 1小馋猫

    private Integer levelModel; // 菜单版本，登陆第一次不需要传，切换菜单时，请传该参数，选填

    /**
     * 登录人属性0是员工，1是老板（必填）
     * @param style
     */
    public void setStyle(Integer style) {
        this.style = style;
    }

    /**
     * 登录人的ID（必填）
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 登陆属性 0是电脑端，1是UC端
     * @param loginuc
     */
    public void setLoginuc(Integer loginuc) {
        this.loginuc = loginuc;
    }

    /**
     * 所属erp 取自与字典1180 1小馋猫
     * @param erpstyle
     */
    public void setErpstyle(Integer erpstyle) {
        this.erpstyle = erpstyle;
    }

    /**
     * 菜单版本，登陆第一次不需要传，切换菜单时，请传该参数，选填
     * @param levelModel
     */
    public void setLevelModel(Integer levelModel) {
        this.levelModel = levelModel;
    }

    public Integer getStyle() {
        return style;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getLoginuc() {
        return loginuc;
    }

    public Integer getErpstyle() {
        return erpstyle;
    }

    public Integer getLevelModel() {
        return levelModel;
    }
}
