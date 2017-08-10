package com.lt.component.message.processor;

import com.lt.entity.message.in.EventMessageEntity;
import com.lt.entity.message.out.MessageResultEntity;
import com.lt.entity.message.out.TextMessageResultEntity;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-08-10 11:01:32
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class EventMessageProcessor implements MessageProcessor<EventMessageEntity> {
	@Override
	public MessageResultEntity process(EventMessageEntity in) {
		if (in.getEvent().equals("SCAN") || (in.getEvent().equals("subscribe") && in.getEventKey().startsWith("qrscene"))) {
			TextMessageResultEntity textMessageResultEntity = new TextMessageResultEntity(in);
			textMessageResultEntity.setMsgType("text");
			textMessageResultEntity.setContent("你还没有注册！\n<a href='https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx1fd20353ae6221c4&redirect_uri=http%3A%2F%2Floeo.ngrok.cc%2Fagree&response_type=code&scope=snsapi_userinfo&state=a#wechat_redirect'>点击注册</a>");
			return textMessageResultEntity;
		}
		return null;
	}
}
