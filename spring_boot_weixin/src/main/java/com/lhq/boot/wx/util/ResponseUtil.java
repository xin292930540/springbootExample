package com.lhq.boot.wx.util;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public class ResponseUtil {

	public static void sendRedirect(HttpServletResponse response, String url) throws IOException {
		if (url.startsWith("/")) {
			url = Const.DOMAIN_NAME + url;
		}
		response.sendRedirect(url);

	}
}
