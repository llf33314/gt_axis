package com.gt.axis.bean.wxmp.fenbiflow;

/**
 * 1、查询剩余粉币数量请求对象
 * Created by psr on 2017/11/09 0012.
 */
public class FenbiSurplus {

    private Integer busId; // 商家Id

    private Integer rec_type; // 填1

    private Integer fre_type;//活动类型(1050字典里添加)

    private Integer fkId;//应用id

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public Integer getRec_type() {
        return rec_type;
    }

    public void setRec_type(Integer rec_type) {
        this.rec_type = rec_type;
    }

    public Integer getFre_type() {
        return fre_type;
    }

    public void setFre_type(Integer fre_type) {
        this.fre_type = fre_type;
    }

    public Integer getFkId() {
        return fkId;
    }

    public void setFkId(Integer fkId) {
        this.fkId = fkId;
    }
}
