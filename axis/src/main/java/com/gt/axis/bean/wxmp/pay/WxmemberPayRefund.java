package com.gt.axis.bean.wxmp.pay;

/**
 * Created by zwq on 2017/11/22 0022.
 *
 */
public class WxmemberPayRefund {

    private String appid;//公众号或小程序appid

    private String mchid;//支付商户号

    private String sysOrderNo;//订单号

    private Double refundFee;//退款金额

    private Double totalFee;//总金额

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    public String getSysOrderNo() {
        return sysOrderNo;
    }

    public void setSysOrderNo(String sysOrderNo) {
        this.sysOrderNo = sysOrderNo;
    }

    public Double getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Double refundFee) {
        this.refundFee = refundFee;
    }

    public Double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Double totalFee) {
        this.totalFee = totalFee;
    }
}
