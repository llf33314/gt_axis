package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gt.api.util.HttpClienUtils;
import com.gt.api.util.RequestUtils;
import com.gt.axis.bean.wxmp.fenbiflow.*;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;
import java.util.List;
import java.util.Map;

/**
 * 粉币流量
 * Created by zwq on 2017/11/10 0008.
 */
public class FenbiflowServer {

    private static Logger logger = Logger.getLogger(SmsServer.class);

    /**
     * 查询剩余粉币数量(针对某个活动)
     * @return
     */
    public static AxisResult<FenBiCount> getFenbiSurplus(FenbiSurplus fenbiSurplus){
        RequestUtils<FenbiSurplus> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(fenbiSurplus);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/fenbiflow/6F6D9AD2/79B4DE7C/getFenbiSurplus.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        FenBiCount fenBiCount = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            fenBiCount = JSON.parseObject(json, FenBiCount.class);
        }
        AxisResult<FenBiCount> axisResult = AxisResult.create(code, msg, fenBiCount);
        return axisResult;
    }

    /**
     * 查询冻结记录
     * @return
     */
    public static AxisResult<FenbiFlowRecord> getFenbiFlowRecord(FenbiSurplus fenbiSurplus){
        RequestUtils<FenbiSurplus> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(fenbiSurplus);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/fenbiflow/6F6D9AD2/79B4DE7C/getFenbiFlowRecord.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        FenbiFlowRecord fenbiFlowRecord = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            fenbiFlowRecord = JSON.parseObject(json, FenbiFlowRecord.class);
        }
        AxisResult<FenbiFlowRecord> axisResult = AxisResult.create(code, msg, fenbiFlowRecord);
        return axisResult;
    }

    /**
     * 保存冻结记录
     * @return
     */
    public static AxisResult saveFenbiFlowRecord(FenbiFlowRecordReq fenbiFlowRecordReq){
        RequestUtils<FenbiFlowRecordReq> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(fenbiFlowRecordReq);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/fenbiflow/6F6D9AD2/79B4DE7C/saveFenbiFlowRecord.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = AxisResult.create(code, msg,null);
        return axisResult;
    }

    /**
     *  修改冻结记录的使用数量
     * @return
     */
    public static AxisResult updateFenbiReduce(UpdateFenbiReduceReq updateFenbiReduceReq){
        RequestUtils<UpdateFenbiReduceReq> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(updateFenbiReduceReq);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/fenbiflow/6F6D9AD2/79B4DE7C/updateFenbiReduce.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = AxisResult.create(code, msg,null);
        return axisResult;
    }

    /**
     * 回滚冻结粉币
     * @return
     */
    public static AxisResult rollbackFenbiRecord(FenbiSurplus fenbiSurplus){
        RequestUtils<FenbiSurplus> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(fenbiSurplus);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/fenbiflow/6F6D9AD2/79B4DE7C/rollbackFenbiRecord.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = AxisResult.create(code, msg,null);
        return axisResult;
    }

    /**
     * 修改商家冻结数量
     * @return
     */
    public static AxisResult updaterecUseCountVer2(UpdateFenbiReduceReq updateFenbiReduceReq){
        RequestUtils<UpdateFenbiReduceReq> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(updateFenbiReduceReq);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/fenbiflow/6F6D9AD2/79B4DE7C/updaterecUseCountVer2.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = AxisResult.create(code, msg,null);
        return axisResult;
    }

    /**
     *  根据商家id获取商家流量
     * @param busId
     * @return
     */
    public static AxisResult<List<BusFlowRes>> getBusFlowsByUserId(Integer busId) throws Exception{
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(busId);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/fenbiflow/6F6D9AD2/79B4DE7C/getBusFlowsByUserId.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<BusFlowRes> listProvinceRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            listProvinceRes = JSON.parseArray(json, BusFlowRes.class);
        }
        AxisResult<List<BusFlowRes>> axisResult = AxisResult.create(code, msg, listProvinceRes);
        return axisResult;
    }

    /**
     *  流量兑换(充值)
     * @param adcServicesInfo
     * @return
     */
    public static AxisResult adcServices(AdcServicesInfoReq adcServicesInfo) throws Exception{
        RequestUtils<AdcServicesInfoReq> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(adcServicesInfo);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/fenbiflow/6F6D9AD2/79B4DE7C/adcServices.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = AxisResult.create(code, msg,null);
        return axisResult;
    }

}
