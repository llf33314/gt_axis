package com.gt.axis.bean.wxmp.material;

/**
 * Created by zwq on 2017/12/26 0026.
 *
 */
public class MateralRes {
    private Integer id ;//id

    private Integer pid ;//父id

    private String keyword ; //关键字

    private Integer type ; // 图文类型 素材类型(1.文本, 2.单图文, 3.多图文, 4.语音消息, 5.音乐回复)

    private Integer publicUsersId;//公众号id

    private String title;//标题

    private ResImageRes image;//封面资源信息

    private String author;//作者

    private String digest;//图文消息的摘要，仅有单图文消息才有摘要，多图文此处为空

    private Integer contentType;//文本类型(0.内容自创, 1.网站连接, 2.模块)

    private String content;// 内容

    private Integer sort;//排序

    private String description;//描述

    private Integer status;//状态

    private String createTime;//创建时间

    private Integer article_id;//文章id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPublicUsersId() {
        return publicUsersId;
    }

    public void setPublicUsersId(Integer publicUsersId) {
        this.publicUsersId = publicUsersId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ResImageRes getImage() {
        return image;
    }

    public void setImage(ResImageRes image) {
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }
}
