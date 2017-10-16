package com.lhq.boot.wx.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.lhq.boot.wx.enpty.TbAuthWxUser;
import com.lhq.boot.wx.service.WxAuthLoginService;
import com.lhq.boot.wx.util.Const;
import com.lhq.boot.wx.util.ResponseUtil;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.util.http.URIUtil;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.bean.result.WxMpUser;

@Service
@SuppressWarnings({ "rawtypes", "unchecked" })
public class WxAuthLoginServiceImpl implements WxAuthLoginService {

	@Autowired
	WxMpService wxMpService;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public boolean WxAuthLogin(String code, String rurl, String state, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 1.通过Code拿到Token
		WxMpOAuth2AccessToken oauthToken = wxMpService.oauth2getAccessToken(code);
		// 2.效验Token是否有效
		if (!wxMpService.oauth2validateAccessToken(oauthToken)) {
			String url = Const.DOMAIN_NAME + "/userauthorization/wxlogin?rurl=" + URIUtil.encodeURIComponent(rurl);
			String oauthurl = wxMpService.oauth2buildAuthorizationUrl(url, WxConsts.OAUTH2_SCOPE_USER_INFO,
					WxConsts.OAUTH2_SCOPE_USER_INFO);
			ResponseUtil.sendRedirect(response, oauthurl);
			return false;
		}
		// 3.判断之前是否授权登录过
		WxMpUser wxUser = null;
		if (!isExit(oauthToken.getOpenId())) {
			if (WxConsts.OAUTH2_SCOPE_USER_INFO.equals(state)) {
				wxUser = wxMpService.oauth2getUserInfo(oauthToken, "zh_CN");
			} else {
				wxUser = wxMpService.userInfo(oauthToken.getOpenId(), null);
				if (!wxUser.getSubscribe()) {
					String url = Const.DOMAIN_NAME + "/userauthorization/wxlogin?rurl="
							+ URIUtil.encodeURIComponent(rurl);
					String oauthurl = wxMpService.oauth2buildAuthorizationUrl(url, WxConsts.OAUTH2_SCOPE_USER_INFO,
							WxConsts.OAUTH2_SCOPE_USER_INFO);
					ResponseUtil.sendRedirect(response, oauthurl);
					return false;
				}
			}
			TbAuthWxUser authWxUser = new TbAuthWxUser();
			authWxUser.setCity(wxUser.getCity());
			authWxUser.setCountry(wxUser.getCountry());
			authWxUser.setGroupId(wxUser.getGroupId() + "");
			authWxUser.setHeadImgUrl(wxUser.getHeadImgUrl());
			authWxUser.setLanguage(wxUser.getLanguage());
			authWxUser.setNickeName(wxUser.getNickname());
			authWxUser.setOpenId(wxUser.getOpenId());
			authWxUser.setProvince(wxUser.getProvince());
			authWxUser.setRemark(wxUser.getRemark());
			authWxUser.setSex(wxUser.getSex());
			authWxUser.setSexId(wxUser.getSexId());
			authWxUser.setSubscribeTime(wxUser.getSubscribeTime() + "");
			authWxUser.setUnionId(wxUser.getUnionId());
			saveAuthUser(authWxUser);
		} else {
			if (WxConsts.OAUTH2_SCOPE_USER_INFO.equals(state)) {
				wxUser = wxMpService.oauth2getUserInfo(oauthToken, "zh_CN");
			}
			TbAuthWxUser authWxUser = getAuthUser(oauthToken.getOpenId());
			authWxUser.setCity(wxUser.getCity());
			authWxUser.setCountry(wxUser.getCountry());
			authWxUser.setGroupId(wxUser.getGroupId().intValue() + "");
			authWxUser.setHeadImgUrl(wxUser.getHeadImgUrl());
			authWxUser.setLanguage(wxUser.getLanguage());
			authWxUser.setNickeName(wxUser.getNickname());
			authWxUser.setOpenId(wxUser.getOpenId());
			authWxUser.setProvince(wxUser.getProvince());
			authWxUser.setRemark(wxUser.getRemark());
			authWxUser.setSex(wxUser.getSex());
			authWxUser.setSexId(wxUser.getSexId());
			authWxUser.setSubscribeTime(wxUser.getSubscribeTime() + "");
			authWxUser.setUnionId(wxUser.getUnionId());
			updataAuthUser(authWxUser);
		}
		ResponseUtil.sendRedirect(response, rurl);
		return true;
	}

	protected boolean updataAuthUser(TbAuthWxUser authWxUser) {
		return false;
	}

	protected boolean isExit(String openId) {
		String sql = "SELECT * FROM TB_AUTH_WX_USER WHERE OPEN_ID = ?";
		List<TbAuthWxUser> query = jdbcTemplate.query(sql, new Object[] { openId },
				new BeanPropertyRowMapper(TbAuthWxUser.class));
		return query.isEmpty() || query == null ? false : true;
	}

	protected boolean saveAuthUser(Object object) {
		return false;
	}

	protected TbAuthWxUser getAuthUser(String openId) {
		String sql = "SELECT * FROM TB_AUTH_WX_USER WHERE OPEN_ID = ?";
		List<TbAuthWxUser> query = jdbcTemplate.query(sql, new Object[] { openId },
				new BeanPropertyRowMapper(TbAuthWxUser.class));
		if (query != null && !query.isEmpty()) {
			return query.get(0);
		}
		return null;
	}
}
