package com.gt.axis.web.controller.wxmp;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.wxpublic.WxJsSdk;
import com.gt.axis.bean.wxmp.wxpublic.WxJsSdkResult;
import com.gt.axis.bean.wxmp.wxpublic.WxPublicUsers;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.WxPublicServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by psr on 2017/9/8 0008.
 */
@RequestMapping("/wxpublic")
@RestController
public class WxPublicController {

    @RequestMapping(value = "/selectByBusId")
    public String selectByBusId(){
        AxisResult<WxPublicUsers> axisResult = WxPublicServer.selectByBusId(36);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getWxjssdk")
    public String getWxjssdk(){
        WxJsSdk wxJsSdk = new WxJsSdk();
        wxJsSdk.setPublicId(494);
        wxJsSdk.setUrl("http://www.duofriend.com");
        AxisResult<WxJsSdkResult> axisResult = WxPublicServer.getWxjssdk(wxJsSdk);
        return JSONObject.toJSONString(axisResult);
    }
}
