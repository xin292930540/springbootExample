package com.lhq.springboot.base.enpty;

import java.util.Date;

public class ColumnsPriv extends ColumnsPrivKey {

	/**
	 * 字段描述: 字段:columns_priv.Timestamp
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date timestamp;
	/**
	 * 字段描述: 字段:columns_priv.Column_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String columnPriv;

	/**
	 * 描述:获取-
	 * @return  the value of columns_priv.Timestamp
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * 描述:设置-
	 * @param timestamp  the value for columns_priv.Timestamp
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * 描述:获取-
	 * @return  the value of columns_priv.Column_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getColumnPriv() {
		return columnPriv;
	}

	/**
	 * 描述:设置-
	 * @param columnPriv  the value for columns_priv.Column_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setColumnPriv(String columnPriv) {
		this.columnPriv = columnPriv == null ? null : columnPriv.trim();
	}
}