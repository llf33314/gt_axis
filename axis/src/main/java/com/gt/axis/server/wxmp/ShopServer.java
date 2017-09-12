package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gt.api.util.HttpClienUtils;
import com.gt.api.util.RequestUtils;
import com.gt.axis.bean.wxmp.applet.WxPublicUser;
import com.gt.axis.bean.wxmp.shop.*;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.List;
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

    /**
     * 根据门店Id查询门店图片列表
     * @param shopId
     * @return
     */
    public static AxisResult<List<WsShopPhoto>> getShopPhotoByShopId(Integer shopId){
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(shopId);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/shopapi/6F6D9AD2/79B4DE7C/getShopPhotoByShopId.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<WsShopPhoto> wsShopPhotos = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            wsShopPhotos = JSON.parseArray(json, WsShopPhoto.class);
        }
        AxisResult<List<WsShopPhoto>> wsShopPhotoList = AxisResult.create(code, msg, wsShopPhotos);
        return wsShopPhotoList;
    }

    /**
     * 根据多个门店id查询没有删除的门店信息
     * @param shopIds
     * @return
     */
    public static AxisResult<List<Integer>> exists(List<Integer> shopIds){
        RequestUtils<List<Integer>> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(shopIds);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/shopapi/6F6D9AD2/79B4DE7C/exists.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<Integer> shopIdList = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            shopIdList = JSON.parseArray(json, Integer.class);
        }
        AxisResult<List<Integer>> shopIdLists = AxisResult.create(code, msg, shopIdList);
        return shopIdLists;
    }

    /**
     * 根据商家ID获取所有门店
     * @param busId
     * @return
     */
    public static AxisResult<List<WsWxShopInfoExtend>> queryWxShopByBusId(Integer busId){
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(busId);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/shopapi/6F6D9AD2/79B4DE7C/queryWxShopByBusId.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<WsWxShopInfoExtend> WsWxShopInfoExtends = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            WsWxShopInfoExtends = JSON.parseArray(json, WsWxShopInfoExtend.class);
        }
        AxisResult<List<WsWxShopInfoExtend>> shopIdLists = AxisResult.create(code, msg, WsWxShopInfoExtends);
        return shopIdLists;
    }

    /**
     * 新增门店中间表
     * @param shopSubsop
     * @return
     */
    public static AxisResult<Integer> addShopSubShop(ShopSubsop shopSubsop){
        RequestUtils<ShopSubsop> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(shopSubsop);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/shopapi/6F6D9AD2/79B4DE7C/addShopSubShop.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult<Integer> shopIdLists = AxisResult.create(code, msg, null);
        return shopIdLists;
    }

    /**
     * 删除门店中间表
     * @param shopSubsop
     * @return
     */
    public static AxisResult<Integer> updateBySubShop(ShopSubsop shopSubsop){
        RequestUtils<ShopSubsop> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(shopSubsop);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/shopapi/6F6D9AD2/79B4DE7C/updateBySubShop.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult<Integer> shopIdLists = AxisResult.create(code, msg, null);
        return shopIdLists;
    }


    /**
     * 根据商家ID，门店id反查门店信息
     * @param queryWxShopByFanCha
     * @return
     */
    public static AxisResult<List<WsWxShopInfoExtend>> queryWxShopByFanCha(QueryWxShopByFanCha queryWxShopByFanCha){
        RequestUtils<QueryWxShopByFanCha> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(queryWxShopByFanCha);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/shopapi/6F6D9AD2/79B4DE7C/queryWxShopByFanCha.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<WsWxShopInfoExtend> wsWxShopInfoExtends = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            wsWxShopInfoExtends = JSON.parseArray(json, WsWxShopInfoExtend.class);
        }
        AxisResult<List<WsWxShopInfoExtend>> wsWxShopInfoExtendList = AxisResult.create(code, msg, wsWxShopInfoExtends);
        return wsWxShopInfoExtendList;
    }

}
