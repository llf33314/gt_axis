package com.gt.axis.bean.wxmp.applet;

/**
 *
 * Created by psr on 2017/9/8 0008.
 */
public class WxPublicUser {

    private Integer id; // id

    private Integer busUserId; // 商家ID

    private String authorizerInfo; // 昵称

    private String headImg; // 头像（可为空）

    private Integer serviceTypeInfo; // 1:订阅号，2：服务号

    private Integer verifyTypeInfo; // -1:未认证，0：已认证

    private String userName; // 原始ID

    private String qrcodeUrl; // 二维码

    private String appid; // appid

    private String mchId; // 商户号（可为空）

    private String apiKey; // 商户密钥（可为空）

    /**
     * id
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * 商家ID
     * @return
     */
    public Integer getBusUserId() {
        return busUserId;
    }

    /**
     * 昵称
     * @return
     */
    public String getAuthorizerInfo() {
        return authorizerInfo;
    }

    /**
     * 头像（可为空）
     * @return
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 1:订阅号，2：服务号
     * @return
     */
    public Integer getServiceTypeInfo() {
        return serviceTypeInfo;
    }

    /**
     * -1:未认证，0：已认证
     * @return
     */
    public Integer getVerifyTypeInfo() {
        return verifyTypeInfo;
    }

    /**
     * 原始ID
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 二维码
     * @return
     */
    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    /**
     * appid
     * @return
     */
    public String getAppid() {
        return appid;
    }

    /**
     * mchId
     * @return
     */
    public String getMchId() {
        return mchId;
    }

    /**
     * apiKey
     * @return
     */
    public String getApiKey() {
        return apiKey;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBusUserId(Integer busUserId) {
        this.busUserId = busUserId;
    }

    public void setAuthorizerInfo(String authorizerInfo) {
        this.authorizerInfo = authorizerInfo;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    public void setServiceTypeInfo(Integer serviceTypeInfo) {
        this.serviceTypeInfo = serviceTypeInfo;
    }

    public void setVerifyTypeInfo(Integer verifyTypeInfo) {
        this.verifyTypeInfo = verifyTypeInfo;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public void setMchId(String mchId) {
        this.mchId = mchId;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
