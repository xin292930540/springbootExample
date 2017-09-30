package com.lhq.springboot.base.enpty;

public class TimeZoneName {

	/**
	 * 字段描述: 字段:time_zone_name.Name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String name;
	/**
	 * 字段描述: 字段:time_zone_name.Time_zone_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer timeZoneId;

	/**
	 * 描述:获取-
	 * @return  the value of time_zone_name.Name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * 描述:设置-
	 * @param name  the value for time_zone_name.Name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of time_zone_name.Time_zone_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getTimeZoneId() {
		return timeZoneId;
	}

	/**
	 * 描述:设置-
	 * @param timeZoneId  the value for time_zone_name.Time_zone_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setTimeZoneId(Integer timeZoneId) {
		this.timeZoneId = timeZoneId;
	}
}