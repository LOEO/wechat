package com.lt.config;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-19 15:31:09
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@Configuration
public class RestTemplateConfig {
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
		for (int i = 0; i < messageConverters.size(); i++) {
			HttpMessageConverter messageConverter = messageConverters.get(i);
			if (messageConverter instanceof StringHttpMessageConverter) {
				messageConverters.set(i, new StringHttpMessageConverter(Charset.forName("utf-8")));
			}
		}
		return restTemplate;
	}
}
