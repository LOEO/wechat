package com.lt.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.lt.entity.message.in.MessageEntity;
import com.lt.entity.message.out.MessageResultEntity;
import com.lt.service.CheckService;
import com.lt.service.UserMsgService;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-19 17:07:34
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@RestController
public class CheckController {
	@Resource
	private CheckService checkService;

	@Resource
	private UserMsgService userMsgService;

	@Value("${weChat.token}")
	private String token;

	@GetMapping("/check")
	public String check(String signature, String timestamp, String nonce, String echostr) {
		if (checkService.check(timestamp, nonce, token, signature)) {
			return echostr;
		}
		return "";
	}

	@PostMapping(value = "/check",produces = "text/xml")
	public MessageResultEntity checkMsg(@RequestBody MessageEntity msgEntity) throws JsonProcessingException {
		System.out.println(msgEntity);
		MessageResultEntity messageResultEntity = userMsgService.process(msgEntity);
		XmlMapper xmlMapper = new XmlMapper();
		System.out.println(xmlMapper.writeValueAsString(messageResultEntity));
		return messageResultEntity;
	}
}
