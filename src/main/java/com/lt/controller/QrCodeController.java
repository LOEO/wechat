package com.lt.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lt.qrcode.service.QrCodeService;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-08-08 11:56:33
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@RestController()
@RequestMapping("/api/qrcode/")
public class QrCodeController {
	@Resource
	private QrCodeService qrCodeService;
	@PostMapping("create")
	public String createQrCode() {
		return qrCodeService.createQrCode();
	}
}
