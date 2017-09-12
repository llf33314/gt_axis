package com.gt.axis.bean.wxmp.shop;

/**
 * 门店返回对象
 * Created by psr on 2017/9/11 0011.
 */
public class ShopSubsop {

    private Integer shopId;//门店ID

    private Integer subShop;//店铺ID

    private Integer model;//所属模块(在1192字典类型里面添加

    private Integer status;//-1：删除

    /**
     * 门店ID
     * @return
     */
    public Integer getShopId() {
        return shopId;
    }
    /**
     * 店铺ID
     * @return
     */
    public Integer getSubShop() {
        return subShop;
    }
    /**
     * 所属模块(在1192字典类型里面添加
     * @return
     */
    public Integer getModel() {
        return model;
    }
    /**
     * -1：删除
     * @return
     */
    public Integer getStatus() {
        return status;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public void setSubShop(Integer subShop) {
        this.subShop = subShop;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
