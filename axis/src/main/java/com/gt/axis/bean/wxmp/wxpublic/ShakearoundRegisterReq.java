package com.gt.axis.bean.wxmp.wxpublic;

import java.util.List;

/**
 * Created by zwq on 2017/12/26 0026.
 *
 */
public class ShakearoundRegisterReq {

    private String name;//联系人姓名

    private String phone_number;//联系人电话

    private String email;//联系人邮箱

    private String industry_id;//行业代号

    private List<String> url;//资质文件(路径传是image之后的部分，
                            // 如：http://maint.duofriend.com/upload/image/2/gh_280b64d22b2c/3/88063/5728364F354C44F78CA1A4666C7936F7.jpg，
                            // 传过来给我的是/2/gh_280b64d22b2c/3/88063/5728364F354C44F78CA1A4666C7936F7.jpg)

    private String apply_reason;//申请理由

    private Integer busId;//商家id

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndustry_id() {
        return industry_id;
    }

    public void setIndustry_id(String industry_id) {
        this.industry_id = industry_id;
    }

    public List<String> getUrl() {
        return url;
    }

    public void setUrl(List<String> url) {
        this.url = url;
    }

    public String getApply_reason() {
        return apply_reason;
    }

    public void setApply_reason(String apply_reason) {
        this.apply_reason = apply_reason;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }
}
