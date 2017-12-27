package com.gt.axis.bean.wxmp.wxpublic;

/**
 * Created by zwq on 2017/12/26 0026.
 *
 */
public class DevicesRes {

    private String comment;//设备的备注信息

    private String device_id;//device_id

    private String major;//major

    private String minor;//minor

    private String	uuid;//	uuid

    private Integer	status;//激活状态，0：未激活，1：已激活

    private String	last_active_time;//设备最近一次被摇到的日期（最早只能获取前一天的数据）；新申请的设备该字段值为0

    private String	poi_id;//设备关联的门店ID，关联门店后，在门店1KM的范围内有优先摇出信息的机会。门店相关信息具体可 查看门店相关的接口文档

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLast_active_time() {
        return last_active_time;
    }

    public void setLast_active_time(String last_active_time) {
        this.last_active_time = last_active_time;
    }

    public String getPoi_id() {
        return poi_id;
    }

    public void setPoi_id(String poi_id) {
        this.poi_id = poi_id;
    }
}
