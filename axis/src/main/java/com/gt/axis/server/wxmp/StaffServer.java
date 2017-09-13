package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.gt.api.util.sign.SignHttpUtils;
import com.gt.axis.bean.wxmp.bus.BusUser;
import com.gt.axis.bean.wxmp.staff.*;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

/**
 * 员工服务
 * Created by psr on 2017/9/12 0012.
 */
public class StaffServer {

    private static Logger logger = Logger.getLogger(StaffServer.class);

    /**
     * 根据员工ID获取员工相关信息
     * @param staffReq
     * @return
     */
    public static AxisResult<StaffRes> getStaffId(StaffReq staffReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/staffApiMsg/getStaffId.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, staffReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        StaffRes staffRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            staffRes = JSON.parseObject(json, StaffRes.class);
        }
        AxisResult<StaffRes> axisResult = AxisResult.create(code, msg, staffRes);
        return axisResult;
    }

    /**
     * 验证员工登录名和密码
     * @param staffCheckReq
     * @return
     */
    public static AxisResult<StaffCheckRes> getStaffVerSion(StaffCheckReq staffCheckReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/staffApiMsg/getStaffVerSion.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, staffCheckReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        StaffCheckRes staffCheckRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            staffCheckRes = JSON.parseObject(json, StaffCheckRes.class);
        }
        AxisResult<StaffCheckRes> axisResult = AxisResult.create(code, msg, staffCheckRes);
        return axisResult;
    }

    /**
     * 根据门店ID获取员工列表分页功能（支持员工姓名，手机登模糊查询）
     * @param staffListReq
     * @return
     */
    public static AxisResult<StaffShopListRes> getStaffListShopId(StaffListReq staffListReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/staffApiMsg/getStaffListShopId.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, staffListReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        StaffShopListRes staffShopListRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            Map<String, Object> map = JSON.parseObject(json, Map.class);
            if (map.get("count") != null && map.get("staffList") != null){
                staffShopListRes = new StaffShopListRes();
                staffShopListRes.setCount((Integer) map.get("count"));
                List<StaffRes> staffResList = JSON.parseArray((String) map.get("staffList"), StaffRes.class);
                staffShopListRes.setStaffList(staffResList);
            }

        }
        AxisResult<StaffShopListRes> axisResult = AxisResult.create(code, msg, staffShopListRes);
        return axisResult;
    }

    /**
     * 根据门店ID获取该店铺的所有员工和管理员信息
     * @param staffShopReq
     * @return
     */
    public static AxisResult<List<StaffShopRes>> getAllStaffShopId(StaffShopReq staffShopReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/staffApiMsg/getAllStaffShopId.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, staffShopReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<StaffShopRes> staffShopResList = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            Map<String, String> map = JSON.parseObject(json, Map.class);
            if (map.get("allList") != null){
                staffShopResList = JSON.parseArray(map.get("allList"), StaffShopRes.class);
            }
        }
        AxisResult<List<StaffShopRes>> axisResult = AxisResult.create(code, msg, staffShopResList);
        return axisResult;
    }

    /**
     * 根据门店ID获取管理员（子账号）分页列表信息
     * @param staffShopListReq
     * @return
     */
    public static AxisResult<StaffShopChildListRes> getChildListShopId(StaffShopListReq staffShopListReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/staffApiMsg/getChildListShopId.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, staffShopListReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        StaffShopChildListRes staffShopChildListRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            Map<String, Object> map = JSON.parseObject(json, Map.class);
            if (map.get("count") != null && map.get("busUserList") != null){
                staffShopChildListRes = new StaffShopChildListRes();
                staffShopChildListRes.setCount((Integer) map.get("count"));
                List<BusUser> busUsers = JSON.parseArray((String) map.get("busUserList"), BusUser.class);
                staffShopChildListRes.setBusUserList(busUsers);
            }
        }
        AxisResult<StaffShopChildListRes> axisResult = AxisResult.create(code, msg, staffShopChildListRes);
        return axisResult;
    }

}
