package com.lt.entity.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-28 12:02:21
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class AccessToken {
	@JsonProperty("access_token")
	private String accessToken;
	@JsonProperty("expires_in")
	private Long expires;
	private Long createTime;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Long getExpires() {
		return expires;
	}

	public void setExpires(Long expires) {
		this.expires = expires;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "AccessToken{" +
				"accessToken='" + accessToken + '\'' +
				", expires='" + expires + '\'' +
				", createTime=" + createTime +
				'}';
	}
}
