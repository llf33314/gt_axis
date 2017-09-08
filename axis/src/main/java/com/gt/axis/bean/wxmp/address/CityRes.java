package com.gt.axis.bean.wxmp.address;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取省份
 * Created by psr on 2017/9/8 0008.
 */
public class CityRes {

    private Integer id; // id

    @JSONField(name = "city_code")
    private String cityCode; // 城市代码

    @JSONField(name = "city_name")
    private String cityName; // 名称

    @JSONField(name = "city_parent")
    private Integer cityParent; // 父级id

    @JSONField(name = "city_level")
    private Integer cityLevel; // 等级1--国家 2--省份 3--城市 4--县

    /**
     * id
     * @return
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 城市代码
     * @return
     */
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    /**
     * 名称
     * @return
     */
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * 父级id
     * @return
     */
    public Integer getCityParent() {
        return cityParent;
    }

    public void setCityParent(Integer cityParent) {
        this.cityParent = cityParent;
    }

    /**
     * 等级1--国家 2--省份 3--城市 4--县
     * @return
     */
    public Integer getCityLevel() {
        return cityLevel;
    }

    public void setCityLevel(Integer cityLevel) {
        this.cityLevel = cityLevel;
    }
}
