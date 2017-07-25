package com.lt.entity.message.out;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.lt.entity.message.in.MessageEntity;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 18:23:43
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>12345678</CreateTime>
 * <MsgType><![CDATA[video]]></MsgType>
 * <Video>
 * <MediaId><![CDATA[media_id]]></MediaId>
 * <Title><![CDATA[title]]></Title>
 * <Description><![CDATA[description]]></Description>
 * </Video>
 * </xml>
 */
public class VideoMessageResultEntity extends MessageResultEntity {
	@JacksonXmlProperty(localName = "Video")
	private Video video;

	public VideoMessageResultEntity() {
	}

	public VideoMessageResultEntity(MessageEntity messageEntity) {
		super(messageEntity);
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	@Override
	public String toString() {
		return "VideoMessageResultEntity{" +
				"video=" + video +
				"} " + super.toString();
	}

	public static class Video extends MediaMessageResultEntity {
		@JacksonXmlProperty(localName = "Title")
		@JacksonXmlCData
		private String title;
		@JacksonXmlProperty(localName = "Description")
		@JacksonXmlCData
		private String description;

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "Video{" +
					"title='" + title + '\'' +
					", description='" + description + '\'' +
					"} " + super.toString();
		}
	}
}
