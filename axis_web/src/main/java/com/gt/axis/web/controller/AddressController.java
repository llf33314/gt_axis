package com.gt.axis.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.address.AddressReq;
import com.gt.axis.bean.wxmp.address.CityRes;
import com.gt.axis.bean.wxmp.address.MemberAdsReq;
import com.gt.axis.bean.wxmp.address.MemberAdsRes;
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

    @RequestMapping(value = "/addressDefault")
    public String addressDefault() throws Exception{
        MemberAdsReq memberAdsReq = new MemberAdsReq();
        memberAdsReq.setMemberids("1225352,1225358,1225449");
        AxisResult<MemberAdsRes> axisResult = AddressServer.addressDefault(memberAdsReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/addreSelectId")
    public String addreSelectId() throws Exception{
        AddressReq addressReq = new AddressReq();
        addressReq.setAddid(146);
        AxisResult<MemberAdsRes> axisResult = AddressServer.addreSelectId(addressReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/addressList")
    public String addressList() throws Exception{
        MemberAdsReq memberAdsReq = new MemberAdsReq();
        memberAdsReq.setMemberids("1225352,1225358,1225449");
        AxisResult<List<MemberAdsRes>> axisResult = AddressServer.addressList(memberAdsReq);
        return JSONObject.toJSONString(axisResult);
    }

}
