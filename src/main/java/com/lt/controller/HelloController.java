package com.lt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-19 16:31:47
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
