package com.gt.axis.web.controller.wxmp;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.child.ChildUserReq;
import com.gt.axis.bean.wxmp.dict.DictBusReq;
import com.gt.axis.bean.wxmp.dict.DictBusRes;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.ChildServer;
import com.gt.axis.server.wxmp.DictServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by psr on 2017/9/12 0012.
 */
@RequestMapping(value = "/child")
@RestController
public class ChildController {

    @RequestMapping(value = "/getIsAdmin")
    public String getIsAdmin() throws Exception{
        ChildUserReq childUserReq = new ChildUserReq();
        childUserReq.setUserId(42);
        AxisResult<Integer> axisResult = ChildServer.getIsAdmin(childUserReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getMainBusId")
    public String getMainBusId() throws Exception{
        ChildUserReq childUserReq = new ChildUserReq();
        childUserReq.setUserId(42);
        AxisResult<Integer> axisResult = ChildServer.getMainBusId(childUserReq);
        return JSONObject.toJSONString(axisResult);
    }

}
