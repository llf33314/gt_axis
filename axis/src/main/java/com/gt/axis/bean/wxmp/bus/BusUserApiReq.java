package com.gt.axis.bean.wxmp.bus;

/**
 * 请求对象
 * Created by psr on 2017/9/11 0011.
 */
public class BusUserApiReq {

    private Integer userId; // 用户ID（用户ID或者用户名二选一就行）

    private String name; // 用户名（用户ID或者用户名二选一就行）

    /**
     * 用户ID（用户ID或者用户名二选一就行）
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 用户名（用户ID或者用户名二选一就行）
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
