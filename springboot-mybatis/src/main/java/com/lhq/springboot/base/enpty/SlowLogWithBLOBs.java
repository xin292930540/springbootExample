package com.lhq.springboot.base.enpty;

public class SlowLogWithBLOBs extends SlowLog {

	/**
	 * 字段描述: 字段:slow_log.user_host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String userHost;
	/**
	 * 字段描述: 字段:slow_log.sql_text
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private byte[] sqlText;

	/**
	 * 描述:获取-
	 * @return  the value of slow_log.user_host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getUserHost() {
		return userHost;
	}

	/**
	 * 描述:设置-
	 * @param userHost  the value for slow_log.user_host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setUserHost(String userHost) {
		this.userHost = userHost == null ? null : userHost.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of slow_log.sql_text
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public byte[] getSqlText() {
		return sqlText;
	}

	/**
	 * 描述:设置-
	 * @param sqlText  the value for slow_log.sql_text
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSqlText(byte[] sqlText) {
		this.sqlText = sqlText;
	}
}