package com.gt.axis.bean.wxmp.erp;

/**
 * Erp菜单返回对象
 * Created by psr on 2017/9/11 0011.
 */
public class ErpMallRes {

    private Integer error; // 0 代表商家有商城菜单，其余代表没有商城

    private String message; // 提示消息（为什么没有商城的原因）

    /**
     * 0 代表商家有商城菜单，其余代表没有商城
     * @return
     */
    public Integer getError() {
        return error;
    }

    /**
     * 提示消息（为什么没有商城的原因）
     * @return
     */
    public String getMessage() {
        return message;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
