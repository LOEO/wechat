package com.lt.component;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.lt.entity.api.AccessToken;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-08-08 11:30:16
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@Component
public class WeChatTokenContext{
	@Value("${weChat.api.access_token}")
	private String API_ACCESS_TOKEN;
	private AccessToken accessToken;
	@Resource
	private RestTemplate restTemplate;

	private WeChatTokenContext(){}

	public AccessToken getAccessToken() {
		if (accessToken == null || (System.currentTimeMillis()-accessToken.getCreateTime())/1000 > accessToken.getExpires()) {
			try{
				accessToken = restTemplate.getForObject(API_ACCESS_TOKEN, AccessToken.class);
				accessToken.setCreateTime(System.currentTimeMillis());
			}catch (Exception e){
				System.out.println("获取access_token错误");
				throw new RuntimeException();
			}
		}
		return accessToken;
	}

	public String getAccessTokenString() {
		return getAccessToken().getAccessToken();
	}

}
