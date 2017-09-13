package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.gt.api.util.sign.SignHttpUtils;
import com.gt.axis.bean.wxmp.erp.*;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

/**
 * ERP服务
 * Created by psr on 2017/9/11 0011.
 */
public class ErpServer {

    private static Logger logger = Logger.getLogger(ErpServer.class);

    /**
     * 获取管理的ERP列表
     * @param erpApiReq
     * @return
     * @throws Exception
     */
    public static AxisResult<List<MenusLevelList>> getErpListApi(ErpApiReq erpApiReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/ErploginApi/getErpListApi.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, erpApiReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<MenusLevelList> erpListApiResList = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            Map map = JSON.parseObject(json, Map.class);
            if (map.get("menusLevelList") != null){
                erpListApiResList = JSON.parseArray(map.get("menusLevelList").toString(), MenusLevelList.class);
            }
        }
        AxisResult<List<MenusLevelList>> axisResult = AxisResult.create(code, msg, erpListApiResList);
        return axisResult;
    }

    /**
     * 商家/员工获取ERP列表菜单
     * @param erpMenuReq
     * @return
     * @throws Exception
     */
    public static AxisResult getMenus(ErpMenuReq erpMenuReq) throws Exception{
        // TODO 待完善返回参数
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/ErploginApi/getMenus.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, erpMenuReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
        }
        AxisResult axisResult = AxisResult.create(code, msg, resMap.get("data"));
        return axisResult;
    }

    /**
     * erp商家是否有商城功能
     * @param erpApiReq
     * @return
     * @throws Exception
     */
    public static AxisResult<ErpMallRes> getMall(ErpApiReq erpApiReq) throws Exception{
        // TODO 未调通
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/ErploginApi/getMall.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, erpApiReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        ErpMallRes erpMallRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            erpMallRes = JSON.parseObject(json, ErpMallRes.class);
        }
        AxisResult<ErpMallRes> axisResult = AxisResult.create(code, msg, erpMallRes);
        return axisResult;
    }

    /**
     * 获取员工的部门和职位
     * @param erpBraPosReq
     * @return
     * @throws Exception
     */
    public static AxisResult<ErpBraPosRes> getBraPos(ErpBraPosReq erpBraPosReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/ErploginApi/getBraPos.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, erpBraPosReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        ErpBraPosRes erpBraPosRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            erpBraPosRes = JSON.parseObject(json, ErpBraPosRes.class);
        }
        AxisResult<ErpBraPosRes> axisResult = AxisResult.create(code, msg, erpBraPosRes);
        return axisResult;
    }

}
