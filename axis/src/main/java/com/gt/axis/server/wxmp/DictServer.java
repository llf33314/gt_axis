package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.gt.api.util.sign.SignHttpUtils;
import com.gt.axis.bean.wxmp.dict.DictApiReq;
import com.gt.axis.bean.wxmp.dict.DictApiRes;
import com.gt.axis.bean.wxmp.dict.DictBusReq;
import com.gt.axis.bean.wxmp.dict.DictBusRes;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

/**
 * 字典服务
 * Created by psr on 2017/9/11 0011.
 */
public class DictServer {

    private static Logger logger = Logger.getLogger(DictServer.class);

    /**
     * 根据字典属性或者key获取key，value值
     * @param dictApiReq
     * @return
     * @throws Exception
     */
    public static AxisResult<List<DictApiRes>> getDictApi(DictApiReq dictApiReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/dictApi/getDictApi.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, dictApiReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<DictApiRes> dictApiResList = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            Map map = JSON.parseObject(json, Map.class);
            if (map.get("dictJSON") != null){
                dictApiResList = JSON.parseArray(map.get("dictJSON").toString(), DictApiRes.class);
            }
        }
        AxisResult<List<DictApiRes>> axisResult = AxisResult.create(code, msg, dictApiResList);
        return axisResult;
    }

    /**
     * 根据用户和字典模块属性获取创建模块的数量
     * @param dictBusReq
     * @return
     * @throws Exception
     */
    public static AxisResult<DictBusRes> getDiBserNum(DictBusReq dictBusReq) throws Exception{
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/dictApi/getDiBserNum.do";
        String signKey = AxisContent.getInstance().getWxmpSignKey();
        String result = SignHttpUtils.WxmppostByHttp(url, dictBusReq, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        DictBusRes dictBusRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            dictBusRes = JSON.parseObject(json, DictBusRes.class);
        }
        AxisResult<DictBusRes> axisResult = AxisResult.create(code, msg, dictBusRes);
        return axisResult;
    }

}
