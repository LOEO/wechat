package com.lt.service;

import org.springframework.stereotype.Service;

import com.lt.entity.message.MessageEnum;
import com.lt.entity.message.in.MessageEntity;
import com.lt.entity.message.out.MessageResultEntity;
import com.lt.entity.message.out.TextMessageResultEntity;

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
	public static final String MSG = "1.注册\n2.登录\n3.个人信息\n4.天气查询\n5.公交查询\n发送对应的序号选择功能";
	public MessageResultEntity process(MessageEntity messageEntity) {
		MessageEnum messageEnum = MessageEnum.get(messageEntity.getMsgType());
		if (messageEnum == null) {
			TextMessageResultEntity messageResultEntity = new TextMessageResultEntity();
			messageResultEntity.setToUserName(messageEntity.getFromUserName());
			messageResultEntity.setFromUserName(messageEntity.getToUserName());
			messageResultEntity.setCreateTime(System.currentTimeMillis()+"");
			messageResultEntity.setContent(MSG);
			messageResultEntity.setMsgType("text");
			return messageResultEntity;
		}
		return messageEnum.getMessageProcessor().process(messageEntity);
	}
}
