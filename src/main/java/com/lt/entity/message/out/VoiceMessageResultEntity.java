package com.lt.entity.message.out;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.lt.entity.message.in.MessageEntity;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 18:22:38
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>12345678</CreateTime>
 * <MsgType><![CDATA[voice]]></MsgType>
 * <Voice>
 * <MediaId><![CDATA[media_id]]></MediaId>
 * </Voice>
 * </xml>
 */
public class VoiceMessageResultEntity extends MessageResultEntity {
	@JacksonXmlProperty(localName = "Voice")
	private MediaMessageResultEntity voice;

	public VoiceMessageResultEntity() {
	}

	public VoiceMessageResultEntity(MessageEntity messageEntity) {
		super(messageEntity);
	}

	public MediaMessageResultEntity getVoice() {
		return voice;
	}

	public void setVoice(MediaMessageResultEntity voice) {
		this.voice = voice;
	}

	@Override
	public String toString() {
		return "VoiceMessageResultEntity{" +
				"voice=" + voice +
				"} " + super.toString();
	}
}
