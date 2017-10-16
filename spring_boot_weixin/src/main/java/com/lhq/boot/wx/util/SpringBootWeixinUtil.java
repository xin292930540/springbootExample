package com.lhq.boot.wx.util;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import me.chanjar.weixin.common.util.http.URIUtil;

public class SpringBootWeixinUtil {
	public static ResponseEntity<String> authLogin(String appId, String redirectURI, String scope, String state) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://open.weixin.qq.com/connect/oauth2/authorize?";
		String body = "";
		body += "appid=" + appId;
		body += "&redirect_uri=" + URIUtil.encodeURIComponent(redirectURI);
		body += "&response_type=code";
		body += "&scope=" + scope;
		body += "&state=" + state;
		body += "#wechat_redirect";
		HttpEntity<String> entity = new HttpEntity<String>(body);
		System.err.println(url + body);
		ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
		return exchange;
	}

	public static ResponseEntity<String> getAccessToken(String appId, String SECRET, String code) {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://api.weixin.qq.com/sns/oauth2/access_token?";
		String body = "";
		body += "appid=" + appId;
		body += "&secret=" + SECRET;
		body += "&code=" + code;
		body += "&grant_type=authorization_code";
		HttpEntity<String> entity = new HttpEntity<String>(body);
		ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
		return exchange;
	}

	public static void main(String[] args) {
		String appId = "wx6d3c9a062ab6fcfc";
		String redirectURI = "http://lihuiquan.ticp.io/api";
		String scope = "snsapi_base";
		String state = "123";
		ResponseEntity<String> restTemplate = authLogin(appId, redirectURI, scope, state);
	}
}
