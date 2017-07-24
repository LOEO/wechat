package com.lt.entity.web;

import java.util.List;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-20 10:35:35
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class UserInfo {
	private String openid;
	private String nickname;
	private String sex;
	private String province;
	private String city;
	private String country;
	private String headimgurl;
	private List privilege;
	private String unionid;
	private String language;

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public List getPrivilege() {
		return privilege;
	}

	public void setPrivilege(List privilege) {
		this.privilege = privilege;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "UserInfo{" +
				"openid='" + openid + '\'' +
				", nickname='" + nickname + '\'' +
				", sex='" + sex + '\'' +
				", province='" + province + '\'' +
				", city='" + city + '\'' +
				", country='" + country + '\'' +
				", headimgurl='" + headimgurl + '\'' +
				", privilege='" + privilege + '\'' +
				", unionid='" + unionid + '\'' +
				", language='" + language + '\'' +
				'}';
	}
}
