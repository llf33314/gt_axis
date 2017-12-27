package com.gt.axis.bean.wxmp.wxpublic;

/**
 * Created by zwq on 2017/12/26 0026.
 *
 */
public class RefreshDeviceStatusReq {

    private String apply_id;//申请的批次ID

    private Integer busId;//商家id

    public String getApply_id() {
        return apply_id;
    }

    public void setApply_id(String apply_id) {
        this.apply_id = apply_id;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }
}
