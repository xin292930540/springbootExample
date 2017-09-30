package com.lhq.springboot.base.enpty;

import java.util.Date;

public class GeneralLog {

	/**
	 * 字段描述: 字段:general_log.event_time
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date eventTime;
	/**
	 * 字段描述: 字段:general_log.thread_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Long threadId;
	/**
	 * 字段描述: 字段:general_log.server_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer serverId;
	/**
	 * 字段描述: 字段:general_log.command_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String commandType;

	/**
	 * 描述:获取-
	 * @return  the value of general_log.event_time
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getEventTime() {
		return eventTime;
	}

	/**
	 * 描述:设置-
	 * @param eventTime  the value for general_log.event_time
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	/**
	 * 描述:获取-
	 * @return  the value of general_log.thread_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Long getThreadId() {
		return threadId;
	}

	/**
	 * 描述:设置-
	 * @param threadId  the value for general_log.thread_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setThreadId(Long threadId) {
		this.threadId = threadId;
	}

	/**
	 * 描述:获取-
	 * @return  the value of general_log.server_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getServerId() {
		return serverId;
	}

	/**
	 * 描述:设置-
	 * @param serverId  the value for general_log.server_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setServerId(Integer serverId) {
		this.serverId = serverId;
	}

	/**
	 * 描述:获取-
	 * @return  the value of general_log.command_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getCommandType() {
		return commandType;
	}

	/**
	 * 描述:设置-
	 * @param commandType  the value for general_log.command_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setCommandType(String commandType) {
		this.commandType = commandType == null ? null : commandType.trim();
	}
}