package com.lt.qrcode.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-08-08 11:53:46
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class QrCodeResult {
	private String ticket;
	@JsonProperty("expire_seconds")
	private Integer expireSeconds;
	private String url;

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public Integer getExpireSeconds() {
		return expireSeconds;
	}

	public void setExpireSeconds(Integer expireSeconds) {
		this.expireSeconds = expireSeconds;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "QrCodeResult{" +
				"ticket='" + ticket + '\'' +
				", expireSeconds=" + expireSeconds +
				", url='" + url + '\'' +
				'}';
	}
}
