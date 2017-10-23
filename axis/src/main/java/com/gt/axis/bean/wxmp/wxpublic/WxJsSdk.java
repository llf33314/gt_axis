package com.gt.axis.bean.wxmp.wxpublic;

/**
 * 微信js-sdk请求类
 * Created by psr on 2017/10/23 0023.
 */
public class WxJsSdk {

    /**
     * 公众号id
     */
    private Integer publicId;

    /**
     * 分享的url
     */
    private String url;

    public Integer getPublicId() {
        return publicId;
    }

    /**
     * 公众号id
     * @param publicId
     */
    public void setPublicId(Integer publicId) {
        this.publicId = publicId;
    }

    public String getUrl() {
        return url;
    }

    /**
     * 分享的url
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
