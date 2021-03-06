package com.lt.component;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-20 14:32:23
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@Component
public class HttpClient {
	@Resource
	private RestTemplate restTemplate;

	public <T> T get(String url,Class<T> resultType) {
		String result = restTemplate.getForObject(url, String.class);
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.readValue(result, resultType);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public <T> T post(String url,Object data,Class<T> resultType) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("X-Requested-With", "XMLHttpRequest");
		HttpEntity httpEntity = new HttpEntity(data,headers);
		return restTemplate.postForObject(url, httpEntity, resultType);
	}
}
