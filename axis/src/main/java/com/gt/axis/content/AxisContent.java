package com.gt.axis.content;

/**
 * Created by psr on 2017/9/8 0008.
 */
public class AxisContent {

    private static AxisContent axisContentBean = null;

    private AxisContent(){}

    /**
     * 单例构造器
     * @return
     */
    public static AxisContent getInstance(){
        if (axisContentBean == null){
            init();
        }
        return axisContentBean;
    }

    private static synchronized void init(){
        if (axisContentBean == null){
            axisContentBean = new AxisContent();
        }
    }

    // ----------------------  content 需要的参数
    private String wxmpSignKey; // wxmp 签名密钥
    private String wxmpUrl; // wxmp 请求地址

    /* getter and setter */

    /**
     * wxmp签名密钥
     * @return
     */
    public String getWxmpSignKey() {
        return wxmpSignKey;
    }

    /**
     * wxmp签名密钥
     * @param wxmpSignKey
     */
    public void setWxmpSignKey(String wxmpSignKey) {
        this.wxmpSignKey = wxmpSignKey;
    }

    /**
     * wxmp请求地址
     * @return
     */
    public String getWxmpUrl() {
        return wxmpUrl;
    }

    /**
     * wxmp请求地址
     * @param wxmpUrl
     */
    public void setWxmpUrl(String wxmpUrl) {
        this.wxmpUrl = wxmpUrl;
    }
}
