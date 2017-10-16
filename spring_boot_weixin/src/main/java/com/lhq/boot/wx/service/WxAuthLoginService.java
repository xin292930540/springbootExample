package com.lhq.boot.wx.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public interface WxAuthLoginService {

	boolean WxAuthLogin(String code, String rurl, String state, HttpServletRequest request,
			HttpServletResponse response) throws Exception;

}
