package com.lt.entity;

import java.util.List;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-28 16:35:18
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class WeChatMenuButton {
	protected String type;
	protected String name;
	protected List<WeChatMenuButton> subButton;

	public WeChatMenuButton(String type, String name) {
		this(type,name,null);
	}

	public WeChatMenuButton(String type, String name, List<WeChatMenuButton> subButton) {
		this.type = type;
		this.name = name;
		this.subButton = subButton;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<WeChatMenuButton> getSubButton() {
		return subButton;
	}

	public void setSubButton(List<WeChatMenuButton> subButton) {
		this.subButton = subButton;
	}
}
