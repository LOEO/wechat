package com.lt.entity.message.out;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.lt.entity.message.in.MessageEntity;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 18:16:56
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class TextMessageResultEntity extends MessageResultEntity {
	@JacksonXmlProperty(localName = "Content")
	@JacksonXmlCData
	private String content;

	public TextMessageResultEntity() {
	}

	public TextMessageResultEntity(MessageEntity messageEntity) {
		super(messageEntity);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "TextMessageResultEntity{" +
				"content='" + content + '\'' +
				"} " + super.toString();
	}
}
