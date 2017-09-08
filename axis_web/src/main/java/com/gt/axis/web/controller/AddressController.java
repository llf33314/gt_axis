package com.gt.axis.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.address.CityRes;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.AddressServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by psr on 2017/9/8 0008.
 */
@RequestMapping("/address")
@RestController
public class AddressController {

    @RequestMapping(value = "/listCityByLevel")
    public String listCityByLevel(){
        AxisResult<List<CityRes>> axisResult = AddressServer.listCityByLevel(1);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/listCityByParentId")
    public String listCityByParentId(){
        AxisResult<List<CityRes>> axisResult = AddressServer.listCityByParentId(3513);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/listCityByIds")
    public String listCityByIds(){
        String ids = "1857,1365,1662";
        AxisResult<List<CityRes>> axisResult = AddressServer.listCityByIds(ids);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/listCityByCodes")
    public String listCityByCodes(){
        String codes = "360000,420000";
        AxisResult<List<CityRes>> axisResult = AddressServer.listCityByCodes(codes);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/listCityByNames")
    public String listCityByNames(){
        String names = "广东省";
        AxisResult<List<CityRes>> axisResult = AddressServer.listCityByName(names);
        return JSONObject.toJSONString(axisResult);
    }

}
