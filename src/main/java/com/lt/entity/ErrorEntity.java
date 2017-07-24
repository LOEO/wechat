package com.lt.entity;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-20 14:40:09
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class ErrorEntity {
	private String errcode;
	private String errmsg;

	public String getErrcode() {
		return errcode;
	}

	public void setErrcode(String errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	@Override
	public String toString() {
		return "ErrorEntity{" +
				"errcode='" + errcode + '\'' +
				", errmsg='" + errmsg + '\'' +
				'}';
	}
}
