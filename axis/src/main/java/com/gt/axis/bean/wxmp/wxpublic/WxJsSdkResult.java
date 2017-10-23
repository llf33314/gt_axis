package com.gt.axis.bean.wxmp.wxpublic;

/**
 * 微信js-sdk结果返回类
 * Created by psr on 2017/10/23 0023.
 */
public class WxJsSdkResult {

    private String appid; // 公众号appid

    private String timestamp; // 时间戳

    private String nonce_str; // 随机字符串

    private String signature; // 签名

    /**
     * 公众号appid
     * @return
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 时间戳
     * @return
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 随机字符串
     * @return
     */
    public String getNonce_str() {
        return nonce_str;
    }

    /**
     * 签名
     * @return
     */
    public String getSignature() {
        return signature;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
