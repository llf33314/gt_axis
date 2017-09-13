package com.gt.axis.bean.wxmp.staff;

/**
 * 门店员工信息请求对象
 * Created by psr on 2017/9/13 0013.
 */
public class StaffShopListReq {

    private Integer shopId; // 门店ID

    private Integer pageSize; // 每页数量（可以为空）

    private Integer page; // 第几页(pageSize,page为空时，代表查询店铺下面的所有员工)

    /**
     * 门店ID
     * @param shopId
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * 每页数量（可以为空）
     * @param pageSize
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 第几页(pageSize,page为空时，代表查询店铺下面的所有员工)
     * @param page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getShopId() {
        return shopId;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getPage() {
        return page;
    }
}
