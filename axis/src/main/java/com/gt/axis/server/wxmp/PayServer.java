package com.gt.axis.server.wxmp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gt.api.util.HttpClienUtils;
import com.gt.api.util.RequestUtils;
import com.gt.axis.bean.wxmp.address.CityRes;
import com.gt.axis.bean.wxmp.pay.WxmemberPayRefund;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;


/**
 * 支付服务
 * Created by zwq on 2017/11/22 0008.
 */
public class PayServer {

    private static Logger logger = Logger.getLogger(PayServer.class);

    /**
     *  微信退款
     * @return
     */
    public static AxisResult<String> wxmemberPayRefund(WxmemberPayRefund wxmemberPayRefund){
        RequestUtils<WxmemberPayRefund> reqRequestUtils = new RequestUtils<>();
        reqRequestUtils.setReqdata(wxmemberPayRefund);
        String messsageJson = JSONObject.toJSONString(reqRequestUtils);
        logger.debug("param --> " + messsageJson);
        String url = AxisContent.getInstance().getWxmpUrl() + "8A5DA52E/payApi/6F6D9AD2/79B4DE7C/wxmemberPayRefund.do";
        logger.debug("url --> " + url);
        Map<String, Object> resMap = HttpClienUtils.reqPostUTF8(messsageJson, url, Map.class, AxisContent.getInstance().getWxmpSignKey());
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        AxisResult<String> axisResult = AxisResult.create(code, msg, resMap.get("data")!= null ? resMap.get("data").toString():"");
        return axisResult;
    }
}
