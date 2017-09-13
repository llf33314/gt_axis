package com.gt.axis.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.staff.*;
import com.gt.axis.bean.wxmp.video.VideoReq;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.StaffServer;
import com.gt.axis.server.wxmp.VideoServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by psr on 2017/9/12 0012.
 */
@RequestMapping(value = "/staff")
@RestController
public class StaffController {

    @RequestMapping(value = "/getStaffId")
    public String getStaffId() throws Exception{
        StaffReq staffReq = new StaffReq();
        staffReq.setStaffId(103);
        AxisResult axisResult = StaffServer.getStaffId(staffReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getStaffVerSion")
    public String getStaffVerSion() throws Exception{
        StaffCheckReq staffCheckReq = new StaffCheckReq();
        staffCheckReq.setLoginName("ggggg");
        staffCheckReq.setPassword("gt123456");
        AxisResult axisResult = StaffServer.getStaffVerSion(staffCheckReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getStaffListShopId")
    public String getStaffListShopId() throws Exception{
        StaffListReq staffListReq = new StaffListReq();
        staffListReq.setPage(1);
        staffListReq.setPageSize(10);
        staffListReq.setShopId(42);
        AxisResult axisResult = StaffServer.getStaffListShopId(staffListReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getAllStaffShopId")
    public String getAllStaffShopId() throws Exception{
        StaffShopReq staffShopReq = new StaffShopReq();
        staffShopReq.setShopId(42);
        AxisResult axisResult = StaffServer.getAllStaffShopId(staffShopReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getChildListShopId")
    public String getChildListShopId() throws Exception{
        StaffShopListReq staffShopListReq = new StaffShopListReq();
        staffShopListReq.setShopId(42);
        staffShopListReq.setPage(1);
        staffShopListReq.setPageSize(10);
        AxisResult axisResult = StaffServer.getChildListShopId(staffShopListReq);
        return JSONObject.toJSONString(axisResult);
    }

}
