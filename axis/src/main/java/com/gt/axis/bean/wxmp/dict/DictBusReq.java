package com.gt.axis.bean.wxmp.dict;

/**
 * 查询商家字典请求对象
 * Created by psr on 2017/9/11 0011.
 */
public class DictBusReq {

    private Integer userId; // 商家ID

    private String dictstyle; // 字典属性

    private Integer modelStyle; // 取自字典1109

    /**
     * 商家ID
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 字典属性
     * @param dictstyle
     */
    public void setDictstyle(String dictstyle) {
        this.dictstyle = dictstyle;
    }

    /**
     * 取自字典1109
     * @param modelStyle
     */
    public void setModelStyle(Integer modelStyle) {
        this.modelStyle = modelStyle;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getDictstyle() {
        return dictstyle;
    }

    public Integer getModelStyle() {
        return modelStyle;
    }
}
