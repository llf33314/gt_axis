package com.gt.axis.bean.wxmp.staff;

/**
 * 根据门店ID获取员工列表请求对象
 * Created by psr on 2017/9/13 0013.
 */
public class StaffListReq {

    private Integer shopId; // 门店ID

    private Integer pageSize; // 每页数量（可以为空）（选填）

    private Integer page; // 第几页(pageSize,page为空时，代表查询店铺下面的所有员工)（选填）

    private String name; // 员工姓名（模糊查询，可以为空）（选填）

    private String phone; // 员工电话（模糊查询，可以为空）（选填）

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

    /**
     * 员工姓名（模糊查询，可以为空）
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 员工电话（模糊查询，可以为空）
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
