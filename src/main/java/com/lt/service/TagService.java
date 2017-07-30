package com.lt.service;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lt.component.HttpClient;
import com.lt.component.WeChatApi;
import com.lt.entity.tag.Tag;
import com.lt.utils.UrlUtils;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-28 17:34:06
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@Service
public class TagService {
	@Resource
	private HttpClient httpClient;
	@Value("${weChat.api.tag.add}")
	private String TAG_ADD;
	@Value("${weChat.api.tag.get}")
	private String TAG_GET;
	public String add(String name) {
		Tag tag = new Tag();
		tag.setName(name);
		String url = UrlUtils.parse(TAG_ADD, WeChatApi.accessToken.getAccessToken());
		Map<String,Object> map = new HashMap<>();
		map.put("tag", tag);
		return httpClient.post(url, map, String.class);
	}

	public String get() {
		String url = UrlUtils.parse(TAG_GET, WeChatApi.accessToken.getAccessToken());
		return httpClient.get(url,String.class);
	}
}
