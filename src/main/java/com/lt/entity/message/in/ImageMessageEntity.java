package com.lt.entity.message.in;

import java.util.Map;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 17:59:31
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>1348831860</CreateTime>
 * <MsgType><![CDATA[image]]></MsgType>
 * <PicUrl><![CDATA[this is a url]]></PicUrl>
 * <MediaId><![CDATA[media_id]]></MediaId>
 * <MsgId>1234567890123456</MsgId>
 * </xml>
 * PicUrl	图片链接（由系统生成）
 */
public class ImageMessageEntity extends MediaMessageEntity {
	@JacksonXmlProperty(localName = "PicUrl")
	private String picUrl;

	@Override
	public ImageMessageEntity init(Map<String, String> attr) {
		super.init(attr);
		this.picUrl = attr.get("PicUrl");
		return this;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}


	@Override
	public String toString() {
		return "ImageMessageEntity{" +
				"picUrl='" + picUrl + '\'' +
				"} " + super.toString();
	}
}
