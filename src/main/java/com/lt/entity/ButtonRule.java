package com.lt.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-28 17:17:06
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class ButtonRule {
	@JsonProperty("tag_id")
	private String tagId;
	@JsonProperty("sex")
	private String sex;
	@JsonProperty("country")
	private String country;
	@JsonProperty("province")
	private String province;
	@JsonProperty("city")
	private String city;
	@JsonProperty("client_platform_type")
	private String clientPlatFormType;
	@JsonProperty("language")
	private String language;

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getClientPlatFormType() {
		return clientPlatFormType;
	}

	public void setClientPlatFormType(String clientPlatFormType) {
		this.clientPlatFormType = clientPlatFormType;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
