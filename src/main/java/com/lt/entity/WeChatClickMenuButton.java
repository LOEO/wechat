package com.lt.entity;

import java.util.List;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-28 16:43:10
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class WeChatClickMenuButton extends WeChatFunctionalMenuButton {

	public WeChatClickMenuButton(String name) {
		super("click", name);
	}

	public WeChatClickMenuButton(String name, List<WeChatMenuButton> subButton) {
		super("click", name, subButton);
	}
}
