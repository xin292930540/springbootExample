package com.lhq.springboot.base.enpty;

public class DbKey {

	/**
	 * 字段描述: 字段:db.Host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String host;
	/**
	 * 字段描述: 字段:db.Db
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String db;
	/**
	 * 字段描述: 字段:db.User
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String user;

	/**
	 * 描述:获取-
	 * @return  the value of db.Host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getHost() {
		return host;
	}

	/**
	 * 描述:设置-
	 * @param host  the value for db.Host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setHost(String host) {
		this.host = host == null ? null : host.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of db.Db
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getDb() {
		return db;
	}

	/**
	 * 描述:设置-
	 * @param db  the value for db.Db
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setDb(String db) {
		this.db = db == null ? null : db.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of db.User
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getUser() {
		return user;
	}

	/**
	 * 描述:设置-
	 * @param user  the value for db.User
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setUser(String user) {
		this.user = user == null ? null : user.trim();
	}
}