package com.lhq.boot.wx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lhq.boot.wx.enpty.TbAuthWxUser;
import com.lhq.boot.wx.service.WxAuthLoginService;

import me.chanjar.weixin.mp.api.WxMpService;

@RestController
@SuppressWarnings("rawtypes")
@RequestMapping("/userauthorization")
public class WxAuthLoginController extends BaseController {

	@Autowired
	WxAuthLoginService wxAuthLoginService;

	@Autowired
	WxMpService wxMpService;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping("/wxlogin")
	public void WxAuthLogin(String code, String rurl, String state) {
		try {
			wxAuthLoginService.WxAuthLogin(code, rurl, state, request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("/test")
	public List<TbAuthWxUser> test(String code, String rurl, String state) {
		String sql = "SELECT * FROM TB_AUTH_WX_USER";
		@SuppressWarnings("unchecked")
		List<TbAuthWxUser> tbAuthWxUsers = jdbcTemplate.query(sql, new Object[] {},
				new BeanPropertyRowMapper(TbAuthWxUser.class));
		return tbAuthWxUsers;

	}
}
