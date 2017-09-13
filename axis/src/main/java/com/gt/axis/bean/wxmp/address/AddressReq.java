package com.gt.axis.bean.wxmp.address;

/**
 * 粉丝地址请求对象
 * Created by psr on 2017/9/12 0012.
 */
public class AddressReq {

    private Integer addid; // 地址ID

    /**
     * 地址ID
     * @param addid
     */
    public void setAddid(Integer addid) {
        this.addid = addid;
    }

    /**
     * 地址ID
     * @return
     */
    public Integer getAddid() {
        return addid;
    }
}
