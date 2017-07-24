package com.lt.service;

import org.springframework.stereotype.Service;

import com.lt.entity.message.in.MessageEntity;
import com.lt.entity.message.out.MessageResultEntity;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 17:03:14
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@Service
public class UserMsgService {
	public MessageResultEntity process(MessageEntity messageEntity) {
		String content = messageEntity.getContent();
		MessageResultEntity messageResultEntity = new MessageResultEntity();
		messageResultEntity.setToUserName(messageEntity.getFromUserName());
		messageResultEntity.setFromUserName(messageEntity.getToUserName());
		messageResultEntity.setCreateTime(System.currentTimeMillis()+"");
		messageResultEntity.setContent("你发的消息是："+content);
		messageResultEntity.setMsgType("text");
		return messageResultEntity;
	}
}
