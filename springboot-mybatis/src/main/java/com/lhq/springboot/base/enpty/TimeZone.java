package com.lhq.springboot.base.enpty;

public class TimeZone {

	/**
	 * 字段描述: 字段:time_zone.Time_zone_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer timeZoneId;
	/**
	 * 字段描述: 字段:time_zone.Use_leap_seconds
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String useLeapSeconds;

	/**
	 * 描述:获取-
	 * @return  the value of time_zone.Time_zone_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getTimeZoneId() {
		return timeZoneId;
	}

	/**
	 * 描述:设置-
	 * @param timeZoneId  the value for time_zone.Time_zone_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setTimeZoneId(Integer timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	/**
	 * 描述:获取-
	 * @return  the value of time_zone.Use_leap_seconds
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getUseLeapSeconds() {
		return useLeapSeconds;
	}

	/**
	 * 描述:设置-
	 * @param useLeapSeconds  the value for time_zone.Use_leap_seconds
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setUseLeapSeconds(String useLeapSeconds) {
		this.useLeapSeconds = useLeapSeconds == null ? null : useLeapSeconds.trim();
	}
}