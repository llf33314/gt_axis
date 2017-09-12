package com.gt.axis.bean.wxmp.shop;

/**
 * 门店信息
 * Created by psr on 2017/9/11 0011.
 */
public class WsWxShopInfo {

    private Integer id; // id

    private String sid; // 多粉内部ID

    private String poiid; // 微信门店id

    private Integer busId; // 商家id

    private String businessName; // 门店名

    private String branchName; // 分店名

    private String categories; // 门店类型主类型

    private String twoCategories; // 二级类目

    private String threeCategories; // 三级类目

    private String telephone; // 电话(固定电话需加区号；区号、分机号均用“-”连接)

    private Integer avgPrice; // 人均价格(大于零的整数，须如实填写，默认单位为人民币)

    private String startTime; // 开始营业时间

    private String endTime; // 关门时间

    private String special; // 特色服务

    private String introduction; // 简介

    private String recommend; // 推荐品

    private String province; // 门店所在的省份

    private String city; // 城市

    private String district; // 地区

    private String address; // 详细街道地址

    private Integer offsetType; // 坐标类型(1 为火星坐标（目前只能选1）)

    private String longitude; // 经度

    private String latitude; // 纬度

    private Integer status; // 0：表示还没将门店信息发送到公众号审核，可修改全部内容；1：表示已发送给微信公众号审核  2 已审核通过 3审核通过后重新审核服务信息 4 送审被失败

    private String detail; // 单位信息

    private Integer mainShop; // 主店1：表示主店


    public Integer getId() {
        return id;
    }

    public String getSid() {
        return sid;
    }

    public String getPoiid() {
        return poiid;
    }

    public Integer getBusId() {
        return busId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getCategories() {
        return categories;
    }

    public String getTwoCategories() {
        return twoCategories;
    }

    public String getThreeCategories() {
        return threeCategories;
    }

    public String getTelephone() {
        return telephone;
    }

    public Integer getAvgPrice() {
        return avgPrice;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getSpecial() {
        return special;
    }

    public String getIntroduction() {
        return introduction;
    }

    public String getRecommend() {
        return recommend;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getAddress() {
        return address;
    }

    public Integer getOffsetType() {
        return offsetType;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public Integer getStatus() {
        return status;
    }

    public String getDetail() {
        return detail;
    }


    public Integer getMainShop() {
        return mainShop;
    }
    /**
     * id
     * @return
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * 多粉内部ID
     * @return
     */
    public void setSid(String sid) {
        this.sid = sid;
    }
    /**
     * 微信门店id
     * @return
     */
    public void setPoiid(String poiid) {
        this.poiid = poiid;
    }
    /**
     * 商家id
     * @return
     */
    public void setBusId(Integer busId) {
        this.busId = busId;
    }
    /**
     * 门店名
     * @return
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
    /**
     * 分店名
     * @return
     */
    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    /**
     * 门店类型主类型
     * @return
     */
    public void setCategories(String categories) {
        this.categories = categories;
    }
    /**
     * 二级类目
     * @return
     */
    public void setTwoCategories(String twoCategories) {
        this.twoCategories = twoCategories;
    }
    /**
     * 三级类目
     * @return
     */
    public void setThreeCategories(String threeCategories) {
        this.threeCategories = threeCategories;
    }
    /**
     * 电话(固定电话需加区号；区号、分机号均用“-”连接)
     * @return
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    /**
     * 人均价格(大于零的整数，须如实填写，默认单位为人民币)
     * @return
     */
    public void setAvgPrice(Integer avgPrice) {
        this.avgPrice = avgPrice;
    }
    /**
     * 开始营业时间
     * @return
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    /**
     * 关门时间
     * @return
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    /**
     * 特色服务
     * @return
     */
    public void setSpecial(String special) {
        this.special = special;
    }
    /**
     * 简介
     * @return
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
    /**
     * 推荐品
     * @return
     */
    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }
    /**
     * 门店所在的省份
     * @return
     */
    public void setProvince(String province) {
        this.province = province;
    }
    /**
     * 城市
     * @return
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * 地区
     * @return
     */
    public void setDistrict(String district) {
        this.district = district;
    }
    /**
     * 详细街道地址
     * @return
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * 坐标类型(1 为火星坐标（目前只能选1）)
     * @return
     */
    public void setOffsetType(Integer offsetType) {
        this.offsetType = offsetType;
    }
    /**
     * 经度
     * @return
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    /**
     * 纬度
     * @return
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
    /**
     * 0：表示还没将门店信息发送到公众号审核，可修改全部内容；1：表示已发送给微信公众号审核  2 已审核通过 3审核通过后重新审核服务信息 4 送审被失败
     * @return
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
    /**
     * 单位信息
     * @return
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }
    /**
     * 主店1：表示主店
     * @return
     */
    public void setMainShop(Integer mainShop) {
        this.mainShop = mainShop;
    }
}
