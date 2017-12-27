package com.gt.axis.bean.wxmp.wxpublic;

/**
 * Created by zwq on 2017/12/26 0026.
 *
 */
public class ApplyidAddReq {

    private Integer quantity;//设备数量

    private String apply_reason;//申请理由

    private String comment;//备注

    private String poi_id;//门店id(微信)

    private Integer busId;//商家id

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getApply_reason() {
        return apply_reason;
    }

    public void setApply_reason(String apply_reason) {
        this.apply_reason = apply_reason;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPoi_id() {
        return poi_id;
    }

    public void setPoi_id(String poi_id) {
        this.poi_id = poi_id;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }
}
