package com.lt.entity.message;

import com.lt.component.message.processor.ImageMessageProcessor;
import com.lt.component.message.processor.MessageProcessor;
import com.lt.component.message.processor.TextMessageProcessor;
import com.lt.component.message.processor.VideoMessageProcessor;
import com.lt.component.message.processor.VoiceMessageProcessor;
import com.lt.entity.message.in.ImageMessageEntity;
import com.lt.entity.message.in.MessageEntity;
import com.lt.entity.message.in.TextMessageEntity;
import com.lt.entity.message.in.VideoMessageEntity;
import com.lt.entity.message.in.VoiceMessageEntity;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 18:34:41
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public enum MessageEnum {
	TEXT("text", TextMessageEntity.class, new TextMessageProcessor()),
	IMAGE("image", ImageMessageEntity.class, new ImageMessageProcessor()),
	VOICE("voice", VoiceMessageEntity.class, new VoiceMessageProcessor()),
	VIDEO("video", VideoMessageEntity.class, new VideoMessageProcessor());

	public static MessageEnum get(String type) {
		MessageEnum[] messageEnums = MessageEnum.values();
		for (MessageEnum messageEnum : messageEnums) {
			if (messageEnum.getName().equals(type)) {
				return messageEnum;
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

	public MessageProcessor getMessageProcessor() {
		return messageProcessor;
	}

	MessageEnum(String name, Class<? extends MessageEntity> in, MessageProcessor<? extends MessageEntity> messageProcessor) {
		this.name = name;
		this.in = in;
		this.messageProcessor = messageProcessor;
	}

	private String name;
	private Class<? extends MessageEntity> in;
	private MessageProcessor messageProcessor;
}
