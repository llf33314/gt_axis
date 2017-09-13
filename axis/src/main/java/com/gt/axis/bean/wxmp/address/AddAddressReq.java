package com.gt.axis.bean.wxmp.address;

/**
 * 添加或修改地址请求对象
 * Created by psr on 2017/9/12 0012.
 */
public class AddAddressReq {

    private Integer id; // 地址ID

    private String memName; // 收货人名称

    private String memPhone; // 收货人电话

    private String memAddress; // 收货人地址（选填）

    private String memLongitude; // 经度（选填）

    private String memLatitude; // 纬度（选填）

    private Integer dfMemberId; // 粉丝ID

    private String memDefault; // 是否默认,1-默认地址,2 不是

    private String memHouseMember; // 门牌号（选填）

    private String memZipCode; // 邮政编码（选填）

    private Integer memProvince; // 省ID（选填）

    private Integer memCity; // 市ID（选填）

    private Integer memArea; // 区ID（选填）

    /**
     * 地址ID
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 收货人名称
     * @param memName
     */
    public void setMemName(String memName) {
        this.memName = memName;
    }

    /**
     * 收货人电话
     * @param memPhone
     */
    public void setMemPhone(String memPhone) {
        this.memPhone = memPhone;
    }

    /**
     * 收货人地址（选填）
     * @param memAddress
     */
    public void setMemAddress(String memAddress) {
        this.memAddress = memAddress;
    }

    /**
     * 经度（选填）
     * @param memLongitude
     */
    public void setMemLongitude(String memLongitude) {
        this.memLongitude = memLongitude;
    }

    /**
     * 纬度（选填）
     * @param memLatitude
     */
    public void setMemLatitude(String memLatitude) {
        this.memLatitude = memLatitude;
    }

    /**
     * 粉丝ID
     * @param dfMemberId
     */
    public void setDfMemberId(Integer dfMemberId) {
        this.dfMemberId = dfMemberId;
    }

    /**
     * 是否默认,1-默认地址,2 不是
     * @param memDefault
     */
    public void setMemDefault(String memDefault) {
        this.memDefault = memDefault;
    }

    /**
     * 门牌号（选填）
     * @param memHouseMember
     */
    public void setMemHouseMember(String memHouseMember) {
        this.memHouseMember = memHouseMember;
    }

    /**
     * 邮政编码（选填）
     * @param memZipCode
     */
    public void setMemZipCode(String memZipCode) {
        this.memZipCode = memZipCode;
    }

    /**
     * 省ID（选填）
     * @param memProvince
     */
    public void setMemProvince(Integer memProvince) {
        this.memProvince = memProvince;
    }

    /**
     * 市ID（选填）
     * @param memCity
     */
    public void setMemCity(Integer memCity) {
        this.memCity = memCity;
    }

    /**
     * 区ID（选填）
     * @param memArea
     */
    public void setMemArea(Integer memArea) {
        this.memArea = memArea;
    }

    public Integer getId() {
        return id;
    }

    public String getMemName() {
        return memName;
    }

    public String getMemPhone() {
        return memPhone;
    }

    public String getMemAddress() {
        return memAddress;
    }

    public String getMemLongitude() {
        return memLongitude;
    }

    public String getMemLatitude() {
        return memLatitude;
    }

    public Integer getDfMemberId() {
        return dfMemberId;
    }

    public String getMemDefault() {
        return memDefault;
    }

    public String getMemHouseMember() {
        return memHouseMember;
    }

    public String getMemZipCode() {
        return memZipCode;
    }

    public Integer getMemProvince() {
        return memProvince;
    }

    public Integer getMemCity() {
        return memCity;
    }

    public Integer getMemArea() {
        return memArea;
    }
}
