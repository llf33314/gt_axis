package com.gt.axis.bean.wxmp.address;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 粉丝地址返回对象
 * Created by psr on 2017/9/12 0012.
 */
public class MemberAdsRes {

    private String memName; // 收货人名称

    private String memPhone; // 收货人电话

    private String memAddress; // 收货人地址

    private String memLongitude; // 经度

    private String memLatitude; // 纬度

    @JSONField(name = "df_member_id")
    private Integer dfMemberId; // 粉丝ID

    private String memDefault; // 是否默认,1-默认地址,2 不是

    private String memHouseMember; // 门牌号

    private String memZipCode; // 邮政编码

    private Integer memProvince; // 省ID

    private Integer memCity; // 市ID

    private Integer memArea; // 区ID

    private String provincename; // 省名字

    private String cityname; // 市名字

    private String areaname; // 区名字

    /**
     * 收货人名称
     * @return
     */
    public String getMemName() {
        return memName;
    }

    /**
     * 收货人电话
     * @return
     */
    public String getMemPhone() {
        return memPhone;
    }

    /**
     * 收货人地址
     * @return
     */
    public String getMemAddress() {
        return memAddress;
    }

    /**
     * 经度
     * @return
     */
    public String getMemLongitude() {
        return memLongitude;
    }

    /**
     * 纬度
     * @return
     */
    public String getMemLatitude() {
        return memLatitude;
    }

    /**
     * 粉丝ID
     * @return
     */
    public Integer getDfMemberId() {
        return dfMemberId;
    }

    /**
     * 是否默认,1-默认地址,2 不是
     * @return
     */
    public String getMemDefault() {
        return memDefault;
    }

    /**
     * 门牌号
     * @return
     */
    public String getMemHouseMember() {
        return memHouseMember;
    }

    /**
     * 邮政编码
     * @return
     */
    public String getMemZipCode() {
        return memZipCode;
    }

    /**
     * 省ID
     * @return
     */
    public Integer getMemProvince() {
        return memProvince;
    }

    /**
     * 市ID
     * @return
     */
    public Integer getMemCity() {
        return memCity;
    }

    /**
     * 区ID
     * @return
     */
    public Integer getMemArea() {
        return memArea;
    }

    /**
     * 省名字
     * @return
     */
    public String getProvincename() {
        return provincename;
    }

    /**
     * 市名字
     * @return
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * 区名字
     * @return
     */
    public String getAreaname() {
        return areaname;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public void setMemPhone(String memPhone) {
        this.memPhone = memPhone;
    }

    public void setMemAddress(String memAddress) {
        this.memAddress = memAddress;
    }

    public void setMemLongitude(String memLongitude) {
        this.memLongitude = memLongitude;
    }

    public void setMemLatitude(String memLatitude) {
        this.memLatitude = memLatitude;
    }

    public void setDfMemberId(Integer dfMemberId) {
        this.dfMemberId = dfMemberId;
    }

    public void setMemDefault(String memDefault) {
        this.memDefault = memDefault;
    }

    public void setMemHouseMember(String memHouseMember) {
        this.memHouseMember = memHouseMember;
    }

    public void setMemZipCode(String memZipCode) {
        this.memZipCode = memZipCode;
    }

    public void setMemProvince(Integer memProvince) {
        this.memProvince = memProvince;
    }

    public void setMemCity(Integer memCity) {
        this.memCity = memCity;
    }

    public void setMemArea(Integer memArea) {
        this.memArea = memArea;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }
}
