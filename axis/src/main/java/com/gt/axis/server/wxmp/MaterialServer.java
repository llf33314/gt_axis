package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gt.api.util.HttpClienUtils;
import com.gt.api.util.RequestUtils;
import com.gt.axis.bean.wxmp.material.MateralRes;
import com.gt.axis.bean.wxmp.material.MateralWrapRes;
import com.gt.axis.bean.wxmp.material.SearchMaterialReq;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

/**
 * Created by zwq on 2017/12/26 0026.
 *
 */
public class MaterialServer {

    private static Logger logger = Logger.getLogger(MaterialServer.class);

    /**
     * 查询条件图文列表
     * @param searchMaterialReq
     *              publicId 公众号id
     *              type    2:--单图文  3--多图文
     *              search  图文标题或关键字
     * @return
     */
    public static AxisResult<List<MateralWrapRes>> searchMaterialList(SearchMaterialReq searchMaterialReq){
        RequestUtils<SearchMaterialReq> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(searchMaterialReq);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/materialapi/6F6D9AD2/79B4DE7C/searchMaterialList.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        if (resMap != null){
            int code = (int) resMap.get("code");
            String msg =  resMap.get("msg") != null ? resMap.get("msg").toString() : "";
            List<MateralWrapRes> materalWrapRes = null;
            if (resMap.get("data") != null){
                String json = resMap.get("data").toString();
                logger.debug("provinces --> " + json);
                materalWrapRes = JSON.parseArray(json, MateralWrapRes.class);
            }
            AxisResult<List<MateralWrapRes>> axisResult = AxisResult.create(code, msg, materalWrapRes);
            return axisResult;
        }
        return null;
    }

    /**
     * 根据id查询图文信息
     * @param id
     * @return
     */
    public static AxisResult<MateralRes> searchMaterialById(Integer id){
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(id);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/materialapi/6F6D9AD2/79B4DE7C/searchMaterialById.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        if (resMap != null){
            int code = (int) resMap.get("code");
            String msg =  resMap.get("msg") != null ? resMap.get("msg").toString() : "";
            MateralRes materalRes = null;
            if (resMap.get("data") != null){
                String json = resMap.get("data").toString();
                logger.debug("provinces --> " + json);
                materalRes = JSON.parseObject(json, MateralRes.class);
            }
            AxisResult<MateralRes> axisResult = AxisResult.create(code, msg, materalRes);
            return axisResult;
        }
        return null;
    }

    /**
     * 查询父级id查询子图文信息
     * @param id
     * @return
     */
    public static AxisResult<MateralWrapRes> searchMaterialByPid(Integer id){
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(id);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/materialapi/6F6D9AD2/79B4DE7C/searchMaterialByPid.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        if (resMap != null){
            int code = (int) resMap.get("code");
            String msg =  resMap.get("msg") != null ? resMap.get("msg").toString() : "";
            MateralWrapRes materalRes = null;
            if (resMap.get("data") != null){
                String json = resMap.get("data").toString();
                logger.debug("provinces --> " + json);
                materalRes = JSON.parseObject(json, MateralWrapRes.class);
            }
            AxisResult<MateralWrapRes> axisResult = AxisResult.create(code, msg, materalRes);
            return axisResult;
        }
        return null;
    }
}
