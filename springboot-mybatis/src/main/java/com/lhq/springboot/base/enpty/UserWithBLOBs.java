package com.lhq.springboot.base.enpty;

public class UserWithBLOBs extends User {

	/**
	 * 字段描述: 字段:user.ssl_cipher
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private byte[] sslCipher;
	/**
	 * 字段描述: 字段:user.x509_issuer
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private byte[] x509Issuer;
	/**
	 * 字段描述: 字段:user.x509_subject
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private byte[] x509Subject;
	/**
	 * 字段描述: 字段:user.authentication_string
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String authenticationString;

	/**
	 * 描述:获取-
	 * @return  the value of user.ssl_cipher
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public byte[] getSslCipher() {
		return sslCipher;
	}

	/**
	 * 描述:设置-
	 * @param sslCipher  the value for user.ssl_cipher
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setSslCipher(byte[] sslCipher) {
		this.sslCipher = sslCipher;
	}

	/**
	 * 描述:获取-
	 * @return  the value of user.x509_issuer
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public byte[] getX509Issuer() {
		return x509Issuer;
	}

	/**
	 * 描述:设置-
	 * @param x509Issuer  the value for user.x509_issuer
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setX509Issuer(byte[] x509Issuer) {
		this.x509Issuer = x509Issuer;
	}

	/**
	 * 描述:获取-
	 * @return  the value of user.x509_subject
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public byte[] getX509Subject() {
		return x509Subject;
	}

	/**
	 * 描述:设置-
	 * @param x509Subject  the value for user.x509_subject
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setX509Subject(byte[] x509Subject) {
		this.x509Subject = x509Subject;
	}

	/**
	 * 描述:获取-
	 * @return  the value of user.authentication_string
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getAuthenticationString() {
		return authenticationString;
	}

	/**
	 * 描述:设置-
	 * @param authenticationString  the value for user.authentication_string
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setAuthenticationString(String authenticationString) {
		this.authenticationString = authenticationString == null ? null : authenticationString.trim();
	}
}