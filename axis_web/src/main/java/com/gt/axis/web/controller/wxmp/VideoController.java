package com.gt.axis.web.controller.wxmp;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.child.ChildUserReq;
import com.gt.axis.bean.wxmp.video.VideoReq;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.ChildServer;
import com.gt.axis.server.wxmp.VideoServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by psr on 2017/9/12 0012.
 */
@RequestMapping(value = "/video")
@RestController
public class VideoController {

    @RequestMapping(value = "/getVoiceUrl")
    public String getVoiceUrl() throws Exception{
        VideoReq videoReq = new VideoReq();
        videoReq.setCourceModel("7");
        AxisResult<String> axisResult = VideoServer.getVoiceUrl(videoReq);
        return JSONObject.toJSONString(axisResult);
    }

}
