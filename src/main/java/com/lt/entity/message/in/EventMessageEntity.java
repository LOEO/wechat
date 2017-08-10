package com.lt.entity.message.in;

import java.util.Map;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-08-10 10:24:29
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class EventMessageEntity extends MessageEntity{
	private static final String SCAN = "SCAN";
	@JacksonXmlProperty(localName = "EVENT")
	private String event;
	@JacksonXmlProperty(localName = "EventKey")
	private String eventKey;

	@Override
	public MessageEntity init(Map<String, String> attr) {
		this.event = attr.get("Event");
		this.eventKey = attr.get("EventKey");
		return super.init(attr);
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
}
