package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.gt.api.util.sign.SignHttpUtils;
import com.gt.axis.bean.wxmp.socket.SendSocketReq;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * socket服务
 * Created by psr on 2017/9/11 0011.
 */
public class SocketServer {

    private static Logger logger = Logger.getLogger(SocketServer.class);

    /**
     * 发送socket
     * @param sendSocketReq
     * @return
     * @throws Exception
     */
    public static AxisResult sendSocket(SendSocketReq sendSocketReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/socket/getSocketApi.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, sendSocketReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = AxisResult.create(code, msg, null);
        return axisResult;
    }

}
