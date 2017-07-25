package com.lt.component.message.processor;

import com.lt.entity.message.in.ImageMessageEntity;
import com.lt.entity.message.out.ImageMessageResultEntity;
import com.lt.entity.message.out.MediaMessageResultEntity;
import com.lt.entity.message.out.MessageResultEntity;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-25 15:42:13
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class ImageMessageProcessor implements MessageProcessor<ImageMessageEntity> {
	@Override
	public MessageResultEntity process(ImageMessageEntity in) {
		ImageMessageResultEntity imageMessageResultEntity = new ImageMessageResultEntity(in);
		MediaMessageResultEntity mediaMessageResultEntity = new MediaMessageResultEntity();
		mediaMessageResultEntity.setMediaId(in.getMediaId());
		imageMessageResultEntity.setImage(mediaMessageResultEntity);
		return imageMessageResultEntity;
	}
}
