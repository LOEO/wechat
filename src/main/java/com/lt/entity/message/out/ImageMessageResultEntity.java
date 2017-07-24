package com.lt.entity.message.out;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 18:18:45
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 * <xml>
<ToUserName><![CDATA[toUser]]></ToUserName>
<FromUserName><![CDATA[fromUser]]></FromUserName>
<CreateTime>12345678</CreateTime>
<MsgType><![CDATA[image]]></MsgType>
<Image>
<MediaId><![CDATA[media_id]]></MediaId>
</Image>
</xml>
 */
public class ImageMessageResultEntity extends MessageResultEntity{
	@JacksonXmlProperty(localName = "Image")
	private MediaMessageResultEntity image;

	public MediaMessageResultEntity getImage() {
		return image;
	}

	public void setImage(MediaMessageResultEntity image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "ImageMessageResultEntity{" +
				"image=" + image +
				'}';
	}
}
