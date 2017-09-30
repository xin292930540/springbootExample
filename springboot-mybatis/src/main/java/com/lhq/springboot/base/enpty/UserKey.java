package com.lhq.springboot.base.enpty;

public class UserKey {

	/**
	 * 字段描述: 字段:user.Host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String host;
	/**
	 * 字段描述: 字段:user.User
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String user;

	/**
	 * 描述:获取-
	 * @return  the value of user.Host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getHost() {
		return host;
	}

	/**
	 * 描述:设置-
	 * @param host  the value for user.Host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setHost(String host) {
		this.host = host == null ? null : host.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of user.User
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getUser() {
		return user;
	}

	/**
	 * 描述:设置-
	 * @param user  the value for user.User
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setUser(String user) {
		this.user = user == null ? null : user.trim();
	}
}