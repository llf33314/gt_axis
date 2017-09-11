package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gt.api.util.HttpClienUtils;
import com.gt.api.util.RequestUtils;
import com.gt.axis.bean.wxmp.applet.WxPublicUser;
import com.gt.axis.bean.wxmp.shop.WsWxShopInfo;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * 门店服务
 * Created by psr on 2017/9/11 0011.
 */
public class ShopServer {

    private static Logger logger = Logger.getLogger(ShopServer.class);

    /**
     * 根据ID获取门店信息
     * @param shopId
     * @return
     */
    public static AxisResult<WsWxShopInfo> getShopById(Integer shopId){
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(shopId);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/shopapi/6F6D9AD2/79B4DE7C/getShopById.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        WsWxShopInfo wxShopInfo = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            wxShopInfo = JSON.parseObject(json, WsWxShopInfo.class);
        }
        AxisResult<WsWxShopInfo> axisResult = AxisResult.create(code, msg, wxShopInfo);
        return axisResult;
    }

}
