package com.gt.axis.bean.wxmp.address;

/**
 * 粉丝地址请求对象
 * Created by psr on 2017/9/12 0012.
 */
public class MemberAdsReq {

    private String memberids; // 粉丝IDS,如果粉丝没合并之前只有一个memberID，合并之后，有n个memberID，因此这n个，用，区分传给我

    /**
     * 粉丝IDS,如果粉丝没合并之前只有一个memberID，合并之后，有n个memberID，因此这n个，用，区分传给我
     * @param memberids
     */
    public void setMemberids(String memberids) {
        this.memberids = memberids;
    }

    public String getMemberids() {
        return memberids;
    }
}
