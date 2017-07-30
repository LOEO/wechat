package com.lt.entity;

import java.util.List;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-28 16:45:41
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class WeChatScanCodeMenuButton extends WeChatFunctionalMenuButton {

	public WeChatScanCodeMenuButton(String name) {
		super("scancode_waitmsg", name);
	}

	public WeChatScanCodeMenuButton(String name, List<WeChatMenuButton> subButton) {
		super("scancode_waitmsg", name, subButton);
	}
}
