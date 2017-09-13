package com.gt.axis.bean.wxmp.dict;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 字典请求对象
 * Created by psr on 2017/9/11 0011.
 */
public class DictApiRes {

    @JSONField(name = "item_key")
    private String itemKey; // 键

    @JSONField(name = "item_value")
    private String itemValue; // 值

    @JSONField(name = "item_remark")
    private String itemRemark; // 备注

    /**
     * 键
     * @return
     */
    public String getItemKey() {
        return itemKey;
    }

    /**
     * 值
     * @return
     */
    public String getItemValue() {
        return itemValue;
    }

    /**
     * 备注
     * @return
     */
    public String getItemRemark() {
        return itemRemark;
    }

    public void setItemKey(String itemKey) {
        this.itemKey = itemKey;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    public void setItemRemark(String itemRemark) {
        this.itemRemark = itemRemark;
    }
}
