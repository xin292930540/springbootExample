package com.lhq.springboot.base.enpty;

public class InnodbIndexStatsKey {

	/**
	 * 字段描述: 字段:innodb_index_stats.database_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String databaseName;
	/**
	 * 字段描述: 字段:innodb_index_stats.table_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String tableName;
	/**
	 * 字段描述: 字段:innodb_index_stats.index_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String indexName;
	/**
	 * 字段描述: 字段:innodb_index_stats.stat_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String statName;

	/**
	 * 描述:获取-
	 * @return  the value of innodb_index_stats.database_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * 描述:设置-
	 * @param databaseName  the value for innodb_index_stats.database_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName == null ? null : databaseName.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of innodb_index_stats.table_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * 描述:设置-
	 * @param tableName  the value for innodb_index_stats.table_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName == null ? null : tableName.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of innodb_index_stats.index_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getIndexName() {
		return indexName;
	}

	/**
	 * 描述:设置-
	 * @param indexName  the value for innodb_index_stats.index_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setIndexName(String indexName) {
		this.indexName = indexName == null ? null : indexName.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of innodb_index_stats.stat_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getStatName() {
		return statName;
	}

	/**
	 * 描述:设置-
	 * @param statName  the value for innodb_index_stats.stat_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setStatName(String statName) {
		this.statName = statName == null ? null : statName.trim();
	}
}