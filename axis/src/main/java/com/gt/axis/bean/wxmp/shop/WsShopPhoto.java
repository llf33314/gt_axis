package com.gt.axis.bean.wxmp.shop;

/**
 * 门店图片列表
 * Created by psr on 2017/9/11 0011.
 */
public class WsShopPhoto {

    private String localAddress; // 服务器图片url

    private String wxAddress;//微信url

    private Integer busId;//商家ID


    public String getLocalAddress() {
        return localAddress;
    }

    public String getWxAddress() {
        return wxAddress;
    }

    public Integer getBusId() {
        return busId;
    }
    /**
     * 服务器图片url
     * @return
     */
    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }
    /**
     * 微信url
     * @return
     */
    public void setWxAddress(String wxAddress) {
        this.wxAddress = wxAddress;
    }
    /**
     * 商家ID
     * @return
     */
    public void setBusId(Integer busId) {
        this.busId = busId;
    }
}
