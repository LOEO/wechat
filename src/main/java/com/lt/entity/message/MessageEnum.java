package com.lt.entity.message;

import com.lt.entity.message.in.ImageMessageEntity;
import com.lt.entity.message.in.MessageEntity;
import com.lt.entity.message.in.TextMessageEntity;
import com.lt.entity.message.in.VideoMessageEntity;
import com.lt.entity.message.in.VoiceMessageEntity;
import com.lt.entity.message.out.ImageMessageResultEntity;
import com.lt.entity.message.out.MessageResultEntity;
import com.lt.entity.message.out.TextMessageResultEntity;
import com.lt.entity.message.out.VideoMessageResultEntity;
import com.lt.entity.message.out.VoiceMessageResultEntity;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 18:34:41
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public enum MessageEnum {
	TEXT("text", TextMessageEntity.class, TextMessageResultEntity.class),
	IMAGE("image", ImageMessageEntity.class, ImageMessageResultEntity.class),
	VOICE("voice", VoiceMessageEntity.class, VoiceMessageResultEntity.class),
	VIDEO("video", VideoMessageEntity.class, VideoMessageResultEntity.class);

	public static MessageEnum get(String type) {
		MessageEnum[] messageEnums = MessageEnum.values();
		for (int i = 0, len = messageEnums.length; i < len; i++) {
			if (messageEnums[i].getName().equals(type)) {
				return messageEnums[i];
			}
		}
		return null;
	}

	public String getName() {
		return name;
	}

	public MessageEntity getIn() {
		try {
			return in.newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		}

	}

	public MessageResultEntity getOut() {
		try {
			return out.newInstance();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	MessageEnum(String name, Class<? extends MessageEntity> in, Class<? extends MessageResultEntity> out) {
		this.name = name;
		this.in = in;
		this.out = out;
	}

	private String name;
	private Class<? extends MessageEntity> in;
	private Class<? extends MessageResultEntity> out;
}
