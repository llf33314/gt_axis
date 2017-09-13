package com.gt.axis.bean.wxmp.mq;

/**
 * mq请求对象
 * Created by psr on 2017/9/13 0013.
 */
public class MqRes {

    private String exchange; // Mq 转换器

    private String queueName; // Mq 队列

    private String message; // 推送内容

    /**
     * Mq 转换器
     * @param exchange
     */
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    /**
     * Mq 队列
     * @param queueName
     */
    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    /**
     * 推送内容
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public String getExchange() {
        return exchange;
    }

    public String getQueueName() {
        return queueName;
    }

    public String getMessage() {
        return message;
    }
}
