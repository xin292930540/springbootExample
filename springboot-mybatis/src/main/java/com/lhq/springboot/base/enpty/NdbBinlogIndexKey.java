package com.lhq.springboot.base.enpty;

public class NdbBinlogIndexKey {

	/**
	 * 字段描述: 字段:ndb_binlog_index.epoch
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Long epoch;
	/**
	 * 字段描述: 字段:ndb_binlog_index.orig_server_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer origServerId;
	/**
	 * 字段描述: 字段:ndb_binlog_index.orig_epoch
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Long origEpoch;

	/**
	 * 描述:获取-
	 * @return  the value of ndb_binlog_index.epoch
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Long getEpoch() {
		return epoch;
	}

	/**
	 * 描述:设置-
	 * @param epoch  the value for ndb_binlog_index.epoch
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setEpoch(Long epoch) {
		this.epoch = epoch;
	}

	/**
	 * 描述:获取-
	 * @return  the value of ndb_binlog_index.orig_server_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getOrigServerId() {
		return origServerId;
	}

	/**
	 * 描述:设置-
	 * @param origServerId  the value for ndb_binlog_index.orig_server_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setOrigServerId(Integer origServerId) {
		this.origServerId = origServerId;
	}

	/**
	 * 描述:获取-
	 * @return  the value of ndb_binlog_index.orig_epoch
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Long getOrigEpoch() {
		return origEpoch;
	}

	/**
	 * 描述:设置-
	 * @param origEpoch  the value for ndb_binlog_index.orig_epoch
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setOrigEpoch(Long origEpoch) {
		this.origEpoch = origEpoch;
	}
}