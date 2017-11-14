package com.gt.axis.bean.wxmp.fenbiflow;

/**
 * Created by zwq on 2017/11/9 0009.
 * 查询冻结记录返回对象
 */
public class FenbiFlowRecord {

    private Integer id;//主键

    private Integer busUserId;//商家id

    private Integer recType;//类型(1:粉币 2:流量)

    private Double recCount;//冻结数量

    private Double recUseCount;//已使用数量

    private Integer recFreezeType;//活动类型

    private Integer recFkId;//应用id

    private Integer rollStatus;//是否已回滚 2:表示已回滚不能再使用

    private Integer flowType;//recType=1时有返回，流量规格:10，30，100，500

    private Integer flowId;//流量表id

    private String recDesc;//描述

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusUserId() {
        return busUserId;
    }

    public void setBusUserId(Integer busUserId) {
        this.busUserId = busUserId;
    }

    public Integer getRecType() {
        return recType;
    }

    public void setRecType(Integer recType) {
        this.recType = recType;
    }

    public Double getRecCount() {
        return recCount;
    }

    public void setRecCount(Double recCount) {
        this.recCount = recCount;
    }

    public Double getRecUseCount() {
        return recUseCount;
    }

    public void setRecUseCount(Double recUseCount) {
        this.recUseCount = recUseCount;
    }

    public Integer getRecFreezeType() {
        return recFreezeType;
    }

    public void setRecFreezeType(Integer recFreezeType) {
        this.recFreezeType = recFreezeType;
    }

    public Integer getRecFkId() {
        return recFkId;
    }

    public void setRecFkId(Integer recFkId) {
        this.recFkId = recFkId;
    }

    public Integer getRollStatus() {
        return rollStatus;
    }

    public void setRollStatus(Integer rollStatus) {
        this.rollStatus = rollStatus;
    }

    public Integer getFlowType() {
        return flowType;
    }

    public void setFlowType(Integer flowType) {
        this.flowType = flowType;
    }

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public String getRecDesc() {
        return recDesc;
    }

    public void setRecDesc(String recDesc) {
        this.recDesc = recDesc;
    }
}
