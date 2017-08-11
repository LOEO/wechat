package com.lt.controller;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.lt.entity.web.AccessToken;
import com.lt.entity.web.UserInfo;
import com.lt.service.WeChatWebPageService;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-20 10:04:00
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@Controller
public class WebPageAuthorizationController {
	@Resource
	private WeChatWebPageService weChatWebPageService;
	@GetMapping("/agree")
	public String agree(String code, String state, ModelMap modelMap) throws IOException {
		System.out.println(code + ":" + state);
		AccessToken accessToken = weChatWebPageService.getAccessToken(code);
		UserInfo userInfo = weChatWebPageService.getUserInfo(accessToken.getAccess_token(), accessToken.getOpenid());
		modelMap.put("userInfo", userInfo);
		return "index";
	}

	@GetMapping("home")
	public String home(ModelMap modelMap) {
		modelMap.put("msg", "欢迎你！！！！");
		return "home";
	}
}
