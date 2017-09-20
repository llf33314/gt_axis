package com.gt.axis.bean.member.member;

/**
 * 根据ids集合查询粉丝信息返回包含数据(id,昵称，手机号码,头像)
 * Created by psr on 2017/9/20 0020.
 */
public class MemberRes {

    private Integer id; // memberid
    private String nickname; // 昵称
    private String headimgurl; // 头像链接

    /**
     * memberid
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     * 昵称
     * @return
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 头像链接
     * @return
     */
    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }
}
