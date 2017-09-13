package com.gt.axis.bean.wxmp.erp;

/**
 * 获取员工的部门和职位请求对象
 * Created by psr on 2017/9/12 0012.
 */
public class ErpBraPosReq {

    private Integer userId; // 员工ID（必填）

    /**
     * 员工ID（必填）
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 员工ID（必填）
     * @return
     */
    public Integer getUserId() {
        return userId;
    }
}
