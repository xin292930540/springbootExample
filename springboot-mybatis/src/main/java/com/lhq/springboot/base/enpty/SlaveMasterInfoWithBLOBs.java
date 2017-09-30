package com.lhq.springboot.base.enpty;

public class SlaveMasterInfoWithBLOBs extends SlaveMasterInfo {

	/**
	 * 字段描述:The name of the master binary log currently being read from the master. 字段:slave_master_info.Master_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String masterLogName;
	/**
	 * 字段描述:The user name used to connect to the master. 字段:slave_master_info.User_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String userName;
	/**
	 * 字段描述:The password used to connect to the master. 字段:slave_master_info.User_password
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String userPassword;
	/**
	 * 字段描述:The file used for the Certificate Authority (CA) certificate. 字段:slave_master_info.Ssl_ca
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String sslCa;
	/**
	 * 字段描述:The path to the Certificate Authority (CA) certificates. 字段:slave_master_info.Ssl_capath
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String sslCapath;
	/**
	 * 字段描述:The name of the SSL certificate file. 字段:slave_master_info.Ssl_cert
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String sslCert;
	/**
	 * 字段描述:The name of the cipher in use for the SSL connection. 字段:slave_master_info.Ssl_cipher
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String sslCipher;
	/**
	 * 字段描述:The name of the SSL key file. 字段:slave_master_info.Ssl_key
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String sslKey;
	/**
	 * 字段描述:Displays which interface is employed when connecting to the MySQL server 字段:slave_master_info.Bind
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String bind;
	/**
	 * 字段描述:The number of server IDs to be ignored, followed by the actual server IDs 字段:slave_master_info.Ignored_server_ids
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String ignoredServerIds;
	/**
	 * 字段描述:The master server uuid. 字段:slave_master_info.Uuid
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String uuid;
	/**
	 * 字段描述:The file used for the Certificate Revocation List (CRL) 字段:slave_master_info.Ssl_crl
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String sslCrl;
	/**
	 * 字段描述:The path used for Certificate Revocation List (CRL) files 字段:slave_master_info.Ssl_crlpath
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String sslCrlpath;
	/**
	 * 字段描述:Tls version 字段:slave_master_info.Tls_version
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String tlsVersion;

	/**
	 * 描述:获取-The name of the master binary log currently being read from the master.
	 * @return  the value of slave_master_info.Master_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getMasterLogName() {
		return masterLogName;
	}

	/**
	 * 描述:设置-The name of the master binary log currently being read from the master.
	 * @param masterLogName  the value for slave_master_info.Master_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setMasterLogName(String masterLogName) {
		this.masterLogName = masterLogName == null ? null : masterLogName.trim();
	}

	/**
	 * 描述:获取-The user name used to connect to the master.
	 * @return  the value of slave_master_info.User_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 描述:设置-The user name used to connect to the master.
	 * @param userName  the value for slave_master_info.User_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setUserName(String userName) {
		this.userName = userName == null ? null : userName.trim();
	}

	/**
	 * 描述:获取-The password used to connect to the master.
	 * @return  the value of slave_master_info.User_password
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getUserPassword() {
		return userPassword;
	}

	/**
	 * 描述:设置-The password used to connect to the master.
	 * @param userPassword  the value for slave_master_info.User_password
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword == null ? null : userPassword.trim();
	}

	/**
	 * 描述:获取-The file used for the Certificate Authority (CA) certificate.
	 * @return  the value of slave_master_info.Ssl_ca
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getSslCa() {
		return sslCa;
	}

	/**
	 * 描述:设置-The file used for the Certificate Authority (CA) certificate.
	 * @param sslCa  the value for slave_master_info.Ssl_ca
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSslCa(String sslCa) {
		this.sslCa = sslCa == null ? null : sslCa.trim();
	}

	/**
	 * 描述:获取-The path to the Certificate Authority (CA) certificates.
	 * @return  the value of slave_master_info.Ssl_capath
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getSslCapath() {
		return sslCapath;
	}

	/**
	 * 描述:设置-The path to the Certificate Authority (CA) certificates.
	 * @param sslCapath  the value for slave_master_info.Ssl_capath
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSslCapath(String sslCapath) {
		this.sslCapath = sslCapath == null ? null : sslCapath.trim();
	}

	/**
	 * 描述:获取-The name of the SSL certificate file.
	 * @return  the value of slave_master_info.Ssl_cert
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getSslCert() {
		return sslCert;
	}

	/**
	 * 描述:设置-The name of the SSL certificate file.
	 * @param sslCert  the value for slave_master_info.Ssl_cert
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSslCert(String sslCert) {
		this.sslCert = sslCert == null ? null : sslCert.trim();
	}

	/**
	 * 描述:获取-The name of the cipher in use for the SSL connection.
	 * @return  the value of slave_master_info.Ssl_cipher
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getSslCipher() {
		return sslCipher;
	}

	/**
	 * 描述:设置-The name of the cipher in use for the SSL connection.
	 * @param sslCipher  the value for slave_master_info.Ssl_cipher
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSslCipher(String sslCipher) {
		this.sslCipher = sslCipher == null ? null : sslCipher.trim();
	}

	/**
	 * 描述:获取-The name of the SSL key file.
	 * @return  the value of slave_master_info.Ssl_key
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getSslKey() {
		return sslKey;
	}

	/**
	 * 描述:设置-The name of the SSL key file.
	 * @param sslKey  the value for slave_master_info.Ssl_key
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSslKey(String sslKey) {
		this.sslKey = sslKey == null ? null : sslKey.trim();
	}

	/**
	 * 描述:获取-Displays which interface is employed when connecting to the MySQL server
	 * @return  the value of slave_master_info.Bind
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getBind() {
		return bind;
	}

	/**
	 * 描述:设置-Displays which interface is employed when connecting to the MySQL server
	 * @param bind  the value for slave_master_info.Bind
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setBind(String bind) {
		this.bind = bind == null ? null : bind.trim();
	}

	/**
	 * 描述:获取-The number of server IDs to be ignored, followed by the actual server IDs
	 * @return  the value of slave_master_info.Ignored_server_ids
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getIgnoredServerIds() {
		return ignoredServerIds;
	}

	/**
	 * 描述:设置-The number of server IDs to be ignored, followed by the actual server IDs
	 * @param ignoredServerIds  the value for slave_master_info.Ignored_server_ids
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setIgnoredServerIds(String ignoredServerIds) {
		this.ignoredServerIds = ignoredServerIds == null ? null : ignoredServerIds.trim();
	}

	/**
	 * 描述:获取-The master server uuid.
	 * @return  the value of slave_master_info.Uuid
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * 描述:设置-The master server uuid.
	 * @param uuid  the value for slave_master_info.Uuid
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid == null ? null : uuid.trim();
	}

	/**
	 * 描述:获取-The file used for the Certificate Revocation List (CRL)
	 * @return  the value of slave_master_info.Ssl_crl
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getSslCrl() {
		return sslCrl;
	}

	/**
	 * 描述:设置-The file used for the Certificate Revocation List (CRL)
	 * @param sslCrl  the value for slave_master_info.Ssl_crl
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSslCrl(String sslCrl) {
		this.sslCrl = sslCrl == null ? null : sslCrl.trim();
	}

	/**
	 * 描述:获取-The path used for Certificate Revocation List (CRL) files
	 * @return  the value of slave_master_info.Ssl_crlpath
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getSslCrlpath() {
		return sslCrlpath;
	}

	/**
	 * 描述:设置-The path used for Certificate Revocation List (CRL) files
	 * @param sslCrlpath  the value for slave_master_info.Ssl_crlpath
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSslCrlpath(String sslCrlpath) {
		this.sslCrlpath = sslCrlpath == null ? null : sslCrlpath.trim();
	}

	/**
	 * 描述:获取-Tls version
	 * @return  the value of slave_master_info.Tls_version
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getTlsVersion() {
		return tlsVersion;
	}

	/**
	 * 描述:设置-Tls version
	 * @param tlsVersion  the value for slave_master_info.Tls_version
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setTlsVersion(String tlsVersion) {
		this.tlsVersion = tlsVersion == null ? null : tlsVersion.trim();
	}
}