package com.gt.axis.bean.wxmp.fenbiflow;

/**
 * Created by zwq on 2017/11/9 0009.
 *  修改冻结记录的使用数量请求参数
 */
public class UpdateFenbiReduceReq {

    private Integer busId;//商家Id

    private Double count;//使用数量

    private Integer fkId;//应用id

    private Integer freType;//活动类型(1050字典里添加)

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public Integer getFkId() {
        return fkId;
    }

    public void setFkId(Integer fkId) {
        this.fkId = fkId;
    }

    public Integer getFreType() {
        return freType;
    }

    public void setFreType(Integer freType) {
        this.freType = freType;
    }
}
