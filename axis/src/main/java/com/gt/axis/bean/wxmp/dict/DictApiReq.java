package com.gt.axis.bean.wxmp.dict;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 字典请求对象
 * Created by psr on 2017/9/11 0011.
 */
public class DictApiReq {

    private String style; // 字典属性（不能为null）

    @JSONField(name = "item_key")
    private String itemKey; // 键（多个值用，区分），选填

    /**
     * 字典属性（不能为null）
     * @param style
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * 键（多个值用，区分），选填
     * @param itemKey
     */
    public void setItemKey(String itemKey) {
        this.itemKey = itemKey;
    }

    public String getStyle() {
        return style;
    }

    public String getItemKey() {
        return itemKey;
    }
}
