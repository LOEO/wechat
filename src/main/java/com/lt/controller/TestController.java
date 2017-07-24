package com.lt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-20 12:19:22
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@Controller
public class TestController {
	@GetMapping("/test")
	public String test(ModelMap modelMap) {
		modelMap.put("msg", "ssss");
		return "test";
	}
}
