package com.lhq.springboot.base.enpty;

import java.util.Date;

public class TablesPriv extends TablesPrivKey {

	/**
	 * 字段描述: 字段:tables_priv.Grantor
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String grantor;
	/**
	 * 字段描述: 字段:tables_priv.Timestamp
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date timestamp;
	/**
	 * 字段描述: 字段:tables_priv.Table_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String tablePriv;
	/**
	 * 字段描述: 字段:tables_priv.Column_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String columnPriv;

	/**
	 * 描述:获取-
	 * @return  the value of tables_priv.Grantor
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getGrantor() {
		return grantor;
	}

	/**
	 * 描述:设置-
	 * @param grantor  the value for tables_priv.Grantor
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setGrantor(String grantor) {
		this.grantor = grantor == null ? null : grantor.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of tables_priv.Timestamp
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * 描述:设置-
	 * @param timestamp  the value for tables_priv.Timestamp
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * 描述:获取-
	 * @return  the value of tables_priv.Table_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getTablePriv() {
		return tablePriv;
	}

	/**
	 * 描述:设置-
	 * @param tablePriv  the value for tables_priv.Table_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setTablePriv(String tablePriv) {
		this.tablePriv = tablePriv == null ? null : tablePriv.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of tables_priv.Column_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getColumnPriv() {
		return columnPriv;
	}

	/**
	 * 描述:设置-
	 * @param columnPriv  the value for tables_priv.Column_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setColumnPriv(String columnPriv) {
		this.columnPriv = columnPriv == null ? null : columnPriv.trim();
	}
}