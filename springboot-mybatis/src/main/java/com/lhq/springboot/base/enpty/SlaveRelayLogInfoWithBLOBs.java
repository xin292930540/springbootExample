package com.lhq.springboot.base.enpty;

public class SlaveRelayLogInfoWithBLOBs extends SlaveRelayLogInfo {

	/**
	 * 字段描述:The name of the current relay log file. 字段:slave_relay_log_info.Relay_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String relayLogName;
	/**
	 * 字段描述:The name of the master binary log file from which the events in the relay log file were read. 字段:slave_relay_log_info.Master_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String masterLogName;

	/**
	 * 描述:获取-The name of the current relay log file.
	 * @return  the value of slave_relay_log_info.Relay_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getRelayLogName() {
		return relayLogName;
	}

	/**
	 * 描述:设置-The name of the current relay log file.
	 * @param relayLogName  the value for slave_relay_log_info.Relay_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setRelayLogName(String relayLogName) {
		this.relayLogName = relayLogName == null ? null : relayLogName.trim();
	}

	/**
	 * 描述:获取-The name of the master binary log file from which the events in the relay log file were read.
	 * @return  the value of slave_relay_log_info.Master_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getMasterLogName() {
		return masterLogName;
	}

	/**
	 * 描述:设置-The name of the master binary log file from which the events in the relay log file were read.
	 * @param masterLogName  the value for slave_relay_log_info.Master_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setMasterLogName(String masterLogName) {
		this.masterLogName = masterLogName == null ? null : masterLogName.trim();
	}
}