package com.gt.axis.web.controller.wxmp;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.bus.BusUser;
import com.gt.axis.bean.wxmp.bus.BusUserApiReq;
import com.gt.axis.bean.wxmp.bus.ErpCountReq;
import com.gt.axis.bean.wxmp.bus.ErpCountRes;
import com.gt.axis.bean.wxmp.material.MateralRes;
import com.gt.axis.bean.wxmp.material.MateralWrapRes;
import com.gt.axis.bean.wxmp.material.SearchMaterialReq;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.BusServer;
import com.gt.axis.server.wxmp.MaterialServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by psr on 2017/9/11 0011.
 */
@RequestMapping(value = "/material")
@RestController
public class MaterialController {

    @RequestMapping(value = "/searchMaterialList")
    public String searchMaterialList() throws Exception{
        SearchMaterialReq searchMaterialReq = new SearchMaterialReq();
        searchMaterialReq.setPublicId(492);
        searchMaterialReq.setSearch("凉拌羊肉");
        searchMaterialReq.setType(3);
        AxisResult<List<MateralWrapRes>> axisResult = MaterialServer.searchMaterialList(searchMaterialReq);
        return JSONObject.toJSONString(axisResult);
    }
    @RequestMapping(value = "/searchMaterialList3")
    public String searchMaterialList3() throws Exception{
        SearchMaterialReq searchMaterialReq = new SearchMaterialReq();
        searchMaterialReq.setPublicId(492);
        searchMaterialReq.setSearch("微场");
        searchMaterialReq.setType(3);
        AxisResult<List<MateralWrapRes>> axisResult = MaterialServer.searchMaterialList(searchMaterialReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/searchMaterialById")
    public String searchMaterialById() throws Exception{
        AxisResult<MateralRes> axisResult = MaterialServer.searchMaterialById(3653);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/searchMaterialByPid")
    public String searchMaterialByPid() throws Exception{
        AxisResult<MateralWrapRes> axisResult = MaterialServer.searchMaterialByPid(3653);
        return JSONObject.toJSONString(axisResult);
    }

}
