package com.gt.axis.bean.wxmp.shop;

/**
 * 门店中间表
 * Created by psr on 2017/9/11 0011.
 */
public class ShopSubsop {

    private Integer shopId;//门店ID

    private Integer subShop;//店铺ID

    private Integer model;//所属模块(在1192字典类型里面添加

    private Integer status;//-1：删除


    public Integer getShopId() {
        return shopId;
    }

    public Integer getSubShop() {
        return subShop;
    }

    public Integer getModel() {
        return model;
    }

    public Integer getStatus() {
        return status;
    }
    /**
     * 门店ID
     * @return
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }
    /**
     * 店铺ID
     * @return
     */
    public void setSubShop(Integer subShop) {
        this.subShop = subShop;
    }
    /**
     * 所属模块(在1192字典类型里面添加
     * @return
     */
    public void setModel(Integer model) {
        this.model = model;
    }
    /**
     * -1：删除
     * @return
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}
