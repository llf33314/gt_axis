package com.gt.axis.bean.wxmp.applet;

import java.io.Serializable;
import java.util.List;


public class SendWxMsgTemplateReq {
	

	/**
	 * ，模板表ID
	 */
	private Integer id;
	
	/**
	 * 跳转url
	 */
	private String url;
	
	/**
	 * 会员ID
	 */
	private Integer memberId;
	
	/**
	 * 公众号ID
	 */
	private Integer publicId;
	
	/**
	 * 模板所需参数
	 */
	private List<Object> objs;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Integer getPublicId() {
		return publicId;
	}

	public void setPublicId(Integer publicId) {
		this.publicId = publicId;
	}

	public List<Object> getObjs() {
		return objs;
	}

	public void setObjs(List<Object> objs) {
		this.objs = objs;
	}
}
