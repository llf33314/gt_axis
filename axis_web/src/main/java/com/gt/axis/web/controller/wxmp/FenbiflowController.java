package com.gt.axis.web.controller.wxmp;


import com.alibaba.fastjson.JSONObject;
import com.gt.api.exception.SignException;
import com.gt.axis.bean.wxmp.fenbiflow.*;
import com.gt.axis.content.AxisResult;
import com.gt.axis.server.wxmp.FenbiflowServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zwq on 2017/11/09 0008.
 *
 */
@RequestMapping("/fenbiflow")
@RestController
public class FenbiflowController {

    @RequestMapping(value = "/getFenbiSurplus")
    public String getFenbiSurplus() throws SignException {
        FenbiSurplus fenbiSurplus = new FenbiSurplus();
        fenbiSurplus.setBusId(33);
        fenbiSurplus.setFkId(1);
        fenbiSurplus.setFre_type(1);
        fenbiSurplus.setRec_type(1);
        AxisResult<FenBiCount> axisResult = FenbiflowServer.getFenbiSurplus(fenbiSurplus);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getFenbiFlowRecord")
    public String getFenbiFlowRecord(){
        FenbiSurplus fenbiSurplus = new FenbiSurplus();
        fenbiSurplus.setBusId(33);
        fenbiSurplus.setFkId(1);
        fenbiSurplus.setFre_type(1);
        fenbiSurplus.setRec_type(1);
        AxisResult<FenbiFlowRecord> axisResult = FenbiflowServer.getFenbiFlowRecord(fenbiSurplus);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/saveFenbiFlowRecord")
    public String saveFenbiFlowRecord(){
        FenbiFlowRecordReq fenbiFlowRecordReq = new FenbiFlowRecordReq();
        fenbiFlowRecordReq.setBusUserId(1);
        fenbiFlowRecordReq.setFlowId(1);
        fenbiFlowRecordReq.setFlowType(1);
        fenbiFlowRecordReq.setRecCount(11.0);
        fenbiFlowRecordReq.setRecDesc("22");
        fenbiFlowRecordReq.setRecFkId(1);
        fenbiFlowRecordReq.setRecFreezeType(1);
        fenbiFlowRecordReq.setRecType(1);
        fenbiFlowRecordReq.setRecUseCount(33.0);
        fenbiFlowRecordReq.setRollStatus(1);
        AxisResult axisResult = FenbiflowServer.saveFenbiFlowRecord(fenbiFlowRecordReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/updateFenbiReduce")
    public String updateFenbiReduce(){
        UpdateFenbiReduceReq UpdateFenbiReduceReq = new UpdateFenbiReduceReq();
        UpdateFenbiReduceReq.setBusId(33);
        UpdateFenbiReduceReq.setCount(55.0);
        UpdateFenbiReduceReq.setFkId(1);
        UpdateFenbiReduceReq.setFreType(1);
        AxisResult axisResult = FenbiflowServer.updateFenbiReduce(UpdateFenbiReduceReq);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/rollbackFenbiRecord")
    public String rollbackFenbiRecord(){
        FenbiSurplus FenbiSurplus = new FenbiSurplus();
        FenbiSurplus.setBusId(33);
        FenbiSurplus.setRec_type(1);
        FenbiSurplus.setFkId(1);
        FenbiSurplus.setFre_type(1);
        AxisResult axisResult = FenbiflowServer.rollbackFenbiRecord(FenbiSurplus);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/getBusFlowsByUserId")
    public String getBusFlowsByUserId() throws Exception {
        Integer busId = 33;
        AxisResult<List<BusFlowRes>> axisResult = FenbiflowServer.getBusFlowsByUserId(busId);
        return JSONObject.toJSONString(axisResult);
    }

    @RequestMapping(value = "/adcServices")
    public String adcServices() throws Exception{
        AdcServicesInfoReq adcServicesInfoReq = new AdcServicesInfoReq();
        adcServicesInfoReq.setBusId(33);
        adcServicesInfoReq.setId(1);
        adcServicesInfoReq.setMemberId(11);
        adcServicesInfoReq.setMobile("13414621797");
        adcServicesInfoReq.setModel(1);
        adcServicesInfoReq.setNotifyUrl("14541");
        adcServicesInfoReq.setPrizeCount(232);
        AxisResult axisResult = FenbiflowServer.adcServices(adcServicesInfoReq);
        return JSONObject.toJSONString(axisResult);
    }


}

