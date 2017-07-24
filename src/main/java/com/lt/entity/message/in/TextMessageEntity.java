package com.lt.entity.message.in;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.lt.entity.message.in.MessageEntity;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 17:58:34
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class TextMessageEntity extends MessageEntity {
	@JacksonXmlProperty(localName = "Content")
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "TextMessageEntity{" +
				"content='" + content + '\'' +
				"} " + super.toString();
	}
}
