package com.gt.axis.web.controller.member;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.member.member.MemberReq;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.member.MemberServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by psr on 2017/9/11 0011.
 */
@RequestMapping(value = "/member")
@RestController
public class MemberController {

    @RequestMapping(value = "/findMemberByIds")
    public String findMemberByIds() throws Exception{
        MemberReq memberReq = new MemberReq();
        memberReq.setBusId(42);
        memberReq.setIds("1225643");
        AxisResult axisResult = MemberServer.findMemberByIds(memberReq);
        return JSONObject.toJSONString(axisResult);
    }

}
