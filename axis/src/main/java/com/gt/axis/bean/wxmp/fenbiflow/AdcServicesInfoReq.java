package com.gt.axis.bean.wxmp.fenbiflow;

/**
 * Created by zwq on 2017/11/9 0009.
 * 7、流量兑换(充值) 请求参数
 */
public class AdcServicesInfoReq {

    private Integer model;//模块(字典:N001)

    private Integer prizeCount;//规格

    private Integer memberId;//会员id

    private Integer busId;// 商家id

    private Integer id;//订单id

    private String mobile;//手机号码

    private String notifyUrl;//充值结果通知回调,返回两个参数，id:订单id,status(0、1) 0:成功 1:表示失败，接收时，请使用@requestBody Map<String,Object> params


    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Integer getPrizeCount() {
        return prizeCount;
    }

    public void setPrizeCount(Integer prizeCount) {
        this.prizeCount = prizeCount;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
}
