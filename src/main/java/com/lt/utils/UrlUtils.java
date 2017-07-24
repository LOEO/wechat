package com.lt.utils;

import java.text.MessageFormat;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-20 10:11:47
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
public abstract class UrlUtils {
	public static String parse(String urlPattern, Object... args) {
		if (args == null) {
			return urlPattern;
		}
		return MessageFormat.format(urlPattern, args);
	}
}
