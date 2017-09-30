package com.lhq.springboot.base.enpty;

import java.util.Date;

public class Event extends EventKey {

	/**
	 * 字段描述: 字段:event.definer
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String definer;
	/**
	 * 字段描述: 字段:event.execute_at
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date executeAt;
	/**
	 * 字段描述: 字段:event.interval_value
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer intervalValue;
	/**
	 * 字段描述: 字段:event.interval_field
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String intervalField;
	/**
	 * 字段描述: 字段:event.created
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date created;
	/**
	 * 字段描述: 字段:event.modified
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date modified;
	/**
	 * 字段描述: 字段:event.last_executed
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date lastExecuted;
	/**
	 * 字段描述: 字段:event.starts
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date starts;
	/**
	 * 字段描述: 字段:event.ends
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date ends;
	/**
	 * 字段描述: 字段:event.status
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String status;
	/**
	 * 字段描述: 字段:event.on_completion
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String onCompletion;
	/**
	 * 字段描述: 字段:event.sql_mode
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String sqlMode;
	/**
	 * 字段描述: 字段:event.comment
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String comment;
	/**
	 * 字段描述: 字段:event.originator
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer originator;
	/**
	 * 字段描述: 字段:event.time_zone
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String timeZone;
	/**
	 * 字段描述: 字段:event.character_set_client
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String characterSetClient;
	/**
	 * 字段描述: 字段:event.collation_connection
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String collationConnection;
	/**
	 * 字段描述: 字段:event.db_collation
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String dbCollation;

	/**
	 * 描述:获取-
	 * @return  the value of event.definer
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getDefiner() {
		return definer;
	}

	/**
	 * 描述:设置-
	 * @param definer  the value for event.definer
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setDefiner(String definer) {
		this.definer = definer == null ? null : definer.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.execute_at
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getExecuteAt() {
		return executeAt;
	}

	/**
	 * 描述:设置-
	 * @param executeAt  the value for event.execute_at
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setExecuteAt(Date executeAt) {
		this.executeAt = executeAt;
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.interval_value
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getIntervalValue() {
		return intervalValue;
	}

	/**
	 * 描述:设置-
	 * @param intervalValue  the value for event.interval_value
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setIntervalValue(Integer intervalValue) {
		this.intervalValue = intervalValue;
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.interval_field
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getIntervalField() {
		return intervalField;
	}

	/**
	 * 描述:设置-
	 * @param intervalField  the value for event.interval_field
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setIntervalField(String intervalField) {
		this.intervalField = intervalField == null ? null : intervalField.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.created
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * 描述:设置-
	 * @param created  the value for event.created
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.modified
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * 描述:设置-
	 * @param modified  the value for event.modified
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setModified(Date modified) {
		this.modified = modified;
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.last_executed
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getLastExecuted() {
		return lastExecuted;
	}

	/**
	 * 描述:设置-
	 * @param lastExecuted  the value for event.last_executed
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setLastExecuted(Date lastExecuted) {
		this.lastExecuted = lastExecuted;
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.starts
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getStarts() {
		return starts;
	}

	/**
	 * 描述:设置-
	 * @param starts  the value for event.starts
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setStarts(Date starts) {
		this.starts = starts;
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.ends
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getEnds() {
		return ends;
	}

	/**
	 * 描述:设置-
	 * @param ends  the value for event.ends
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setEnds(Date ends) {
		this.ends = ends;
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.status
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * 描述:设置-
	 * @param status  the value for event.status
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.on_completion
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getOnCompletion() {
		return onCompletion;
	}

	/**
	 * 描述:设置-
	 * @param onCompletion  the value for event.on_completion
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setOnCompletion(String onCompletion) {
		this.onCompletion = onCompletion == null ? null : onCompletion.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.sql_mode
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getSqlMode() {
		return sqlMode;
	}

	/**
	 * 描述:设置-
	 * @param sqlMode  the value for event.sql_mode
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSqlMode(String sqlMode) {
		this.sqlMode = sqlMode == null ? null : sqlMode.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.comment
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 描述:设置-
	 * @param comment  the value for event.comment
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.originator
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getOriginator() {
		return originator;
	}

	/**
	 * 描述:设置-
	 * @param originator  the value for event.originator
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setOriginator(Integer originator) {
		this.originator = originator;
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.time_zone
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * 描述:设置-
	 * @param timeZone  the value for event.time_zone
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone == null ? null : timeZone.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.character_set_client
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getCharacterSetClient() {
		return characterSetClient;
	}

	/**
	 * 描述:设置-
	 * @param characterSetClient  the value for event.character_set_client
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setCharacterSetClient(String characterSetClient) {
		this.characterSetClient = characterSetClient == null ? null : characterSetClient.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.collation_connection
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getCollationConnection() {
		return collationConnection;
	}

	/**
	 * 描述:设置-
	 * @param collationConnection  the value for event.collation_connection
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setCollationConnection(String collationConnection) {
		this.collationConnection = collationConnection == null ? null : collationConnection.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.db_collation
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getDbCollation() {
		return dbCollation;
	}

	/**
	 * 描述:设置-
	 * @param dbCollation  the value for event.db_collation
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setDbCollation(String dbCollation) {
		this.dbCollation = dbCollation == null ? null : dbCollation.trim();
	}
}