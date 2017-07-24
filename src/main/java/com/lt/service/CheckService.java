package com.lt.service;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import org.springframework.stereotype.Service;

/**
 * 功能：
 *
 * @author：LT(286269159@qq.com)
 * @create：2017-07-19 16:38:15
 * @version：2017 Version：1.0
 * @company：创海科技 Created with IntelliJ IDEA
 */
@Service
public class CheckService {
	public boolean check(String timestamp, String nonce, String token, String signature) {
		String[] array = {token, timestamp, nonce};
		Arrays.sort(array);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
		}
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-1");
			md.update(sb.toString().getBytes());
			byte[] digest = md.digest();

			StringBuffer hexstr = new StringBuffer();
			String shaHex = "";
			for (int i = 0; i < digest.length; i++) {
				shaHex = Integer.toHexString(digest[i] & 0xFF);
				if (shaHex.length() < 2) {
					hexstr.append(0);
				}
				hexstr.append(shaHex);
			}
			return hexstr.toString().equals(signature);
		} catch (NoSuchAlgorithmException e) {
			return false;
		}
	}
}
