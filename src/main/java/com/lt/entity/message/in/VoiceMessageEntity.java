package com.lt.entity.message.in;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 18:00:48
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 * <xml>
<ToUserName><![CDATA[toUser]]></ToUserName>
<FromUserName><![CDATA[fromUser]]></FromUserName>
<CreateTime>1357290913</CreateTime>
<MsgType><![CDATA[voice]]></MsgType>
<MediaId><![CDATA[media_id]]></MediaId>
<Format><![CDATA[Format]]></Format>
<MsgId>1234567890123456</MsgId>
</xml>
Format	语音格式，如amr，speex等
 */
public class VoiceMessageEntity extends MessageEntity {
	private String mediaId;
	private String format;
}
