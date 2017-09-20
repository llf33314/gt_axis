package com.gt.axis.server.member;

import com.alibaba.fastjson.JSON;
import com.gt.api.util.sign.SignHttpUtils;
import com.gt.axis.bean.member.member.MemberReq;
import com.gt.axis.bean.member.member.MemberRes;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.Map;

/**
 * 会员服务
 * Created by psr on 2017/9/20 0020.
 */
public class MemberServer {

    private static Logger logger = Logger.getLogger(MemberServer.class);

    /**
     * 根据ids集合查询粉丝信息返回包含数据(id,昵称，手机号码,头像)
     * @param memberReq
     * @return
     * @throws Exception
     */
    public static AxisResult<MemberRes> findMemberByIds(MemberReq memberReq) throws Exception{
        String url = AxisContent.getInstance().getMemberUrl() + "memberAPI/member/findMemberByIds";
        String signKey = AxisContent.getInstance().getMemberSignKey();
        String result = SignHttpUtils.postByHttp(url, memberReq, signKey);

        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = resMap.get("msg").toString();
        MemberRes memberRes = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            memberRes = JSON.parseObject(json, MemberRes.class);
        }
        AxisResult<MemberRes> axisResult = AxisResult.create(code, msg, memberRes);
        return axisResult;
    }

}
