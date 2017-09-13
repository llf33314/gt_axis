package com.gt.axis.bean.wxmp.staff;

/**
 * 门店员工信息请求对象
 * Created by psr on 2017/9/13 0013.
 */
public class StaffShopReq {

    private Integer shopId; // 门店ID

    /**
     * 门店ID
     * @param shopId
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 门店ID
     * @return
     */
    public Integer getShopId() {
        return shopId;
    }
}
