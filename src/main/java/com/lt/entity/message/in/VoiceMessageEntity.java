package com.lt.entity.message.in;

import java.util.Map;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 18:00:48
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>1357290913</CreateTime>
 * <MsgType><![CDATA[voice]]></MsgType>
 * <MediaId><![CDATA[media_id]]></MediaId>
 * <Format><![CDATA[Format]]></Format>
 * <MsgId>1234567890123456</MsgId>
 * </xml>
 * Format	语音格式，如amr，speex等
 */
public class VoiceMessageEntity extends MessageEntity {
	private String mediaId;
	private String format;

	@Override
	public VoiceMessageEntity init(Map<String, String> attr) {
		super.init(attr);
		this.format = attr.get("Format");
		this.mediaId = attr.get("MediaId");
		return this;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public String toString() {
		return "VoiceMessageEntity{" +
				"mediaId='" + mediaId + '\'' +
				", format='" + format + '\'' +
				"} " + super.toString();
	}
}
