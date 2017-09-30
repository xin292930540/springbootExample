package com.lhq.springboot.base.enpty;

public class EventWithBLOBs extends Event {

	/**
	 * 字段描述: 字段:event.body
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private byte[] body;
	/**
	 * 字段描述: 字段:event.body_utf8
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private byte[] bodyUtf8;

	/**
	 * 描述:获取-
	 * @return  the value of event.body
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public byte[] getBody() {
		return body;
	}

	/**
	 * 描述:设置-
	 * @param body  the value for event.body
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setBody(byte[] body) {
		this.body = body;
	}

	/**
	 * 描述:获取-
	 * @return  the value of event.body_utf8
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public byte[] getBodyUtf8() {
		return bodyUtf8;
	}

	/**
	 * 描述:设置-
	 * @param bodyUtf8  the value for event.body_utf8
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setBodyUtf8(byte[] bodyUtf8) {
		this.bodyUtf8 = bodyUtf8;
	}
}