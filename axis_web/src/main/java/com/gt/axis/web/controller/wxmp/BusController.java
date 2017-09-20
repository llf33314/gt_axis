package com.gt.axis.web.controller.wxmp;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.bus.BusUser;
import com.gt.axis.bean.wxmp.bus.BusUserApiReq;
import com.gt.axis.bean.wxmp.bus.ErpCountReq;
import com.gt.axis.bean.wxmp.bus.ErpCountRes;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.BusServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by psr on 2017/9/11 0011.
 */
@RequestMapping(value = "/bus")
@RestController
public class BusController {

    @RequestMapping(value = "/getBusUserApi")
    public String getBusUserApi() throws Exception{
        BusUserApiReq busUserApiReq = new BusUserApiReq();
        busUserApiReq.setUserId(42);
        AxisResult<BusUser> axisResult = BusServer.getBusUserApi(busUserApiReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getIsErpCount")
    public String getIsErpCount() throws Exception{
        ErpCountReq erpCountReq = new ErpCountReq();
        erpCountReq.setUserId(42);
        erpCountReq.setModelstyle("1");
        AxisResult<ErpCountRes> axisResult = BusServer.getIsErpCount(erpCountReq);
        return JSONObject.toJSONString(axisResult);
    }

}
