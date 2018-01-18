package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gt.api.util.HttpClienUtils;
import com.gt.api.util.RequestUtils;
import com.gt.axis.bean.wxmp.wxpublic.*;
import com.gt.api.bean.session.WxPublicUsers;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * js-sdk服务
 * Created by psr on 2017/10/23 0023.
 */
public class WxPublicServer {

    private static Logger logger = Logger.getLogger(WxPublicServer.class);

    /**
     * 根据busId获取商家公众号信息
     * @param busId
     * @return
     */
    public static AxisResult<WxPublicUsers> selectByBusId(Integer busId){
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(busId);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/selectByUserId.do";
        logger.debug("url --> " + url);
        logger.debug(AxisContent.getInstance().getWxmpSignKey());
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        WxPublicUsers wxPublicUsers = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            wxPublicUsers = JSON.parseObject(json, WxPublicUsers.class);
        }
        AxisResult<WxPublicUsers> axisResult = AxisResult.create(code, msg, wxPublicUsers);
        return axisResult;
    }

    /**
     * 获取微信js-sdk
     * 文档名：获取省份
     * @param wxJsSdk
     * @return
     */
    public static AxisResult<WxJsSdkResult> getWxjssdk(WxJsSdk wxJsSdk){
        RequestUtils<WxJsSdk> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(wxJsSdk);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxphone/6F6D9AD2/79B4DE7C/wxjssdk.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        WxJsSdkResult wxJsSdkResult = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            wxJsSdkResult = JSON.parseObject(json, WxJsSdkResult.class);
        }
        AxisResult<WxJsSdkResult> axisResult = AxisResult.create(code, msg, wxJsSdkResult);
        return axisResult;
    }

    /**
     *  申请开通周边
     * @param shakearoundRegisterReq
     * @return
     */
    public static AxisResult shakearoundRegister(ShakearoundRegisterReq shakearoundRegisterReq){
        RequestUtils<ShakearoundRegisterReq> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(shakearoundRegisterReq);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/shakearoundRegister.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = AxisResult.create(code, msg,null);
        return axisResult;
    }

    /**
     *  查看申请开通状态
     * @param busId
     * @return
     */
    public static AxisResult<ShakearoundDataRes> getAuditstatus(Integer busId){
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(busId);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/getAuditstatus.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        ShakearoundDataRes shakearoundDataRes = null;
        if(resMap.get("data")!=null){
            String json = resMap.get("data").toString();
            logger.debug("json --> " + json);
            shakearoundDataRes = JSON.parseObject(json, ShakearoundDataRes.class);
        }else{
            shakearoundDataRes = new ShakearoundDataRes();
        }
        AxisResult<ShakearoundDataRes> axisResult = AxisResult.create(code, msg,shakearoundDataRes);
        return axisResult;
    }
    /**
     *  申请设备
     * @param applyidAddReq
     * @return
     */
    public static AxisResult<Integer> applyid(ApplyidAddReq applyidAddReq){
        RequestUtils<ApplyidAddReq> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(applyidAddReq);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/applyid.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = null;
        if (resMap.get("data") != null){
            axisResult = AxisResult.create(code, msg,resMap.get("data"));
        }else {
            axisResult = AxisResult.create(code, msg,null);
        }
        return axisResult;
    }
    /**
     *  查看申请设备状态
     * @param refreshDeviceStatusReq
     * @return
     */
    public static AxisResult<ApplystatusDataRes> refreshDeviceStatus(RefreshDeviceStatusReq refreshDeviceStatusReq){
        RequestUtils<RefreshDeviceStatusReq> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(refreshDeviceStatusReq);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/refreshDeviceStatus.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        ApplystatusDataRes applystatusDataRes = null;
        if(resMap.get("data")!=null){
            String json = resMap.get("data").toString();
            logger.debug("json --> " + json);
            applystatusDataRes = JSON.parseObject(json, ApplystatusDataRes.class);
        }else{
            applystatusDataRes = new ApplystatusDataRes();
        }
        AxisResult<ApplystatusDataRes> axisResult = AxisResult.create(code, msg,applystatusDataRes);
        return axisResult;
    }

    /**
     *  查询设备列表
     * @param busId
     * @return
     */
    public static AxisResult<List<DevicesRes>> applySearchList(Integer busId){
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(busId);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/applySearchList.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<DevicesRes> devicesResList = null;
        if(resMap.get("data")!=null){
            String json = resMap.get("data").toString();
            logger.debug("json --> " + json);
            devicesResList = JSON.parseArray(json, DevicesRes.class);
        }else{
            devicesResList = new ArrayList<>();
        }
        AxisResult<List<DevicesRes>> axisResult = AxisResult.create(code, msg,devicesResList);
        return axisResult;
    }
    /**
     *  新增页面
     * @param pageAddReq
     * @return 返回页面id----->page_id
     */
    public static AxisResult<Integer> pageAdd(PageAddReq pageAddReq){
        RequestUtils<PageAddReq> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(pageAddReq);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/pageAdd.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        Integer pageId = 0;
        if(resMap.get("data")!=null){
            pageId = (int)resMap.get("data");
        }
        AxisResult<Integer> axisResult = AxisResult.create(code, msg,pageId);
        return axisResult;
    }

    /**
     *  修改页面
     * @param pageAddsReq
     * @return
     */
    public static AxisResult pageUpdate(PageEditReq pageAddsReq){
        RequestUtils<PageEditReq> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(pageAddsReq);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/pageUpdate.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = AxisResult.create(code, msg,null);
        return axisResult;
    }

    /**
     *  删除页面
     * @param pageRemoveReq
     * @return
     */
    public static AxisResult pageDel(PageRemoveReq pageRemoveReq){
        RequestUtils<PageRemoveReq> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(pageRemoveReq);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/pageDel.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = AxisResult.create(code, msg,null);
        return axisResult;
    }
    /**
     *  绑定页面
     * @param updateApplyReq
     * @return
     */
    public static AxisResult bindPage(UpdateApplyReq updateApplyReq){
        RequestUtils<UpdateApplyReq> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(updateApplyReq);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/bindPage.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = AxisResult.create(code, msg,null);
        return axisResult;
    }

}
