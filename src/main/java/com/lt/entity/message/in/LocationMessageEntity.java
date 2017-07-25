package com.lt.entity.message.in;

import java.util.Map;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 18:09:17
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>1351776360</CreateTime>
 * <MsgType><![CDATA[location]]></MsgType>
 * <Location_X>23.134521</Location_X>
 * <Location_Y>113.358803</Location_Y>
 * <Scale>20</Scale>
 * <Label><![CDATA[位置信息]]></Label>
 * <MsgId>1234567890123456</MsgId>
 * </xml>
 */
public class LocationMessageEntity extends MessageEntity {
	@JacksonXmlProperty(localName = "Location_X")
	private String locationX;
	@JacksonXmlProperty(localName = "Location_Y")
	private String locationY;
	@JacksonXmlProperty(localName = "Scale")
	private String scale;
	@JacksonXmlProperty(localName = "Label")
	private String label;

	@Override
	public LocationMessageEntity init(Map<String, String> attr) {
		super.init(attr);
		this.locationX = attr.get("Location_X");
		this.locationY = attr.get("Location_Y");
		this.scale = attr.get("Scale");
		this.label = attr.get("Label");
		return this;
	}

	public String getLocationX() {
		return locationX;
	}

	public void setLocationX(String locationX) {
		this.locationX = locationX;
	}

	public String getLocationY() {
		return locationY;
	}

	public void setLocationY(String locationY) {
		this.locationY = locationY;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "LocationMessageEntity{" +
				"locationX='" + locationX + '\'' +
				", locationY='" + locationY + '\'' +
				", scale='" + scale + '\'' +
				", label='" + label + '\'' +
				"} " + super.toString();
	}
}
