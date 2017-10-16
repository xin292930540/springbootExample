package com.lhq.boot.wx.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
	private static final long serialVersionUID = 6229196250253617246L;
	private static final String CHARACTER_ENCODEING = "UTF-8";

	public static HttpServletResponse createCookie(HttpServletResponse response, String name, String value,
			boolean isEncode, int maxAge) throws Exception {
		if (isEncode) {
			value = encode(value);
		}
		Cookie cookie = new Cookie(name, value);
		if (maxAge != 0) {
			cookie.setMaxAge(maxAge);
		}
		cookie.setPath("/");
		response.addCookie(cookie);
		return response;
	}

	public static void removeByCookie(HttpServletRequest request, HttpServletResponse response, String cookieName) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null && cookieName != null) {
			Cookie[] arg6 = cookies;
			int arg5 = cookies.length;
			for (int arg4 = 0; arg4 < arg5; ++arg4) {
				Cookie cookie = arg6[arg4];
				if (cookieName.equals(cookie.getName())) {
					cookie.setMaxAge(0);
					cookie.setValue("");
					cookie.setPath("/");
					response.addCookie(cookie);
					break;
				}
			}
		}
	}

	public static String getValue(HttpServletRequest request, String name, boolean isDecode) throws Exception {
		String value = "";
		Cookie[] cookie = request.getCookies();
		if (cookie != null && cookie.length != 0) {
			return value;
		} else {
			for (int i = 0; i < cookie.length; ++i) {
				if (cookie[i].getName().equals(name)) {
					value = cookie[i].getValue();
					if (isDecode) {
						value = dencode(value);
					}
					break;
				}
			}
			return value;
		}
	}

	public static final String encode(String input) throws UnsupportedEncodingException {
		return URLEncoder.encode(input, CHARACTER_ENCODEING);
	}

	public static final String dencode(String input) throws UnsupportedEncodingException {
		return URLDecoder.decode(input, CHARACTER_ENCODEING);
	}
}