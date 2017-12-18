package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gt.api.util.HttpClienUtils;
import com.gt.api.util.RequestUtils;
import com.gt.axis.bean.wxmp.applet.MsgTemplateRes;
import com.gt.axis.bean.wxmp.applet.SendWxMsgTemplateReq;
import com.gt.axis.bean.wxmp.applet.WxPublicUser;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;

/**
 * 小程序服务
 * Created by psr on 2017/9/8 0008.
 */
public class AppletServer {

    private static Logger logger = Logger.getLogger(AppletServer.class);

    /**
     * 根据商家ID查询
     * @param userId 商家id
     * @return
     */
    public static AxisResult<WxPublicUser> getByUserId(Integer userId){
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(userId);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/selectByUserId.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        WxPublicUser wxPublicUser = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            wxPublicUser = JSON.parseObject(json, WxPublicUser.class);
        }
        AxisResult<WxPublicUser> axisResult = AxisResult.create(code, msg, wxPublicUser);
        return axisResult;
    }

    /**
     * 根据公众号ID查询公众号
     * @param id 公众号id
     * @return
     */
    public static AxisResult<WxPublicUser> getById(Integer id){
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(id);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/selectById.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        WxPublicUser wxPublicUser = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            wxPublicUser = JSON.parseObject(json, WxPublicUser.class);
        }
        AxisResult<WxPublicUser> axisResult = AxisResult.create(code, msg, wxPublicUser);
        return axisResult;
    }

    /**
     * 根据memberid查询公众号
     * @param memberId 会员id
     * @return
     */
    public static AxisResult<WxPublicUser> getByMemberId(Integer memberId){
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(memberId);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/selectByMemberId.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        WxPublicUser wxPublicUser = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
             wxPublicUser = JSON.parseObject(json, WxPublicUser.class);
        }
        AxisResult<WxPublicUser> axisResult = AxisResult.create(code, msg, wxPublicUser);
        return axisResult;
    }

    /**
     *  获取消息模板列表
     * @param busId 商家id
     * @return
     */
    public static AxisResult<List<MsgTemplateRes>> selectTempObjByBusId(Integer busId){
        RequestUtils<Integer> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(busId);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/selectTempObjByBusId.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        List<MsgTemplateRes> msgTemplates = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            msgTemplates = JSON.parseArray(json, MsgTemplateRes.class);
        }
        AxisResult<List<MsgTemplateRes>> axisResult = AxisResult.create(code, msg, msgTemplates);
        return axisResult;
    }
    /**
     *  发送模板消息
     * @param sendWxMsgTemplateReq 请求业务参数
     * @return
     */
    public static AxisResult sendWxMsgTemplate(SendWxMsgTemplateReq sendWxMsgTemplateReq){
        RequestUtils<SendWxMsgTemplateReq> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(sendWxMsgTemplateReq);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/wxpublicapi/6F6D9AD2/79B4DE7C/sendWxMsgTemplate.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult axisResult = AxisResult.create(code, msg,null);
        return axisResult;
    }

}
