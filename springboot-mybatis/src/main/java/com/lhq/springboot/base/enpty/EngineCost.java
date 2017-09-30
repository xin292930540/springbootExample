package com.lhq.springboot.base.enpty;

import java.util.Date;

public class EngineCost extends EngineCostKey {

	/**
	 * 字段描述: 字段:engine_cost.cost_value
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Float costValue;
	/**
	 * 字段描述: 字段:engine_cost.last_update
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date lastUpdate;
	/**
	 * 字段描述: 字段:engine_cost.comment
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String comment;

	/**
	 * 描述:获取-
	 * @return  the value of engine_cost.cost_value
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Float getCostValue() {
		return costValue;
	}

	/**
	 * 描述:设置-
	 * @param costValue  the value for engine_cost.cost_value
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setCostValue(Float costValue) {
		this.costValue = costValue;
	}

	/**
	 * 描述:获取-
	 * @return  the value of engine_cost.last_update
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * 描述:设置-
	 * @param lastUpdate  the value for engine_cost.last_update
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * 描述:获取-
	 * @return  the value of engine_cost.comment
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 描述:设置-
	 * @param comment  the value for engine_cost.comment
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}
}