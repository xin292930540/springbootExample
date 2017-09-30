package com.lhq.springboot.base.enpty;

import java.util.Date;

public class ProcsPriv extends ProcsPrivKey {

	/**
	 * 字段描述: 字段:procs_priv.Grantor
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String grantor;
	/**
	 * 字段描述: 字段:procs_priv.Proc_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String procPriv;
	/**
	 * 字段描述: 字段:procs_priv.Timestamp
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date timestamp;

	/**
	 * 描述:获取-
	 * @return  the value of procs_priv.Grantor
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getGrantor() {
		return grantor;
	}

	/**
	 * 描述:设置-
	 * @param grantor  the value for procs_priv.Grantor
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setGrantor(String grantor) {
		this.grantor = grantor == null ? null : grantor.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of procs_priv.Proc_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getProcPriv() {
		return procPriv;
	}

	/**
	 * 描述:设置-
	 * @param procPriv  the value for procs_priv.Proc_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setProcPriv(String procPriv) {
		this.procPriv = procPriv == null ? null : procPriv.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of procs_priv.Timestamp
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * 描述:设置-
	 * @param timestamp  the value for procs_priv.Timestamp
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}