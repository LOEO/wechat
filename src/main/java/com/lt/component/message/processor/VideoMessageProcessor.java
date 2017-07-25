package com.lt.component.message.processor;

import com.lt.entity.message.in.VideoMessageEntity;
import com.lt.entity.message.out.MessageResultEntity;
import com.lt.entity.message.out.VideoMessageResultEntity;
import com.lt.entity.message.out.VideoMessageResultEntity.Video;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-25 15:44:53
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class VideoMessageProcessor implements MessageProcessor<VideoMessageEntity> {
	@Override
	public MessageResultEntity process(VideoMessageEntity in) {
		VideoMessageResultEntity videoMessageResultEntity = new VideoMessageResultEntity(in);
		Video video = new Video();
		video.setTitle("123");
		video.setDescription("321");
		video.setMediaId(in.getThumbMediaId());
		videoMessageResultEntity.setVideo(video);
		return videoMessageResultEntity;
	}
}
