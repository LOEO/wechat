package com.lt.entity.message.out;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.lt.entity.message.in.MessageEntity;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 17:04:34
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 * <p>
 * "<xml>\n" +
 * "<ToUserName><![CDATA["+msgEntity.getFromUserName()+"]]></ToUserName>\n" +
 * "<FromUserName><![CDATA["+msgEntity.getToUserName()+"]]></FromUserName>\n" +
 * "<CreateTime>12345678</CreateTime>\n" +
 * "<MsgType><![CDATA[text]]></MsgType>\n" +
 * "<Content><![CDATA[你好]]></Content>\n" +
 * "</xml>";
 */
@JacksonXmlRootElement(localName = "xml")
public class MessageResultEntity {
	@JacksonXmlProperty(localName = "ToUserName")
	@JacksonXmlCData
	private String toUserName;
	@JacksonXmlProperty(localName = "FromUserName")
	@JacksonXmlCData
	private String fromUserName;
	@JacksonXmlProperty(localName = "CreateTime")
	private String createTime;
	@JacksonXmlProperty(localName = "MsgType")
	@JacksonXmlCData
	private String msgType;

	public MessageResultEntity() {

	}

	public MessageResultEntity(MessageEntity messageEntity) {
		this.toUserName = messageEntity.getFromUserName();
		this.fromUserName = messageEntity.getToUserName();
		this.msgType = messageEntity.getMsgType();
		this.createTime = String.valueOf(System.currentTimeMillis());
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

	@Override
	public String toString() {
		return "MessageResultEntity{" +
				"toUserName='" + toUserName + '\'' +
				", fromUserName='" + fromUserName + '\'' +
				", createTime='" + createTime + '\'' +
				", msgType='" + msgType + '\'' +
				'}';
	}
}
