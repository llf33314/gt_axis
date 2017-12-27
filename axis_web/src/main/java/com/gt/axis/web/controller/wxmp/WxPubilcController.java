package com.gt.axis.web.controller.wxmp;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.material.MateralRes;
import com.gt.axis.bean.wxmp.material.MateralWrapRes;
import com.gt.axis.bean.wxmp.material.SearchMaterialReq;
import com.gt.axis.bean.wxmp.wxpublic.*;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.MaterialServer;
import com.gt.axis.server.wxmp.WxPublicServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by psr on 2017/9/11 0011.
 */
@RequestMapping(value = "/wxpublic")
@RestController
public class WxPubilcController {

    @RequestMapping(value = "/shakearoundRegister")
    public String searchMaterialList() throws Exception{
        ShakearoundRegisterReq shakearoundRegisterReq = new ShakearoundRegisterReq();
        shakearoundRegisterReq.setBusId(33);
        shakearoundRegisterReq.setEmail("473108784@qq.com");
        shakearoundRegisterReq.setName("周伟权");
        shakearoundRegisterReq.setPhone_number("13414621797");
        List<String> url = new ArrayList<>();
        url.add("/ewm.jpg");
        shakearoundRegisterReq.setUrl(url);
        shakearoundRegisterReq.setApply_reason("测试测试");
        shakearoundRegisterReq.setIndustry_id("1203");
        AxisResult axisResult = WxPublicServer.shakearoundRegister(shakearoundRegisterReq);
        return JSONObject.toJSONString(axisResult);
    }
    @RequestMapping(value = "/getAuditstatus")
    public String searchMaterialList3() throws Exception{
        AxisResult<ShakearoundDataRes> axisResult = WxPublicServer.getAuditstatus(33);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/applyid")
    public String applyid() throws Exception{
        ApplyidAddReq applyidAddReq = new ApplyidAddReq();
        applyidAddReq.setBusId(33);
        applyidAddReq.setApply_reason("测试测试");
        applyidAddReq.setComment("研发测试");
        applyidAddReq.setQuantity(1);
        applyidAddReq.setPoi_id("464809640");
        AxisResult axisResult = WxPublicServer.applyid(applyidAddReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/refreshDeviceStatus")
    public String refreshDeviceStatus() throws Exception{
        RefreshDeviceStatusReq refreshDeviceStatusReq = new RefreshDeviceStatusReq();
        refreshDeviceStatusReq.setBusId(33);
        refreshDeviceStatusReq.setApply_id("");
        AxisResult<ApplystatusDataRes> axisResult = WxPublicServer.refreshDeviceStatus(refreshDeviceStatusReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/applySearchList")
    public String applySearchList() throws Exception{
        AxisResult<List<DevicesRes>>  axisResult = WxPublicServer.applySearchList(33);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/pageAdd")
    public String pageAdd() throws Exception{
        PageAddReq pageAddReq = new PageAddReq();
        pageAddReq.setBusId(33);
        pageAddReq.setComment("研发测试");
        pageAddReq.setDescription("帅气的页面");
        pageAddReq.setTitle("摇起来");
        pageAddReq.setIcon_url("http://maint.duofriend.com/upload/image/websiteUpload//ewm.jpg");
        pageAddReq.setPage_url("https://www.duofriend.com/");
        AxisResult<Integer>  axisResult = WxPublicServer.pageAdd(pageAddReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/pageUpdate")
    public String pageUpdate() throws Exception{
        PageEditReq pageAddReq = new PageEditReq();
        pageAddReq.setBusId(33);
        pageAddReq.setComment("研发测试");
        pageAddReq.setDescription("帅气的页面");
        pageAddReq.setTitle("摇起来");
        pageAddReq.setIcon_url("http://maint.duofriend.com/upload/image/websiteUpload//ewm.jpg");
        pageAddReq.setPage_url("https://www.duofriend.com/");
        pageAddReq.setPage_id(22);
        AxisResult axisResult = WxPublicServer.pageUpdate(pageAddReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/pageDel")
    public String pageDel() throws Exception{
        PageRemoveReq pageAddReq = new PageRemoveReq();
        pageAddReq.setBusId(33);
        pageAddReq.setPage_id(22);
        AxisResult axisResult = WxPublicServer.pageDel(pageAddReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/bindPage")
    public String bindPage() throws Exception{
        UpdateApplyReq updateApplyReq = new UpdateApplyReq();
        updateApplyReq.setBusId(33);
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setComment("测试备注");
        deviceInfo.setPoi_id(464809640);
        List<Integer> list = new ArrayList<>();
        list.add(22);
        deviceInfo.setPage_ids(list);
        DeviceIdentifier deviceIdentifier = new DeviceIdentifier();
        deviceIdentifier.setDevice_id(16650310);
        deviceIdentifier.setMajor("10171");
        deviceIdentifier.setMinor("44732");
        deviceIdentifier.setUuid("FDA50693-A4E2-4FB1-AFCF-C6EB07647825");
        deviceIdentifier.setPoi_id(464809640);
        deviceInfo.setDeviceIdentifier(deviceIdentifier);
        updateApplyReq.setDeviceInfo(deviceInfo);
        AxisResult axisResult = WxPublicServer.bindPage(updateApplyReq);
        return JSONObject.toJSONString(axisResult);
    }


}
