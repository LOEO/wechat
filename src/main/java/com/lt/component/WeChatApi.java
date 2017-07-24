package com.lt.component;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-19 14:57:52
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@Component
public class WeChatApi {
	@Resource
	private RestTemplate restTemplate;

	public String login() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		headers.add("X-Requested-With", "XMLHttpRequest");
		Map<String, Object> data = new HashMap<>();
		data.put("loginName", "lt@hydt.com");
		data.put("password", "9aa0498a2359caaebce2c7297bbb0fd9");
		HttpEntity httpEntity = new HttpEntity(data,headers);
		ResponseEntity<Object> result = restTemplate.postForEntity("http://localhost:8080/api/users/login", httpEntity, Object.class);
		System.out.println(result);
		return result.toString();
	}

}
