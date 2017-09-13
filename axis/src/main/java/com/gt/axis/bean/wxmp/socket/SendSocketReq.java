package com.gt.axis.bean.wxmp.socket;

/**
 * 发送socket请求对象
 * Created by psr on 2017/9/11 0011.
 */
public class SendSocketReq {

    private String pushName; // 推送人（不能为null）

    private String pushStyle; // 推送属性（有属性的要填，没有属性的不用填），选填

    private String pushMsg; // 推送内容，选填

    /**
     * 推送人（不能为null）
     * @param pushName
     */
    public void setPushName(String pushName) {
        this.pushName = pushName;
    }

    /**
     * 推送属性（有属性的要填，没有属性的不用填），选填
     * @param pushStyle
     */
    public void setPushStyle(String pushStyle) {
        this.pushStyle = pushStyle;
    }

    /**
     * 推送内容，选填
     * @param pushMsg
     */
    public void setPushMsg(String pushMsg) {
        this.pushMsg = pushMsg;
    }

    public String getPushName() {
        return pushName;
    }

    public String getPushStyle() {
        return pushStyle;
    }

    public String getPushMsg() {
        return pushMsg;
    }
}
