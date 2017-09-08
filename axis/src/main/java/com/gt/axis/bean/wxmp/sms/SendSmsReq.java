package com.gt.axis.bean.wxmp.sms;

/**
 * 发送短信请求对象
 * Created by psr on 2017/9/8 0008.
 */
public class SendSmsReq {

    private String mobiles;

    private String content;

    private String company;

    private Integer busId;

    private Integer model;

    public String getMobiles() {
        return mobiles;
    }

    /**
     * 手机号码,可多个号码，用逗号隔开
     * @param mobiles
     */
    public void setMobiles(String mobiles) {
        this.mobiles = mobiles;
    }

    public String getContent() {
        return content;
    }

    /**
     * 内容
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    public String getCompany() {
        return company;
    }

    /**
     * 公司名称(多粉平台)
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getBusId() {
        return busId;
    }

    /**
     * 商家ID
     * @param busId
     */
    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public Integer getModel() {
        return model;
    }

    /**
     * 短信模块ID(字典1071)
     * @param model
     */
    public void setModel(Integer model) {
        this.model = model;
    }
}
