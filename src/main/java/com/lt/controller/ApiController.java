package com.lt.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lt.component.WeChatApi;
import com.lt.entity.api.AccessToken;
import com.lt.service.ConditionMenuService;
import com.lt.service.TagService;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-07-28 12:14:29
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@RestController
@RequestMapping("/wechat/api/")
public class ApiController {
	@Resource
	private WeChatApi weChatApi;
	@Resource
	private ConditionMenuService conditionMenuService;
	@Resource
	private TagService tagService;
	@GetMapping("accesstoken")
	public AccessToken getAccessToken() {
		return weChatApi.getAccessToken();
	}

	@GetMapping("button")
	public String getButtons() {
		return conditionMenuService.get();
	}

	@PostMapping("button")
	public String addButton() {
		return conditionMenuService.add();
	}

	@GetMapping("deletebutton")
	public String delButtons() {
		return conditionMenuService.delete();
	}

	@PostMapping("tags")
	public String addTag(String name) {
		return tagService.add(name);
	}

	@GetMapping("tags")
	public String getTags() {
		return tagService.get();
	}

}
