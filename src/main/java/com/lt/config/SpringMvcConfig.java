package com.lt.config;

import org.springframework.context.annotation.Configuration;

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
	//@Bean
	/*public HttpMessageConverters messageConverters() {
		HttpMessageConverter<?> byteArrayHttpMessageConverter = new ByteArrayHttpMessageConverter();
		HttpMessageConverter<?> httpMessageConverter = new StringHttpMessageConverter(Charset.forName("UTF-8"));
		HttpMessageConverter<?> mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
		HttpMessageConverter<?> mappingJackson2XmlHttpMessageConverter = new MappingJackson2XmlHttpMessageConverter();
		return new HttpMessageConverters(byteArrayHttpMessageConverter,httpMessageConverter,
				mappingJackson2HttpMessageConverter,mappingJackson2XmlHttpMessageConverter);
	}*/
}
