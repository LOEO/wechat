package com.lt.entity.message.out;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-24 18:26:37
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 * <xml>
<ToUserName><![CDATA[toUser]]></ToUserName>
<FromUserName><![CDATA[fromUser]]></FromUserName>
<CreateTime>12345678</CreateTime>
<MsgType><![CDATA[music]]></MsgType>
<Music>
<Title><![CDATA[TITLE]]></Title>
<Description><![CDATA[DESCRIPTION]]></Description>
<MusicUrl><![CDATA[MUSIC_Url]]></MusicUrl>
<HQMusicUrl><![CDATA[HQ_MUSIC_Url]]></HQMusicUrl>
<ThumbMediaId><![CDATA[media_id]]></ThumbMediaId>
</Music>
</xml>
 */
public class MusicMessageResultEntity extends MessageResultEntity {
	@JacksonXmlProperty(localName = "Music")
	private Music music;

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

	@Override
	public String toString() {
		return "MusicMessageResultEntity{" +
				"music=" + music +
				"} " + super.toString();
	}

	public static class Music{
		@JacksonXmlProperty(localName = "Title")
		@JacksonXmlCData
		private String title;
		@JacksonXmlProperty(localName = "Description")
		@JacksonXmlCData
		private String description;
		@JacksonXmlProperty(localName = "MusicUrl")
		@JacksonXmlCData
		private String musicUrl;
		@JacksonXmlProperty(localName = "HQMusicUrl")
		@JacksonXmlCData
		private String hQMusicUrl;
		@JacksonXmlProperty(localName = "ThumbMediaId")
		@JacksonXmlCData
		private String thumbMediaId;

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

		public String getMusicUrl() {
			return musicUrl;
		}

		public void setMusicUrl(String musicUrl) {
			this.musicUrl = musicUrl;
		}

		public String gethQMusicUrl() {
			return hQMusicUrl;
		}

		public void sethQMusicUrl(String hQMusicUrl) {
			this.hQMusicUrl = hQMusicUrl;
		}

		public String getThumbMediaId() {
			return thumbMediaId;
		}

		public void setThumbMediaId(String thumbMediaId) {
			this.thumbMediaId = thumbMediaId;
		}

		@Override
		public String toString() {
			return "Music{" +
					"title='" + title + '\'' +
					", description='" + description + '\'' +
					", musicUrl='" + musicUrl + '\'' +
					", hQMusicUrl='" + hQMusicUrl + '\'' +
					", thumbMediaId='" + thumbMediaId + '\'' +
					'}';
		}
	}
}
