package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSONObject;
import com.gt.api.util.HttpClienUtils;
import com.gt.api.util.RequestUtils;
import com.gt.axis.bean.wxmp.sms.SendSmsReq;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * 短信服务
 * Created by psr on 2017/9/8 0008.
 */
public class SmsServer {

    private static Logger logger = Logger.getLogger(SmsServer.class);

    /**
     * 发送短信
     * @param sendSmsReq 发送短信参数对象
     * @return
     */
    public static AxisResult sendSms(SendSmsReq sendSmsReq){
        RequestUtils<SendSmsReq> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(sendSmsReq);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug(messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/smsapi/6F6D9AD2/79B4DE7C/sendSmsOld.do";
        logger.debug(AxisContent.getInstance().getWxmpSignKey());
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        logger.debug(resMap);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        return  AxisResult.create(code, msg, null);
    }

}
