package com.lt.entity.message.in;

import java.util.Map;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 18:02:59
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 * <p>
 * MediaId	图片消息媒体id，可以调用多媒体文件下载接口拉取数据。
 */

public class MediaMessageEntity extends MessageEntity {
	@JacksonXmlProperty(localName = "MediaId")
	private String mediaId;

	@Override
	public MessageEntity init(Map<String, String> attr) {
		super.init(attr);
		this.mediaId = attr.get("MediaId");
		return this;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
}
