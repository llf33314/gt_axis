package com.gt.axis.bean.wxmp.erp;

/**
 * Erp菜单返回对象
 * Created by psr on 2017/9/11 0011.
 */
public class MenusLevelList {

    private String erpmodel; // 属性

    private String erpurl; // 首页链接

    private String erpname; // erp名字

    /**
     * 属性
     * @return
     */
    public String getErpmodel() {
        return erpmodel;
    }

    /**
     * 首页链接
     * @return
     */
    public String getErpurl() {
        return erpurl;
    }

    /**
     * erp名字
     * @return
     */
    public String getErpname() {
        return erpname;
    }

    public void setErpmodel(String erpmodel) {
        this.erpmodel = erpmodel;
    }

    public void setErpurl(String erpurl) {
        this.erpurl = erpurl;
    }

    public void setErpname(String erpname) {
        this.erpname = erpname;
    }
}
