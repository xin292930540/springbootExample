package com.lhq.springboot.base.enpty;

public class GtidExecutedKey {

	/**
	 * 字段描述:uuid of the source where the transaction was originally executed. 字段:gtid_executed.source_uuid
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String sourceUuid;
	/**
	 * 字段描述:First number of interval. 字段:gtid_executed.interval_start
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Long intervalStart;

	/**
	 * 描述:获取-uuid of the source where the transaction was originally executed.
	 * @return  the value of gtid_executed.source_uuid
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getSourceUuid() {
		return sourceUuid;
	}

	/**
	 * 描述:设置-uuid of the source where the transaction was originally executed.
	 * @param sourceUuid  the value for gtid_executed.source_uuid
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSourceUuid(String sourceUuid) {
		this.sourceUuid = sourceUuid == null ? null : sourceUuid.trim();
	}

	/**
	 * 描述:获取-First number of interval.
	 * @return  the value of gtid_executed.interval_start
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Long getIntervalStart() {
		return intervalStart;
	}

	/**
	 * 描述:设置-First number of interval.
	 * @param intervalStart  the value for gtid_executed.interval_start
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setIntervalStart(Long intervalStart) {
		this.intervalStart = intervalStart;
	}
}