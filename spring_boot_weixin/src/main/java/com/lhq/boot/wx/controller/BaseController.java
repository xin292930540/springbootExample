package com.lhq.boot.wx.controller;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;

public class BaseController {

	@Autowired
	protected HttpSession session;
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;

	public static String getParameterMap(HttpServletRequest request) {
		String jsonStr = "";
		Map<String, String[]> properties = request.getParameterMap();
		Entry entry;
		for (Iterator entries = properties.entrySet().iterator(); entries
				.hasNext(); jsonStr = (String) entry.getKey()) {
			entry = (Entry) entries.next();
		}
		return jsonStr;
	}

	public String getRemoteAddr() {
		return request.getRemoteAddr();
	}

	public JSONObject parseJSON(String dataJson) {
		return StringUtils.isEmpty(dataJson) ? JSONObject.parseObject(dataJson) : new JSONObject();
	}

}