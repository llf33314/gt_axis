package com.gt.axis.web.controller.wxmp;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.address.CityRes;
import com.gt.axis.bean.wxmp.applet.MsgTemplateRes;
import com.gt.axis.bean.wxmp.applet.WxPublicUser;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.AddressServer;
import com.gt.axis.server.wxmp.AppletServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by psr on 2017/9/8 0008.
 */
@RequestMapping("/applet")
@RestController
public class AppletController {

    @RequestMapping(value = "/getByUserId")
    public String listCityByLevel(){
        int userId = 36;
        AxisResult<WxPublicUser> axisResult = AppletServer.getByUserId(userId);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getById")
    public String getById(){
        int id = 482;
        AxisResult<WxPublicUser> axisResult = AppletServer.getById(id);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getByMemberId")
    public String getByMemberId(){
        int memberId = 482;
        AxisResult<WxPublicUser> axisResult = AppletServer.getByMemberId(memberId);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/selectTempObjByBusId")
    public String selectTempObjByBusId(){
        int busId = 33;
        AxisResult<List<MsgTemplateRes>> axisResult = AppletServer.selectTempObjByBusId(busId);
        return JSONObject.toJSONString(axisResult);
    }

}
