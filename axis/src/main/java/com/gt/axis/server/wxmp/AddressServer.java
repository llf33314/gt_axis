package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gt.api.util.HttpClienUtils;
import com.gt.api.util.RequestUtils;
import com.gt.api.util.sign.SignHttpUtils;
import com.gt.axis.bean.wxmp.address.*;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

/**
 * 地址服务
 * Created by psr on 2017/9/8 0008.
 */
public class AddressServer {

    private static Logger logger = Logger.getLogger(AddressServer.class);

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

    /**
     * 根据粉丝ID查询默认地址
     * @param memberAdsReq
     * @return
     */
    public static AxisResult<MemberAdsRes> addressDefault(MemberAdsReq memberAdsReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/fanAddress/addressDefault.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, memberAdsReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        MemberAdsRes memberAdsRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            memberAdsRes = JSON.parseObject(json, MemberAdsRes.class);
        }
        AxisResult<MemberAdsRes> axisResult = AxisResult.create(code, msg, memberAdsRes);
        return axisResult;
    }

    /**
     * 根据粉丝地址ID查询默认地址
     * @param addressReq
     * @return
     */
    public static AxisResult<MemberAdsRes> addreSelectId(AddressReq addressReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/fanAddress/addreSelectId.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, addressReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        MemberAdsRes memberAdsRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            memberAdsRes = JSON.parseObject(json, MemberAdsRes.class);
        }
        AxisResult<MemberAdsRes> axisResult = AxisResult.create(code, msg, memberAdsRes);
        return axisResult;
    }

    /**
     * 根据粉丝memberids查询所有的地址
     * @param memberAdsReq
     * @return
     */
    public static AxisResult<List<MemberAdsRes>> addressList(MemberAdsReq memberAdsReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/fanAddress/addressList.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, memberAdsReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<MemberAdsRes> memberAdsResList = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            memberAdsResList = JSON.parseArray(json, MemberAdsRes.class);
        }
        AxisResult<List<MemberAdsRes>> axisResult = AxisResult.create(code, msg, memberAdsResList);
        return axisResult;
    }

    /**
     * 添加/修改粉丝地址
     * @param addAddressReq
     * @return
     */
    public static AxisResult addOrUpdateAddre(AddAddressReq addAddressReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/fanAddress/AddOrUpdateAddre.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, addAddressReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = AxisResult.create(code, msg, null);
        return axisResult;
    }

    /**
     * 把地址ID改为默认地址
     * @param addressReq
     * @return
     */
    public static AxisResult updateDefault(AddressReq addressReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/fanAddress/updateDefault.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, addressReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = AxisResult.create(code, msg, null);
        return axisResult;
    }

}
