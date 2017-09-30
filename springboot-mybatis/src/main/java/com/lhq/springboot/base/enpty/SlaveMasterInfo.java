package com.lhq.springboot.base.enpty;

public class SlaveMasterInfo {

	/**
	 * 字段描述:The channel on which the slave is connected to a source. Used in Multisource Replication 字段:slave_master_info.Channel_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String channelName;
	/**
	 * 字段描述:Number of lines in the file. 字段:slave_master_info.Number_of_lines
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer numberOfLines;
	/**
	 * 字段描述:The master log position of the last read event. 字段:slave_master_info.Master_log_pos
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Long masterLogPos;
	/**
	 * 字段描述:The host name of the master. 字段:slave_master_info.Host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String host;
	/**
	 * 字段描述:The network port used to connect to the master. 字段:slave_master_info.Port
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer port;
	/**
	 * 字段描述:The period (in seconds) that the slave will wait before trying to reconnect to the master. 字段:slave_master_info.Connect_retry
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer connectRetry;
	/**
	 * 字段描述:Indicates whether the server supports SSL connections. 字段:slave_master_info.Enabled_ssl
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Byte enabledSsl;
	/**
	 * 字段描述:Whether to verify the server certificate. 字段:slave_master_info.Ssl_verify_server_cert
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Byte sslVerifyServerCert;
	/**
	 * 字段描述: 字段:slave_master_info.Heartbeat
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Float heartbeat;
	/**
	 * 字段描述:Number of reconnect attempts, to the master, before giving up. 字段:slave_master_info.Retry_count
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Long retryCount;
	/**
	 * 字段描述:Indicates whether GTIDs will be used to retrieve events from the master. 字段:slave_master_info.Enabled_auto_position
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Byte enabledAutoPosition;

	/**
	 * 描述:获取-The channel on which the slave is connected to a source. Used in Multisource Replication
	 * @return  the value of slave_master_info.Channel_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getChannelName() {
		return channelName;
	}

	/**
	 * 描述:设置-The channel on which the slave is connected to a source. Used in Multisource Replication
	 * @param channelName  the value for slave_master_info.Channel_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setChannelName(String channelName) {
		this.channelName = channelName == null ? null : channelName.trim();
	}

	/**
	 * 描述:获取-Number of lines in the file.
	 * @return  the value of slave_master_info.Number_of_lines
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getNumberOfLines() {
		return numberOfLines;
	}

	/**
	 * 描述:设置-Number of lines in the file.
	 * @param numberOfLines  the value for slave_master_info.Number_of_lines
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setNumberOfLines(Integer numberOfLines) {
		this.numberOfLines = numberOfLines;
	}

	/**
	 * 描述:获取-The master log position of the last read event.
	 * @return  the value of slave_master_info.Master_log_pos
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Long getMasterLogPos() {
		return masterLogPos;
	}

	/**
	 * 描述:设置-The master log position of the last read event.
	 * @param masterLogPos  the value for slave_master_info.Master_log_pos
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setMasterLogPos(Long masterLogPos) {
		this.masterLogPos = masterLogPos;
	}

	/**
	 * 描述:获取-The host name of the master.
	 * @return  the value of slave_master_info.Host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getHost() {
		return host;
	}

	/**
	 * 描述:设置-The host name of the master.
	 * @param host  the value for slave_master_info.Host
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setHost(String host) {
		this.host = host == null ? null : host.trim();
	}

	/**
	 * 描述:获取-The network port used to connect to the master.
	 * @return  the value of slave_master_info.Port
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getPort() {
		return port;
	}

	/**
	 * 描述:设置-The network port used to connect to the master.
	 * @param port  the value for slave_master_info.Port
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setPort(Integer port) {
		this.port = port;
	}

	/**
	 * 描述:获取-The period (in seconds) that the slave will wait before trying to reconnect to the master.
	 * @return  the value of slave_master_info.Connect_retry
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getConnectRetry() {
		return connectRetry;
	}

	/**
	 * 描述:设置-The period (in seconds) that the slave will wait before trying to reconnect to the master.
	 * @param connectRetry  the value for slave_master_info.Connect_retry
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setConnectRetry(Integer connectRetry) {
		this.connectRetry = connectRetry;
	}

	/**
	 * 描述:获取-Indicates whether the server supports SSL connections.
	 * @return  the value of slave_master_info.Enabled_ssl
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Byte getEnabledSsl() {
		return enabledSsl;
	}

	/**
	 * 描述:设置-Indicates whether the server supports SSL connections.
	 * @param enabledSsl  the value for slave_master_info.Enabled_ssl
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setEnabledSsl(Byte enabledSsl) {
		this.enabledSsl = enabledSsl;
	}

	/**
	 * 描述:获取-Whether to verify the server certificate.
	 * @return  the value of slave_master_info.Ssl_verify_server_cert
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Byte getSslVerifyServerCert() {
		return sslVerifyServerCert;
	}

	/**
	 * 描述:设置-Whether to verify the server certificate.
	 * @param sslVerifyServerCert  the value for slave_master_info.Ssl_verify_server_cert
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSslVerifyServerCert(Byte sslVerifyServerCert) {
		this.sslVerifyServerCert = sslVerifyServerCert;
	}

	/**
	 * 描述:获取-
	 * @return  the value of slave_master_info.Heartbeat
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Float getHeartbeat() {
		return heartbeat;
	}

	/**
	 * 描述:设置-
	 * @param heartbeat  the value for slave_master_info.Heartbeat
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setHeartbeat(Float heartbeat) {
		this.heartbeat = heartbeat;
	}

	/**
	 * 描述:获取-Number of reconnect attempts, to the master, before giving up.
	 * @return  the value of slave_master_info.Retry_count
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Long getRetryCount() {
		return retryCount;
	}

	/**
	 * 描述:设置-Number of reconnect attempts, to the master, before giving up.
	 * @param retryCount  the value for slave_master_info.Retry_count
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setRetryCount(Long retryCount) {
		this.retryCount = retryCount;
	}

	/**
	 * 描述:获取-Indicates whether GTIDs will be used to retrieve events from the master.
	 * @return  the value of slave_master_info.Enabled_auto_position
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Byte getEnabledAutoPosition() {
		return enabledAutoPosition;
	}

	/**
	 * 描述:设置-Indicates whether GTIDs will be used to retrieve events from the master.
	 * @param enabledAutoPosition  the value for slave_master_info.Enabled_auto_position
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setEnabledAutoPosition(Byte enabledAutoPosition) {
		this.enabledAutoPosition = enabledAutoPosition;
	}
}