package com.lhq.springboot.base.enpty;

import java.util.Date;

public class ProxiesPriv extends ProxiesPrivKey {

	/**
	 * 字段描述: 字段:proxies_priv.With_grant
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Byte withGrant;
	/**
	 * 字段描述: 字段:proxies_priv.Grantor
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String grantor;
	/**
	 * 字段描述: 字段:proxies_priv.Timestamp
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date timestamp;

	/**
	 * 描述:获取-
	 * @return  the value of proxies_priv.With_grant
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Byte getWithGrant() {
		return withGrant;
	}

	/**
	 * 描述:设置-
	 * @param withGrant  the value for proxies_priv.With_grant
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setWithGrant(Byte withGrant) {
		this.withGrant = withGrant;
	}

	/**
	 * 描述:获取-
	 * @return  the value of proxies_priv.Grantor
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getGrantor() {
		return grantor;
	}

	/**
	 * 描述:设置-
	 * @param grantor  the value for proxies_priv.Grantor
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setGrantor(String grantor) {
		this.grantor = grantor == null ? null : grantor.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of proxies_priv.Timestamp
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * 描述:设置-
	 * @param timestamp  the value for proxies_priv.Timestamp
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}