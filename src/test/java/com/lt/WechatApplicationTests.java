package com.lt;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lt.component.WeChatApi;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WechatApplicationTests {

	@Resource
	private WeChatApi weChatApi;

	@Test
	public void contextLoads() {
		weChatApi.login();
	}

}
