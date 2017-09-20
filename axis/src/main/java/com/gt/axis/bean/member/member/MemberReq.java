package com.gt.axis.bean.member.member;

/**
 * 根据ids集合查询粉丝信息返回包含数据(id,昵称，手机号码,头像)
 * Created by psr on 2017/9/20 0020.
 */
public class MemberReq {

    private Integer busId; // 商家id

    private String ids; // 用，逗号隔开

    /**
     * 商家id
     * @param busId
     */
    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public Integer getBusId() {
        return busId;
    }

    public String getIds() {
        return ids;
    }

    /**
     * 用，逗号隔开
     * @param ids
     */
    public void setIds(String ids) {
        this.ids = ids;
    }
}
