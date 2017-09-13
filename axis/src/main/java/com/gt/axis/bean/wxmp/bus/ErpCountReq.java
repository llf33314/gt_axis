package com.gt.axis.bean.wxmp.bus;

/**
 * Created by psr on 2017/9/11 0011.
 */
public class ErpCountReq {

    private Integer userId; // 用户ID

    private String modelstyle; // erp模板 ，取自字典1180

    /**
     * 用户ID
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * erp模板 ，取自字典1180
     * @param modelstyle
     */
    public void setModelstyle(String modelstyle) {
        this.modelstyle = modelstyle;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getModelstyle() {
        return modelstyle;
    }
}
