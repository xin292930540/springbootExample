package com.lhq.springboot.base.enpty;

import java.util.Date;

public class ServerCost {

	/**
	 * 字段描述: 字段:server_cost.cost_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String costName;
	/**
	 * 字段描述: 字段:server_cost.cost_value
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Float costValue;
	/**
	 * 字段描述: 字段:server_cost.last_update
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Date lastUpdate;
	/**
	 * 字段描述: 字段:server_cost.comment
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String comment;

	/**
	 * 描述:获取-
	 * @return  the value of server_cost.cost_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getCostName() {
		return costName;
	}

	/**
	 * 描述:设置-
	 * @param costName  the value for server_cost.cost_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setCostName(String costName) {
		this.costName = costName == null ? null : costName.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of server_cost.cost_value
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Float getCostValue() {
		return costValue;
	}

	/**
	 * 描述:设置-
	 * @param costValue  the value for server_cost.cost_value
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setCostValue(Float costValue) {
		this.costValue = costValue;
	}

	/**
	 * 描述:获取-
	 * @return  the value of server_cost.last_update
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * 描述:设置-
	 * @param lastUpdate  the value for server_cost.last_update
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	/**
	 * 描述:获取-
	 * @return  the value of server_cost.comment
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * 描述:设置-
	 * @param comment  the value for server_cost.comment
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}
}