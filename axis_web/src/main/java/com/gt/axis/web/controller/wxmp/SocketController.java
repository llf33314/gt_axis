package com.gt.axis.web.controller.wxmp;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.socket.SendSocketReq;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.SocketServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by psr on 2017/9/11 0011.
 */
@RequestMapping(value = "/socket")
@RestController
public class SocketController {

    @RequestMapping(value = "/send")
    public String send() throws Exception{
        SendSocketReq sendSocketReq = new SendSocketReq();
        sendSocketReq.setPushName("123");
        AxisResult axisResult = SocketServer.sendSocket(sendSocketReq);
        return JSONObject.toJSONString(axisResult);
    }

}
