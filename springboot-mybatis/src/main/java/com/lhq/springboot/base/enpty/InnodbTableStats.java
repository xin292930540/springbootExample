package com.lhq.springboot.base.enpty;

import java.util.Date;

public class InnodbTableStats extends InnodbTableStatsKey {

	/**
	 * 字段描述: 字段:innodb_table_stats.last_update
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date lastUpdate;
	/**
	 * 字段描述: 字段:innodb_table_stats.n_rows
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Long nRows;
	/**
	 * 字段描述: 字段:innodb_table_stats.clustered_index_size
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Long clusteredIndexSize;
	/**
	 * 字段描述: 字段:innodb_table_stats.sum_of_other_index_sizes
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Long sumOfOtherIndexSizes;

	/**
	 * 描述:获取-
	 * @return  the value of innodb_table_stats.last_update
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * 描述:设置-
	 * @param lastUpdate  the value for innodb_table_stats.last_update
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * 描述:获取-
	 * @return  the value of innodb_table_stats.n_rows
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Long getnRows() {
		return nRows;
	}

	/**
	 * 描述:设置-
	 * @param nRows  the value for innodb_table_stats.n_rows
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setnRows(Long nRows) {
		this.nRows = nRows;
	}

	/**
	 * 描述:获取-
	 * @return  the value of innodb_table_stats.clustered_index_size
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Long getClusteredIndexSize() {
		return clusteredIndexSize;
	}

	/**
	 * 描述:设置-
	 * @param clusteredIndexSize  the value for innodb_table_stats.clustered_index_size
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setClusteredIndexSize(Long clusteredIndexSize) {
		this.clusteredIndexSize = clusteredIndexSize;
	}

	/**
	 * 描述:获取-
	 * @return  the value of innodb_table_stats.sum_of_other_index_sizes
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Long getSumOfOtherIndexSizes() {
		return sumOfOtherIndexSizes;
	}

	/**
	 * 描述:设置-
	 * @param sumOfOtherIndexSizes  the value for innodb_table_stats.sum_of_other_index_sizes
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSumOfOtherIndexSizes(Long sumOfOtherIndexSizes) {
		this.sumOfOtherIndexSizes = sumOfOtherIndexSizes;
	}
}