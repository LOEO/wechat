package com.lt.service;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lt.component.HttpClient;
import com.lt.entity.web.AccessToken;
import com.lt.entity.web.UserInfo;
import com.lt.utils.UrlUtils;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-20 10:05:54
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@Service
public class WeChatWebPageService {
	@Value("${weChat.api.web.access_token}")
	private String ACCESS_TOKEN;
	@Value("${weChat.api.web.user_info}")
	private String USER_INFO;

	@Resource
	private HttpClient httpClient;

	public AccessToken getAccessToken(String code) throws IOException {
		String url = UrlUtils.parse(ACCESS_TOKEN, code);
		AccessToken accessToken = httpClient.get(url, AccessToken.class);
		System.out.println(accessToken.toString());
		return accessToken;
	}

	public UserInfo getUserInfo(String accessToken, String openId) throws IOException {
		String url = UrlUtils.parse(USER_INFO, accessToken, openId);
		UserInfo userInfo = httpClient.get(url, UserInfo.class);
		System.out.println(userInfo);
		return userInfo;
	}
}
