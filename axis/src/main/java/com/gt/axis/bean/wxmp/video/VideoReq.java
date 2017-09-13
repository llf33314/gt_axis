package com.gt.axis.bean.wxmp.video;

/**
 * 模块视频请求对象
 * Created by psr on 2017/9/12 0012.
 */
public class VideoReq {

    private String courceModel; // 视频模块取自字典1174

    /**
     * 视频模块取自字典1174
     * @param courceModel
     */
    public void setCourceModel(String courceModel) {
        this.courceModel = courceModel;
    }

    /**
     * 视频模块取自字典1174
     * @return
     */
    public String getCourceModel() {
        return courceModel;
    }
}
