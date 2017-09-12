package com.gt.axis.bean.wxmp.shop;

import java.util.List;

/**
 * 门店返回对象
 * Created by psr on 2017/9/11 0011.
 */
public class QueryWxShopByFanCha {

    private Integer busId;//商家ID

    private List<Integer> ids;//ids
    /**
     * 商家ID
     * @return
     */
    public Integer getBusId() {
        return busId;
    }
    /**
     * ids
     * @return
     */
    public List<Integer> getIds() {
        return ids;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
