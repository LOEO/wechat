package com.lt.component.message.processor;

import com.lt.entity.message.in.TextMessageEntity;
import com.lt.entity.message.out.MessageResultEntity;
import com.lt.entity.message.out.TextMessageResultEntity;
import com.lt.service.UserMsgService;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-25 11:39:09
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class TextMessageProcessor implements MessageProcessor<TextMessageEntity> {
	@Override
	public MessageResultEntity process(TextMessageEntity in) {
		TextMessageResultEntity resultEntity = new TextMessageResultEntity(in);
		String content;
		switch (in.getContent().trim()) {
			case "1":
				content = "恭喜你，注册成功！";
				break;
			case "2":
				content = "恭喜你，登录成功！";
				break;
			case "3":
				content = "这是您的个人信息！";
				break;
			case "4":
				content = "郑州今天的温度是30℃-37℃！";
				break;
			case "5":
				content = "公交已停运！";
				break;
			default:
				content = UserMsgService.MSG;
		}
		resultEntity.setContent(content);
		return resultEntity;
	}
}
