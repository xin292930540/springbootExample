package com.lhq.springboot.base.enpty;

public class EngineCostKey {

	/**
	 * 字段描述: 字段:engine_cost.cost_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String costName;
	/**
	 * 字段描述: 字段:engine_cost.engine_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String engineName;
	/**
	 * 字段描述: 字段:engine_cost.device_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer deviceType;

	/**
	 * 描述:获取-
	 * @return  the value of engine_cost.cost_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getCostName() {
		return costName;
	}

	/**
	 * 描述:设置-
	 * @param costName  the value for engine_cost.cost_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setCostName(String costName) {
		this.costName = costName == null ? null : costName.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of engine_cost.engine_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getEngineName() {
		return engineName;
	}

	/**
	 * 描述:设置-
	 * @param engineName  the value for engine_cost.engine_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setEngineName(String engineName) {
		this.engineName = engineName == null ? null : engineName.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of engine_cost.device_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getDeviceType() {
		return deviceType;
	}

	/**
	 * 描述:设置-
	 * @param deviceType  the value for engine_cost.device_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
	}
}