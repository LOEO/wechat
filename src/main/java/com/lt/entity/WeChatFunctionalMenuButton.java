package com.lt.entity;

import java.util.List;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-28 16:41:51
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class WeChatFunctionalMenuButton extends WeChatMenuButton {
	protected String key="ssssss";

	public WeChatFunctionalMenuButton(String type, String name) {
		super(type, name);
	}

	public WeChatFunctionalMenuButton(String type, String name, List<WeChatMenuButton> subButton) {
		super(type, name, subButton);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
