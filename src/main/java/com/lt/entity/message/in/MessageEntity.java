package com.lt.entity.message.in;

import java.util.Map;

import org.springframework.util.Assert;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-20 15:40:36
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class MessageEntity {
	@JacksonXmlProperty(localName = "ToUserName")
	private String toUserName;
	@JacksonXmlProperty(localName = "FromUserName")
	private String fromUserName;
	@JacksonXmlProperty(localName = "CreateTime")
	private String createTime;
	@JacksonXmlProperty(localName = "MsgType")
	private String msgType;
	@JacksonXmlProperty(localName = "MsgId")
	private String msgId;

	public MessageEntity init(Map<String, String> attr) {
		Assert.notNull(attr, "参数不能为null");
		this.createTime = attr.get("CreateTime");
		this.fromUserName = attr.get("FromUserName");
		this.msgId = attr.get("MsgId");
		this.toUserName = attr.get("ToUserName");
		this.msgType = attr.get("MsgType");
		return this;
	}

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}


	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	@Override
	public String toString() {
		return "MessageEntity{" +
				"toUserName='" + toUserName + '\'' +
				", fromUserName='" + fromUserName + '\'' +
				", createTime='" + createTime + '\'' +
				", msgType='" + msgType + '\'' +
				", msgId='" + msgId + '\'' +
				'}';
	}
}
