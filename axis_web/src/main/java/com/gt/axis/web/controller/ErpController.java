package com.gt.axis.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.erp.ErpApiReq;
import com.gt.axis.bean.wxmp.erp.ErpMenuReq;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.ErpServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by psr on 2017/9/11 0011.
 */
@RequestMapping(value = "/erp")
@RestController
public class ErpController {

    @RequestMapping(value = "/getErpListApi")
    public String getErpListApi() throws Exception{
        ErpApiReq erpApiReq = new ErpApiReq();
        erpApiReq.setLoginStyle(1);
        erpApiReq.setUserId(42);
        AxisResult axisResult = ErpServer.getErpListApi(erpApiReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getMenus")
    public String getMenus() throws Exception{
        ErpMenuReq erpMenuReq = new ErpMenuReq();
        erpMenuReq.setUserId(42);
        erpMenuReq.setStyle(1);
        erpMenuReq.setLoginuc(0);
        erpMenuReq.setErpstyle(1);
        AxisResult axisResult = ErpServer.getMenus(erpMenuReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getMall")
    public String getMall() throws Exception{
        ErpApiReq erpApiReq = new ErpApiReq();
        erpApiReq.setUserId(42);
        erpApiReq.setLoginStyle(1);
        AxisResult axisResult = ErpServer.getMall(erpApiReq);
        return JSONObject.toJSONString(axisResult);
    }

}
