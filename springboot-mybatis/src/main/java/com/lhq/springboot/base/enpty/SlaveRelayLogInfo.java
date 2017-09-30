package com.lhq.springboot.base.enpty;

public class SlaveRelayLogInfo {

	/**
	 * 字段描述:The channel on which the slave is connected to a source. Used in Multisource Replication 字段:slave_relay_log_info.Channel_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String channelName;
	/**
	 * 字段描述:Number of lines in the file or rows in the table. Used to version table definitions. 字段:slave_relay_log_info.Number_of_lines
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer numberOfLines;
	/**
	 * 字段描述:The relay log position of the last executed event. 字段:slave_relay_log_info.Relay_log_pos
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Long relayLogPos;
	/**
	 * 字段描述:The master log position of the last executed event. 字段:slave_relay_log_info.Master_log_pos
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Long masterLogPos;
	/**
	 * 字段描述:The number of seconds that the slave must lag behind the master. 字段:slave_relay_log_info.Sql_delay
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer sqlDelay;
	/**
	 * 字段描述: 字段:slave_relay_log_info.Number_of_workers
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer numberOfWorkers;
	/**
	 * 字段描述:Internal Id that uniquely identifies this record. 字段:slave_relay_log_info.Id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer id;

	/**
	 * 描述:获取-The channel on which the slave is connected to a source. Used in Multisource Replication
	 * @return  the value of slave_relay_log_info.Channel_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getChannelName() {
		return channelName;
	}

	/**
	 * 描述:设置-The channel on which the slave is connected to a source. Used in Multisource Replication
	 * @param channelName  the value for slave_relay_log_info.Channel_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setChannelName(String channelName) {
		this.channelName = channelName == null ? null : channelName.trim();
	}

	/**
	 * 描述:获取-Number of lines in the file or rows in the table. Used to version table definitions.
	 * @return  the value of slave_relay_log_info.Number_of_lines
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getNumberOfLines() {
		return numberOfLines;
	}

	/**
	 * 描述:设置-Number of lines in the file or rows in the table. Used to version table definitions.
	 * @param numberOfLines  the value for slave_relay_log_info.Number_of_lines
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setNumberOfLines(Integer numberOfLines) {
		this.numberOfLines = numberOfLines;
	}

	/**
	 * 描述:获取-The relay log position of the last executed event.
	 * @return  the value of slave_relay_log_info.Relay_log_pos
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Long getRelayLogPos() {
		return relayLogPos;
	}

	/**
	 * 描述:设置-The relay log position of the last executed event.
	 * @param relayLogPos  the value for slave_relay_log_info.Relay_log_pos
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setRelayLogPos(Long relayLogPos) {
		this.relayLogPos = relayLogPos;
	}

	/**
	 * 描述:获取-The master log position of the last executed event.
	 * @return  the value of slave_relay_log_info.Master_log_pos
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Long getMasterLogPos() {
		return masterLogPos;
	}

	/**
	 * 描述:设置-The master log position of the last executed event.
	 * @param masterLogPos  the value for slave_relay_log_info.Master_log_pos
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setMasterLogPos(Long masterLogPos) {
		this.masterLogPos = masterLogPos;
	}

	/**
	 * 描述:获取-The number of seconds that the slave must lag behind the master.
	 * @return  the value of slave_relay_log_info.Sql_delay
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getSqlDelay() {
		return sqlDelay;
	}

	/**
	 * 描述:设置-The number of seconds that the slave must lag behind the master.
	 * @param sqlDelay  the value for slave_relay_log_info.Sql_delay
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSqlDelay(Integer sqlDelay) {
		this.sqlDelay = sqlDelay;
	}

	/**
	 * 描述:获取-
	 * @return  the value of slave_relay_log_info.Number_of_workers
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getNumberOfWorkers() {
		return numberOfWorkers;
	}

	/**
	 * 描述:设置-
	 * @param numberOfWorkers  the value for slave_relay_log_info.Number_of_workers
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setNumberOfWorkers(Integer numberOfWorkers) {
		this.numberOfWorkers = numberOfWorkers;
	}

	/**
	 * 描述:获取-Internal Id that uniquely identifies this record.
	 * @return  the value of slave_relay_log_info.Id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 描述:设置-Internal Id that uniquely identifies this record.
	 * @param id  the value for slave_relay_log_info.Id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}
}