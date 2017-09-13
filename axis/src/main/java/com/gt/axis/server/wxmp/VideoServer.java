package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.gt.api.util.sign.SignHttpUtils;
import com.gt.axis.bean.wxmp.video.VideoReq;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * 视频服务
 * Created by psr on 2017/9/12 0012.
 */
public class VideoServer {

    private static Logger logger = Logger.getLogger(VideoServer.class);

    /**
     * 获取模块视频的url
     * @param videoReq
     * @return
     */
    public static AxisResult<String> getVoiceUrl(VideoReq videoReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/videoCourceApi/getVoiceUrl.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, videoReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        String voiceUrl = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            Map<String, String> map = JSON.parseObject(json, Map.class);
            if(map.get("voiceUrl") != null){
                voiceUrl = map.get("voiceUrl");
            }
        }
        AxisResult<String> axisResult = AxisResult.create(code, msg, voiceUrl);
        return axisResult;
    }

}
