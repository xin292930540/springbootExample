package com.lhq.springboot.base.enpty;

public class GeneralLogWithBLOBs extends GeneralLog {

	/**
	 * 字段描述: 字段:general_log.user_host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String userHost;
	/**
	 * 字段描述: 字段:general_log.argument
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private byte[] argument;

	/**
	 * 描述:获取-
	 * @return  the value of general_log.user_host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getUserHost() {
		return userHost;
	}

	/**
	 * 描述:设置-
	 * @param userHost  the value for general_log.user_host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setUserHost(String userHost) {
		this.userHost = userHost == null ? null : userHost.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of general_log.argument
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public byte[] getArgument() {
		return argument;
	}

	/**
	 * 描述:设置-
	 * @param argument  the value for general_log.argument
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setArgument(byte[] argument) {
		this.argument = argument;
	}
}