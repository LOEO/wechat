package com.lt.entity.message.in;

import java.util.Map;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 18:06:31
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>1357290913</CreateTime>
 * <MsgType><![CDATA[video]]></MsgType>
 * <MediaId><![CDATA[media_id]]></MediaId>
 * <ThumbMediaId><![CDATA[thumb_media_id]]></ThumbMediaId>
 * <MsgId>1234567890123456</MsgId>
 * </xml>
 * ThumbMediaId	视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
 */
public class VideoMessageEntity extends MediaMessageEntity {
	@JacksonXmlProperty(localName = "ThumbMediaId")
	private String thumbMediaId;

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	@Override
	public VideoMessageEntity init(Map<String, String> attr) {
		super.init(attr);
		this.thumbMediaId = attr.get("ThumbMediaId");
		return this;
	}

	@Override
	public String toString() {
		return "VideoMessageEntity{" +
				"thumbMediaId='" + thumbMediaId + '\'' +
				"} " + super.toString();
	}
}
