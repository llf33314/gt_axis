package com.gt.axis.web.controller.wxmp;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.content.AxisResult;
import com.gt.axis.bean.wxmp.sms.SendSmsReq;
import com.gt.axis.server.wxmp.SmsServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by psr on 2017/9/8 0008.
 */
@RequestMapping("/sms")
@RestController
public class SmsController {

    @RequestMapping(value = "/send")
    public String sendSms(){
        SendSmsReq sendSmsReq = new SendSmsReq();
        sendSmsReq.setBusId(33);
        sendSmsReq.setCompany("多粉");
        sendSmsReq.setContent("Hello world!");
        sendSmsReq.setMobiles("13414621797");
        sendSmsReq.setModel(1);
        AxisResult axisResult = SmsServer.sendSms(sendSmsReq);
        return JSONObject.toJSONString(axisResult);
    }

}
