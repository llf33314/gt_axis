package com.gt.axis.bean.wxmp.staff;

/**
 * 门店员工信息返回对象
 * Created by psr on 2017/9/13 0013.
 */
public class StaffShopRes {

    private String realname; // 用户真实姓名（不一定有）

    private Integer id; // 用户ID

    private String style; // 属性0是员工，1是管理员

    private String name; // 登录名

    /**
     * 用户真实姓名（不一定有）
     * @return
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 用户ID
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * 属性0是员工，1是管理员
     * @return
     */
    public String getStyle() {
        return style;
    }

    /**
     * 登录名
     * @return
     */
    public String getName() {
        return name;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setName(String name) {
        this.name = name;
    }
}
