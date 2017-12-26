package com.gt.axis.bean.wxmp.material;

/**
 * Created by zwq on 2017/12/26 0026.
 *
 */
public class SearchMaterialReq {

    private Integer publicId;//公众号id

    private Integer type;//2:--单图文  3--多图文

    private String search;//图文标题或关键字

    public Integer getPublicId() {
        return publicId;
    }

    public void setPublicId(Integer publicId) {
        this.publicId = publicId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
