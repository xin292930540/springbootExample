package com.lhq.springboot.base.enpty;

public class TimeZoneTransitionType extends TimeZoneTransitionTypeKey {

	/**
	 * 字段描述: 字段:time_zone_transition_type.Offset
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer offset;
	/**
	 * 字段描述: 字段:time_zone_transition_type.Is_DST
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Byte isDst;
	/**
	 * 字段描述: 字段:time_zone_transition_type.Abbreviation
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String abbreviation;

	/**
	 * 描述:获取-
	 * @return  the value of time_zone_transition_type.Offset
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getOffset() {
		return offset;
	}

	/**
	 * 描述:设置-
	 * @param offset  the value for time_zone_transition_type.Offset
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	/**
	 * 描述:获取-
	 * @return  the value of time_zone_transition_type.Is_DST
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Byte getIsDst() {
		return isDst;
	}

	/**
	 * 描述:设置-
	 * @param isDst  the value for time_zone_transition_type.Is_DST
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setIsDst(Byte isDst) {
		this.isDst = isDst;
	}

	/**
	 * 描述:获取-
	 * @return  the value of time_zone_transition_type.Abbreviation
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * 描述:设置-
	 * @param abbreviation  the value for time_zone_transition_type.Abbreviation
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation == null ? null : abbreviation.trim();
	}
}