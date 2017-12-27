package com.gt.axis.bean.wxmp.wxpublic;

import java.util.List;

/**
 * Created by zwq on 2017/12/26 0026.
 *
 */
public class DeviceInfo {

    private String comment;//设备的备注信息

    private Integer poi_id;//设备关联的门店ID

    private DeviceIdentifier deviceIdentifier;//指定的设备ID

    /**
     * 待关联的页面列表
     */
    private List<Integer> page_ids;

    public List<Integer> getPage_ids() {
        return page_ids;
    }

    public void setPage_ids(List<Integer> page_ids) {
        this.page_ids = page_ids;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getPoi_id() {
        return poi_id;
    }

    public void setPoi_id(Integer poi_id) {
        this.poi_id = poi_id;
    }

    public DeviceIdentifier getDeviceIdentifier() {
        return deviceIdentifier;
    }

    public void setDeviceIdentifier(DeviceIdentifier deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }
}
