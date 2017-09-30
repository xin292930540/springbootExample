package com.lhq.springboot.base.enpty;

public class InnodbTableStatsKey {

	/**
	 * 字段描述: 字段:innodb_table_stats.database_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String databaseName;
	/**
	 * 字段描述: 字段:innodb_table_stats.table_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String tableName;

	/**
	 * 描述:获取-
	 * @return  the value of innodb_table_stats.database_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * 描述:设置-
	 * @param databaseName  the value for innodb_table_stats.database_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName == null ? null : databaseName.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of innodb_table_stats.table_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getTableName() {
		return tableName;
	}

	/**
	 * 描述:设置-
	 * @param tableName  the value for innodb_table_stats.table_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName == null ? null : tableName.trim();
	}
}