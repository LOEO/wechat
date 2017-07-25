package com.lt.entity.message.out;

import com.lt.entity.message.in.MessageEntity;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 18:31:37
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>12345678</CreateTime>
 * <MsgType><![CDATA[news]]></MsgType>
 * <ArticleCount>2</ArticleCount>
 * <Articles>
 * <item>
 * <Title><![CDATA[title1]]></Title>
 * <Description><![CDATA[description1]]></Description>
 * <PicUrl><![CDATA[picurl]]></PicUrl>
 * <Url><![CDATA[url]]></Url>
 * </item>
 * <item>
 * <Title><![CDATA[title]]></Title>
 * <Description><![CDATA[description]]></Description>
 * <PicUrl><![CDATA[picurl]]></PicUrl>
 * <Url><![CDATA[url]]></Url>
 * </item>
 * </Articles>
 * </xml>
 */
public class ArticleMessageResultEntity extends MessageResultEntity {

	public ArticleMessageResultEntity(MessageEntity messageEntity) {
		super(messageEntity);
	}

	public ArticleMessageResultEntity() {
	}
}
