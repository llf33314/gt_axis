package com.gt.axis.server.member;

import com.gt.api.util.sign.SignHttpUtils;
import com.gt.axis.bean.member.member.MemberReq;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

/**
 * 会员服务
 * Created by psr on 2017/9/20 0020.
 */
public class MemberServer {

    private static Logger logger = Logger.getLogger(MemberServer.class);

    /**
     * 根据商家ID判断是否开通某个erp 功能
     * @param memberReq
     * @return
     * @throws Exception
     */
    public static AxisResult findMemberByIds(MemberReq memberReq) throws Exception{
        String url = AxisContent.getInstance().getMemberUrl() + "memberAPI/member/findMemberByIds";
        String signKey = AxisContent.getInstance().getMemberSignKey();
        String result = SignHttpUtils.postByHttp(url, memberReq, signKey);

//        Map resMap = JSON.parseObject(result, Map.class);
//        int code = (int) resMap.get("code");
//        String msg = resMap.get("msg").toString();
//        ErpCountRes erpCountRes = null;
//        if (resMap.get("data") != null){
//            String json = resMap.get("data").toString();
//            logger.debug("provinces --> " + json);
//            erpCountRes = JSON.parseObject(json, ErpCountRes.class);
//        }
        AxisResult axisResult = AxisResult.create(1, "success", result);
        return axisResult;
    }

}
