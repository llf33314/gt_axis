package com.gt.axis.bean.wxmp.shop;

/**
 * 门店返回对象
 * Created by psr on 2017/9/11 0011.
 */
public class WsShopPhoto {

    private String localAddress; // 服务器图片url

    private String wxAddress;//微信url

    private Integer busId;//商家ID

    /**
     * 服务器图片url
     * @return
     */
    public String getLocalAddress() {
        return localAddress;
    }
    /**
     * 微信url
     * @return
     */
    public String getWxAddress() {
        return wxAddress;
    }
    /**
     * 商家ID
     * @return
     */
    public Integer getBusId() {
        return busId;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    public void setWxAddress(String wxAddress) {
        this.wxAddress = wxAddress;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }
}
