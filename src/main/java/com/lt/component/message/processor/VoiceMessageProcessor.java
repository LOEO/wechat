package com.lt.component.message.processor;

import com.lt.entity.message.in.VoiceMessageEntity;
import com.lt.entity.message.out.MediaMessageResultEntity;
import com.lt.entity.message.out.MessageResultEntity;
import com.lt.entity.message.out.VoiceMessageResultEntity;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-25 15:36:40
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class VoiceMessageProcessor implements MessageProcessor<VoiceMessageEntity> {
	@Override
	public MessageResultEntity process(VoiceMessageEntity in) {
		VoiceMessageResultEntity voiceMessageResultEntity = new VoiceMessageResultEntity(in);
		MediaMessageResultEntity mediaMessageResultEntity = new MediaMessageResultEntity();
		mediaMessageResultEntity.setMediaId(in.getMediaId());
		voiceMessageResultEntity.setVoice(mediaMessageResultEntity);
		return voiceMessageResultEntity;
	}
}
