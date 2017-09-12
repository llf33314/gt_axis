package com.gt.axis.bean.wxmp.shop;

import java.util.List;

/**
 * 门店id
 * Created by psr on 2017/9/11 0011.
 */
public class QueryWxShopByFanCha {

    private Integer busId;//商家ID

    private List<Integer> ids;//ids

    public Integer getBusId() {
        return busId;
    }

    public List<Integer> getIds() {
        return ids;
    }
    /**
     * 商家ID
     * @return
     */
    public void setBusId(Integer busId) {
        this.busId = busId;
    }
    /**
     * ids
     * @return
     */
    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
