package com.gt.axis.server.member;

import com.alibaba.fastjson.JSON;
import com.gt.api.util.sign.SignHttpUtils;
import com.gt.axis.bean.member.member.MemberReq;
import com.gt.axis.bean.member.member.MemberRes;
import com.gt.axis.content.AxisContent;
import com.gt.axis.content.AxisResult;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    public static AxisResult<List<MemberRes>> findMemberByIds(MemberReq memberReq) throws Exception{
        String url = AxisContent.getInstance().getMemberUrl() + "memberAPI/member/findMemberByIds";
        String signKey = AxisContent.getInstance().getMemberSignKey();
        Map<String,Object> params = new HashMap<>();
        params.put("busId",memberReq.getBusId());
        params.put("ids",memberReq.getIds());
        String result = SignHttpUtils.WxmppostByHttp(url, params, signKey);
        Map resMap = JSON.parseObject(result, Map.class);
        int code = (int) resMap.get("code");
        String msg = null;
        if (resMap.get("msg") != null){
            msg = resMap.get("msg").toString();
        }
        List<Map<String,Object>> memberResList = null;
        if (resMap.get("data") != null){
            String json = resMap.get("data").toString();
            logger.debug("provinces --> " + json);
            memberResList = JSON.parseObject(json, List.class);
        }

        List<MemberRes> memberResList1 = new ArrayList<>();
        if(memberResList != null){
            for (Map<String,Object> map : memberResList){
                MemberRes memberRes = new MemberRes();
                memberRes.setPhone(map.get("phone") != null ? map.get("phone").toString():"");
                memberRes.setNickname(map.get("nickname") != null ? map.get("nickname").toString():"");
                memberRes.setId(Integer.parseInt(map.get("id").toString()));
                memberRes.setHeadimgurl(map.get("headimgurl") != null ? map.get("headimgurl").toString():"");
                memberResList1.add(memberRes);
            }
        }
        AxisResult<List<MemberRes>> axisResult = AxisResult.create(code, msg, memberResList1);
        return axisResult;
    }

}
