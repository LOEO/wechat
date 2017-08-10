package com.lt.qrcode.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lt.component.HttpClient;
import com.lt.component.WeChatTokenContext;
import com.lt.qrcode.QrCodeType;
import com.lt.qrcode.entity.QrCodeParam;
import com.lt.qrcode.entity.QrCodeParam.ActionInfo;
import com.lt.qrcode.entity.QrCodeParam.Scene;
import com.lt.qrcode.entity.QrCodeResult;
import com.lt.utils.UrlUtils;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-08-08 11:12:20
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@Service
public class QrCodeService {
	@Value("${weChat.api.qrcode.create}")
	private String QR_CODE_CREATE;
	@Resource
	private WeChatTokenContext weChatTokenContext;
	@Resource
	private HttpClient httpClient;

	public String createQrCode() {
		String url = UrlUtils.parse(QR_CODE_CREATE, weChatTokenContext.getAccessTokenString());
		QrCodeParam qrCodeParam = new QrCodeParam();
		ActionInfo actionInfo = new ActionInfo();
		Scene scene = new Scene();
		scene.setSceneId(500);
		scene.setSceneStr("org123123123");
		actionInfo.setScene(scene);
		qrCodeParam.setActionInfo(actionInfo);
		qrCodeParam.setActionName(QrCodeType.QR_LIMIT_STR_SCENE);
		QrCodeResult qrCodeResult = httpClient.post(url, qrCodeParam, QrCodeResult.class);
		System.out.println(qrCodeResult);
		return "https://mp.weixin.qq.com/cgi-bin/showqrcode?ticket=" + qrCodeResult.getTicket();
	}
}
