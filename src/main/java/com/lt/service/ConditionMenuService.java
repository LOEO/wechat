package com.lt.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lt.component.HttpClient;
import com.lt.component.WeChatApi;
import com.lt.entity.ButtonRule;
import com.lt.entity.WeChatClickMenuButton;
import com.lt.entity.WeChatMenu;
import com.lt.entity.WeChatMenuButton;
import com.lt.entity.WeChatPicPhotoMenuButton;
import com.lt.entity.WeChatScanCodeMenuButton;
import com.lt.utils.UrlUtils;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-28 14:39:52
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@Service
public class ConditionMenuService {
	@Value("${weChat.api.menu.conditional.add}")
	private String CONDITION_MENU_ADD;
	@Value("${weChat.api.menu.conditional.get}")
	private String CONDITION_MENU_GET;
	@Value("${weChat.api.menu.conditional.delete}")
	private String CONDITION_MENU_DELETE;
	@Resource
	private HttpClient httpClient;

	public String add() {
		WeChatMenu weChatMenu = new WeChatMenu();
		List<WeChatMenuButton> weChatMenuButtonList = new ArrayList<>();
		weChatMenuButtonList.add(new WeChatClickMenuButton("click"));
		weChatMenuButtonList.add(new WeChatPicPhotoMenuButton("picPhoto"));
		weChatMenuButtonList.add(new WeChatScanCodeMenuButton("scanCode"));
		ButtonRule buttonRule = new ButtonRule();
		buttonRule.setTagId("100");
		weChatMenu.setButton(weChatMenuButtonList);
		weChatMenu.setMatchRule(buttonRule);
		String url = UrlUtils.parse(CONDITION_MENU_ADD, WeChatApi.accessToken.getAccessToken());
		String result = httpClient.post(url, weChatMenu, String.class);
		System.out.println(result);
		return result;
	}

	public String get() {
		String url = UrlUtils.parse(CONDITION_MENU_GET,WeChatApi.accessToken.getAccessToken());
		return httpClient.get(url, String.class);
	}

	public String delete() {
		String url = UrlUtils.parse(CONDITION_MENU_DELETE, WeChatApi.accessToken.getAccessToken());
		return httpClient.get(url, String.class);
	}
}
