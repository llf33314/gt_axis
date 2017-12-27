package com.gt.axis.web.controller.wxmp;

import com.alibaba.fastjson.JSONObject;
import com.gt.axis.bean.wxmp.dict.DictApiReq;
import com.gt.axis.bean.wxmp.dict.DictApiRes;
import com.gt.axis.bean.wxmp.dict.DictBusReq;
import com.gt.axis.bean.wxmp.dict.DictBusRes;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.DictServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by psr on 2017/9/11 0011.
 */
@RequestMapping(value = "/dict")
@RestController
public class DictController {

    @RequestMapping(value = "/getDictApi")
    public String getDictApi() throws Exception{
        DictApiReq dictApiReq = new DictApiReq();
        dictApiReq.setStyle("1008");
        AxisResult<List<DictApiRes>> axisResult = DictServer.getDictApi(dictApiReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getDictBusNum")
    public String getDictBusNum() throws Exception{
        DictBusReq dictBusReq = new DictBusReq();
        dictBusReq.setUserId(33);
        dictBusReq.setDictstyle("1008");
        dictBusReq.setModelStyle(0);
        AxisResult<DictBusRes> axisResult = DictServer.getDiBserNum(dictBusReq);
        return JSONObject.toJSONString(axisResult);
    }

}
