package com.gt.axis.bean.wxmp.staff;

import com.gt.axis.bean.wxmp.bus.BusUser;

import java.util.List;

/**
 * 门店员工信息返回对象
 * Created by psr on 2017/9/13 0013.
 */
public class StaffShopChildListRes {

    private Integer count; // 总共数量

    private List<BusUser> busUserList; // 参数：list列表，里面的封装参数，对应下方含义

    /**
     * 总共数量
     * @return
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 参数：list列表，里面的封装参数，对应下方含义
     * @return
     */
    public List<BusUser> getBusUserList() {
        return busUserList;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setBusUserList(List<BusUser> busUserList) {
        this.busUserList = busUserList;
    }
}
