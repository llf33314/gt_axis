package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gt.api.util.HttpClienUtils;
import com.gt.api.util.RequestUtils;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;
import com.gt.axis.bean.wxmp.address.CityRes;

import java.util.List;
import java.util.Map;

/**
 * 地址服务
 * Created by psr on 2017/9/8 0008.
 */
public class AddressServer {

    private static Logger logger = Logger.getLogger(SmsServer.class);

    /**
     * 根据等级获取城市信息
     * 文档名：获取省份
     * @param level 等级1--国家 2--省份 3--城市 4--县
     * @return
     */
    public static AxisResult<List<CityRes>> listCityByLevel(int level){
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(level);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/shopapi/6F6D9AD2/79B4DE7C/queryCityByLevel.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<CityRes> listProvinceRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            listProvinceRes = JSON.parseArray(json, CityRes.class);
        }
        AxisResult<List<CityRes>> axisResult = AxisResult.create(code, msg, listProvinceRes);
        return axisResult;
    }

    /**
     * 根据父类id获取城市信息
     * 文档名：根据等级获取
     * @param parentId 父类id
     * @return
     */
    public static AxisResult<List<CityRes>> listCityByParentId(int parentId){
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(parentId);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/shopapi/6F6D9AD2/79B4DE7C/queryCityByParentId.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<CityRes> listProvinceRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            listProvinceRes = JSON.parseArray(json, CityRes.class);
        }
        AxisResult<List<CityRes>> axisResult = AxisResult.create(code, msg, listProvinceRes);
        return axisResult;
    }

    /**
     * 查询多个id的信息
     * 文档名：根据id列表查询
     * @param ids 主键，多个用逗号隔开
     * @return
     */
    public static AxisResult<List<CityRes>> listCityByIds(String ids){
        RequestUtils<String> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(ids);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/shopapi/6F6D9AD2/79B4DE7C/queryBasisCityIds.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<CityRes> listProvinceRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            listProvinceRes = JSON.parseArray(json, CityRes.class);
        }
        AxisResult<List<CityRes>> axisResult = AxisResult.create(code, msg, listProvinceRes);
        return axisResult;
    }

    /**
     * 根据城市代码查询
     * 文档名：根据code列表查询
     * @param codes City_code，多个用逗号隔开
     * @return
     */
    public static AxisResult<List<CityRes>> listCityByCodes(String codes){
        RequestUtils<String> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(codes);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/shopapi/6F6D9AD2/79B4DE7C/queryBasisByCodes.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<CityRes> listProvinceRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            listProvinceRes = JSON.parseArray(json, CityRes.class);
        }
        AxisResult<List<CityRes>> axisResult = AxisResult.create(code, msg, listProvinceRes);
        return axisResult;
    }

    /**
     * 根据城市名称查询
     * 文档名：根据name列表查询
     * @param name City_name，只能单个
     * @return
     */
    public static AxisResult<List<CityRes>> listCityByName(String name){
        RequestUtils<String> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(name);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/shopapi/6F6D9AD2/79B4DE7C/queryBasisByName.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<CityRes> listProvinceRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            listProvinceRes = JSON.parseArray(json, CityRes.class);
        }
        AxisResult<List<CityRes>> axisResult = AxisResult.create(code, msg, listProvinceRes);
        return axisResult;
    }

}
