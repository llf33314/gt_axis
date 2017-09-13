package com.gt.axis.bean.wxmp.staff;

import java.util.List;

/**
 * 门店员工信息返回对象
 * Created by psr on 2017/9/13 0013.
 */
public class StaffShopListRes {

    private Integer count; // 总共数量

    private List<StaffRes> staffList; // 参数：list列表，里面的封装参数，对应下方含义

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
    public List<StaffRes> getStaffList() {
        return staffList;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setStaffList(List<StaffRes> staffList) {
        this.staffList = staffList;
    }
}
