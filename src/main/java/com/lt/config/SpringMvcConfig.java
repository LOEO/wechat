package com.lt.config;

import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

import com.lt.component.message.convert.CustomMessageConvert;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-20 15:59:03
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@Configuration
public class SpringMvcConfig {
	@Bean
	public HttpMessageConverters messageConverters() {
		HttpMessageConverter<?> customMessageConvert = new CustomMessageConvert();
		return new HttpMessageConverters(customMessageConvert);
	}

}
