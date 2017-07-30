package com.lt.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-28 16:35:05
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public class WeChatMenu {
	private List<WeChatMenuButton> button;
	@JsonProperty("matchrule")
	private ButtonRule matchRule;

	public List<WeChatMenuButton> getButton() {
		return button;
	}

	public void setButton(List<WeChatMenuButton> button) {
		this.button = button;
	}

	public ButtonRule getMatchRule() {
		return matchRule;
	}

	public void setMatchRule(ButtonRule matchRule) {
		this.matchRule = matchRule;
	}
}
