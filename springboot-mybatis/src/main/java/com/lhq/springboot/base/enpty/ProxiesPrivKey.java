package com.lhq.springboot.base.enpty;

public class ProxiesPrivKey {

	/**
	 * 字段描述: 字段:proxies_priv.Host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String host;
	/**
	 * 字段描述: 字段:proxies_priv.User
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String user;
	/**
	 * 字段描述: 字段:proxies_priv.Proxied_host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String proxiedHost;
	/**
	 * 字段描述: 字段:proxies_priv.Proxied_user
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String proxiedUser;

	/**
	 * 描述:获取-
	 * @return  the value of proxies_priv.Host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getHost() {
		return host;
	}

	/**
	 * 描述:设置-
	 * @param host  the value for proxies_priv.Host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setHost(String host) {
		this.host = host == null ? null : host.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of proxies_priv.User
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getUser() {
		return user;
	}

	/**
	 * 描述:设置-
	 * @param user  the value for proxies_priv.User
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setUser(String user) {
		this.user = user == null ? null : user.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of proxies_priv.Proxied_host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getProxiedHost() {
		return proxiedHost;
	}

	/**
	 * 描述:设置-
	 * @param proxiedHost  the value for proxies_priv.Proxied_host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setProxiedHost(String proxiedHost) {
		this.proxiedHost = proxiedHost == null ? null : proxiedHost.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of proxies_priv.Proxied_user
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getProxiedUser() {
		return proxiedUser;
	}

	/**
	 * 描述:设置-
	 * @param proxiedUser  the value for proxies_priv.Proxied_user
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setProxiedUser(String proxiedUser) {
		this.proxiedUser = proxiedUser == null ? null : proxiedUser.trim();
	}
}