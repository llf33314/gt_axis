package com.gt.axis.bean.wxmp.shop;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * 门店返回对象
 * Created by psr on 2017/9/11 0011.
 */
public class WsWxShopInfoExtend {

    private Integer id;//id

    private String sid;//多粉内部ID

    private String poiid;//微信的门店ID

    private Integer busId;//商家id

    private String businessName;//门店名

    private String branchName;//分店名

    private String categories;//门店类型主类型

    private String twoCategories;//二级类目

    private String threeCategories;//三级类目

    private String telephone;//电话(固定电话需加区号；区号、分机号均用“-”连接)

    private Integer avgPrice;//人均价格(大于零的整数，须如实填写，默认单位为人民币)

    private String startTime;//开始营业时间

    private String endTime;//关门时间

    private String special;//特色服务

    private String introduction;//简介

    private String recommend;//推荐品

    private String province;//门店所在的省份

    private String city;//城市

    private String district;//地区

    private String address;//详细街道地址

    private Integer offsetType;//坐标类型(1 为火星坐标（目前只能选1）)

    private String longitude;//经度

    private String latitude;//纬度

    private Integer status;//0：表示还没将门店信息发送到公众号审核，可修改全部内容；1：表示已发送给微信公众号审核  2 已审核通过 3审核通过后重新审核服务信息 4 送审被失败

    private String detail;//单位信息

    private Integer mainShop;//主店1：表示主店

    private String imageUrl;//第一张图片

    /**
     * id
     * @return
     */
    public Integer getId() {
        return id;
    }
    /**
     * 多粉内部ID
     * @return
     */
    public String getSid() {
        return sid;
    }
    /**
     * 微信的门店
     * @return
     */
    public String getPoiid() {
        return poiid;
    }
    /**
     * 商家id
     * @return
     */
    public Integer getBusId() {
        return busId;
    }
    /**
     * 门店名
     * @return
     */
    public String getBusinessName() {
        return businessName;
    }
    /**
     * 分店名
     * @return
     */
    public String getBranchName() {
        return branchName;
    }
    /**
     * 门店类型主类型
     * @return
     */
    public String getCategories() {
        return categories;
    }
    /**
     * 二级类目
     * @return
     */
    public String getTwoCategories() {
        return twoCategories;
    }
    /**
     * 三级类目
     * @return
     */
    public String getThreeCategories() {
        return threeCategories;
    }
    /**
     * 电话(固定电话需加区号；区号、分机号均用“-”连接)
     * @return
     */
    public String getTelephone() {
        return telephone;
    }
    /**
     * 人均价格(大于零的整数，须如实填写，默认单位为人民币)
     * @return
     */
    public Integer getAvgPrice() {
        return avgPrice;
    }
    /**
     * 开始营业时间
     * @return
     */
    public String getStartTime() {
        return startTime;
    }
    /**
     * 关门时间
     * @return
     */
    public String getEndTime() {
        return endTime;
    }
    /**
     * 特色服务
     * @return
     */
    public String getSpecial() {
        return special;
    }
    /**
     * 简介
     * @return
     */
    public String getIntroduction() {
        return introduction;
    }
    /**
     * 推荐品
     * @return
     */
    public String getRecommend() {
        return recommend;
    }
    /**
     * 门店所在的省份
     * @return
     */
    public String getProvince() {
        return province;
    }
    /**
     * 城市
     * @return
     */
    public String getCity() {
        return city;
    }
    /**
     * 地区
     * @return
     */
    public String getDistrict() {
        return district;
    }
    /**
     * 详细街道地址
     * @return
     */
    public String getAddress() {
        return address;
    }
    /**
     * 坐标类型(1 为火星坐标（目前只能选1）)
     * @return
     */
    public Integer getOffsetType() {
        return offsetType;
    }
    /**
     * 经度
     * @return
     */
    public String getLongitude() {
        return longitude;
    }
    /**
     * 纬度
     * @return
     */
    public String getLatitude() {
        return latitude;
    }
    /**
     * 0：表示还没将门店信息发送到公众号审核，可修改全部内容；1：表示已发送给微信公众号审核  2 已审核通过 3审核通过后重新审核服务信息 4 送审被失败
     * @return
     */
    public Integer getStatus() {
        return status;
    }
    /**
     * 单位信息
     * @return
     */
    public String getDetail() {
        return detail;
    }
    /**
     *主店1：表示主店
     * @return
     */
    public Integer getMainShop() {
        return mainShop;
    }
    /**
     *第一张图片
     * @return
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setPoiid(String poiid) {
        this.poiid = poiid;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public void setTwoCategories(String twoCategories) {
        this.twoCategories = twoCategories;
    }

    public void setThreeCategories(String threeCategories) {
        this.threeCategories = threeCategories;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAvgPrice(Integer avgPrice) {
        this.avgPrice = avgPrice;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOffsetType(Integer offsetType) {
        this.offsetType = offsetType;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setMainShop(Integer mainShop) {
        this.mainShop = mainShop;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
