package com.lhq.springboot.base.enpty;

public class ProcWithBLOBs extends Proc {

	/**
	 * 字段描述: 字段:proc.param_list
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private byte[] paramList;
	/**
	 * 字段描述: 字段:proc.returns
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private byte[] returns;
	/**
	 * 字段描述: 字段:proc.body
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private byte[] body;
	/**
	 * 字段描述: 字段:proc.comment
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String comment;
	/**
	 * 字段描述: 字段:proc.body_utf8
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private byte[] bodyUtf8;

	/**
	 * 描述:获取-
	 * @return  the value of proc.param_list
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public byte[] getParamList() {
		return paramList;
	}

	/**
	 * 描述:设置-
	 * @param paramList  the value for proc.param_list
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setParamList(byte[] paramList) {
		this.paramList = paramList;
	}

	/**
	 * 描述:获取-
	 * @return  the value of proc.returns
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public byte[] getReturns() {
		return returns;
	}

	/**
	 * 描述:设置-
	 * @param returns  the value for proc.returns
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setReturns(byte[] returns) {
		this.returns = returns;
	}

	/**
	 * 描述:获取-
	 * @return  the value of proc.body
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public byte[] getBody() {
		return body;
	}

	/**
	 * 描述:设置-
	 * @param body  the value for proc.body
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setBody(byte[] body) {
		this.body = body;
	}

	/**
	 * 描述:获取-
	 * @return  the value of proc.comment
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 描述:设置-
	 * @param comment  the value for proc.comment
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of proc.body_utf8
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public byte[] getBodyUtf8() {
		return bodyUtf8;
	}

	/**
	 * 描述:设置-
	 * @param bodyUtf8  the value for proc.body_utf8
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setBodyUtf8(byte[] bodyUtf8) {
		this.bodyUtf8 = bodyUtf8;
	}
}