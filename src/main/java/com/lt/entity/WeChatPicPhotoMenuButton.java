package com.lt.entity;

import java.util.List;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-28 16:47:58
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class WeChatPicPhotoMenuButton extends WeChatFunctionalMenuButton {
	public WeChatPicPhotoMenuButton(String name) {
		super("pic_sysphoto", name);
	}

	public WeChatPicPhotoMenuButton(String name, List<WeChatMenuButton> subButton) {
		super("pic_sysphoto", name, subButton);
	}
}
