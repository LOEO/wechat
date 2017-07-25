package com.lt.entity.message.in;

import java.util.Map;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 18:13:07
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>1351776360</CreateTime>
 * <MsgType><![CDATA[link]]></MsgType>
 * <Title><![CDATA[公众平台官网链接]]></Title>
 * <Description><![CDATA[公众平台官网链接]]></Description>
 * <Url><![CDATA[url]]></Url>
 * <MsgId>1234567890123456</MsgId>
 * </xml>
 */
public class LinkMessageEntity extends MessageEntity {
	@JacksonXmlProperty(localName = "Description")
	private String description;
	@JacksonXmlProperty(localName = "Url")
	private String url;

	@Override
	public LinkMessageEntity init(Map<String, String> attr) {
		super.init(attr);
		this.url = attr.get("Url");
		this.description = attr.get("Description");
		return this;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "LinkMessageEntity{" +
				"description='" + description + '\'' +
				", url='" + url + '\'' +
				"} " + super.toString();
	}
}
