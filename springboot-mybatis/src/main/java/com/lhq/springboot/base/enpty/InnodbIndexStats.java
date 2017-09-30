package com.lhq.springboot.base.enpty;

import java.util.Date;

public class InnodbIndexStats extends InnodbIndexStatsKey {

	/**
	 * 字段描述: 字段:innodb_index_stats.last_update
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date lastUpdate;
	/**
	 * 字段描述: 字段:innodb_index_stats.stat_value
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Long statValue;
	/**
	 * 字段描述: 字段:innodb_index_stats.sample_size
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Long sampleSize;
	/**
	 * 字段描述: 字段:innodb_index_stats.stat_description
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String statDescription;

	/**
	 * 描述:获取-
	 * @return  the value of innodb_index_stats.last_update
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * 描述:设置-
	 * @param lastUpdate  the value for innodb_index_stats.last_update
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * 描述:获取-
	 * @return  the value of innodb_index_stats.stat_value
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Long getStatValue() {
		return statValue;
	}

	/**
	 * 描述:设置-
	 * @param statValue  the value for innodb_index_stats.stat_value
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setStatValue(Long statValue) {
		this.statValue = statValue;
	}

	/**
	 * 描述:获取-
	 * @return  the value of innodb_index_stats.sample_size
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Long getSampleSize() {
		return sampleSize;
	}

	/**
	 * 描述:设置-
	 * @param sampleSize  the value for innodb_index_stats.sample_size
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSampleSize(Long sampleSize) {
		this.sampleSize = sampleSize;
	}

	/**
	 * 描述:获取-
	 * @return  the value of innodb_index_stats.stat_description
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getStatDescription() {
		return statDescription;
	}

	/**
	 * 描述:设置-
	 * @param statDescription  the value for innodb_index_stats.stat_description
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setStatDescription(String statDescription) {
		this.statDescription = statDescription == null ? null : statDescription.trim();
	}
}