package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.gt.api.util.sign.SignHttpUtils;
import com.gt.axis.bean.wxmp.child.ChildUserReq;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * 子账号服务
 * Created by psr on 2017/9/12 0012.
 */
public class ChildServer {

    private static Logger logger = Logger.getLogger(ChildServer.class);

    /**
     * 判断子账号是否是管理员
     * @param childUserReq
     * @return
     */
    public static AxisResult<Integer> getIsAdmin(ChildUserReq childUserReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/childBusUserApi/getIsAdmin.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, childUserReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        Integer isadmin = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            Map<String, Integer> map = JSON.parseObject(json, Map.class);
            if(map.get("isadmin") != null){
                isadmin = map.get("isadmin");
            }
        }
        AxisResult<Integer> axisResult = AxisResult.create(code, msg, isadmin);
        return axisResult;
    }

    /**
     * 根据子账号获取主账号商家
     * @param childUserReq
     * @return
     */
    public static AxisResult<Integer> getMainBusId(ChildUserReq childUserReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/childBusUserApi/getMainBusId.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, childUserReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        Integer mainBusId = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            Map<String, Integer> map = JSON.parseObject(json, Map.class);
            if(map.get("mainBusId") != null){
                mainBusId = map.get("mainBusId");
            }
        }
        AxisResult<Integer> axisResult = AxisResult.create(code, msg, mainBusId);
        return axisResult;
    }

}
