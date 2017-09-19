package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.gt.api.util.sign.SignHttpUtils;
import com.gt.axis.bean.wxmp.bus.BusUser;
import com.gt.axis.bean.wxmp.bus.BusUserApiReq;
import com.gt.axis.bean.wxmp.bus.ErpCountReq;
import com.gt.axis.bean.wxmp.bus.ErpCountRes;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * 商家服务
 * Created by psr on 2017/9/11 0011.
 */
public class BusServer {

    private static Logger logger = Logger.getLogger(BusServer.class);

    /**
     * 根据商家ID或商家用户名获取用户信息
     * @param busUserApiReq 请求参数
     * @return
     * @throws Exception
     */
    public static AxisResult<BusUser> getBusUserApi(BusUserApiReq busUserApiReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/busUserApi/getBusUserApi.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, busUserApiReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        BusUser busUser = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            busUser = JSON.parseObject(json, BusUser.class);
        }
        AxisResult<BusUser> axisResult = AxisResult.create(code, msg, busUser);
        return axisResult;
    }

    /**
     * 根据商家ID判断是否开通某个erp 功能
     * @param erpCountReq
     * @return
     * @throws Exception
     */
    public static AxisResult<ErpCountRes> getIsErpCount(ErpCountReq erpCountReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/busUserApi/getIsErpCount.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, erpCountReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        ErpCountRes erpCountRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            erpCountRes = JSON.parseObject(json, ErpCountRes.class);
        }
        AxisResult<ErpCountRes> axisResult = AxisResult.create(code, msg, erpCountRes);
        return axisResult;
    }

}
