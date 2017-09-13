package com.gt.axis.bean.wxmp.bus;

/**
 * ERP数量返回对象
 * Created by psr on 2017/9/11 0011.
 */
public class ErpCountRes {

    private Integer erpCount; // 0代表商家未开通该erp功能，1开通了

    /**
     * 0代表商家未开通该erp功能，1开通了
     * @return
     */
    public Integer getErpCount() {
        return erpCount;
    }

    public void setErpCount(Integer erpCount) {
        this.erpCount = erpCount;
    }
}
