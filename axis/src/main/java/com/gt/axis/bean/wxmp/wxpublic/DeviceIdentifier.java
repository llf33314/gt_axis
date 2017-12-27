package com.gt.axis.bean.wxmp.wxpublic;

/**
 * Created by zwq on 2017/12/26 0026.
 *
 */
public class DeviceIdentifier {

    private Integer device_id;//设备编号

    private Integer poi_id;//设备关联的门店ID

    private String uuid;//uuid

    private String major;//major

    private String minor;//minor

    public Integer getDevice_id() {
        return device_id;
    }

    public void setDevice_id(Integer device_id) {
        this.device_id = device_id;
    }

    public Integer getPoi_id() {
        return poi_id;
    }

    public void setPoi_id(Integer poi_id) {
        this.poi_id = poi_id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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
}
