package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gt.api.util.HttpClienUtils;
import com.gt.api.util.RequestUtils;
import com.gt.axis.bean.wxmp.wxpublic.WxJsSdk;
import com.gt.axis.bean.wxmp.wxpublic.WxJsSdkResult;
import com.gt.axis.bean.wxmp.wxpublic.WxPublicUsers;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

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

}
