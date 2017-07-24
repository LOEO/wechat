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

	public String getName() {
		return name;
	}

	public MessageEntity getIn() throws IllegalAccessException, InstantiationException {
		return in.newInstance();
	}

	public MessageResultEntity getOut() throws IllegalAccessException, InstantiationException {
		return out.newInstance();
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
