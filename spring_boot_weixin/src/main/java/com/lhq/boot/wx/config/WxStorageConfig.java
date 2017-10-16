package com.lhq.boot.wx.config;

import javax.annotation.Resource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.WxMpServiceImpl;

@Configuration
public class WxStorageConfig {

	@Resource(name = "wxMpConfigStorage")
	WxMpConfigStorage wxMpConfigStorage;

	@ConfigurationProperties(prefix = "wx")
	@Bean(name = "wxMpConfigStorage")
	public WxMpConfigStorage wxMpConfigStorage() {
		WxMpInMemoryConfigStorage wxMpConfigStorage = new WxMpInMemoryConfigStorage();
		return wxMpConfigStorage;
	}

	@Bean(name = "wxMpService")
	public WxMpService wxMpService() {
		WxMpServiceImpl wxMpServiceImpl = new WxMpServiceImpl();
		wxMpServiceImpl.setWxMpConfigStorage(wxMpConfigStorage);
		return wxMpServiceImpl;
	}
}
