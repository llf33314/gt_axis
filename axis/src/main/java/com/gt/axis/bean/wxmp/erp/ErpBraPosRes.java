package com.gt.axis.bean.wxmp.erp;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取员工的部门和职位返回对象
 * Created by psr on 2017/9/12 0012.
 */
public class ErpBraPosRes {

    private Integer error; // 0 代表成功返回数据，1是系统异常，2是错误提示

    private String message; // 提示消息

    @JSONField(name = "branch_name")
    private String branchName; // 部门名称

    @JSONField(name = "pos_name")
    private String posName; // 职位名称

    /**
     * 0 代表成功返回数据，1是系统异常，2是错误提示
     * @return
     */
    public Integer getError() {
        return error;
    }

    /**
     * 提示消息
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * 部门名称
     * @return
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * 职位名称
     * @return
     */
    public String getPosName() {
        return posName;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }
}
