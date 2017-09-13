package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.gt.api.util.sign.SignHttpUtils;
import com.gt.axis.bean.wxmp.mq.MqRes;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;

import java.util.Map;

/**
 * mq服务
 * Created by psr on 2017/9/13 0013.
 */
public class MQServer {

    /**
     * mq推送信息接口
     * @param mqRes
     * @return
     */
    public static AxisResult sendMq(MqRes mqRes) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/mq/getMq.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, mqRes, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = AxisResult.create(code, msg,null);
        return axisResult;
    }

}
