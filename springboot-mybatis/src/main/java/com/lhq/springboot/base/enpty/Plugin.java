package com.lhq.springboot.base.enpty;

public class Plugin {

	/**
	 * 字段描述: 字段:plugin.name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String name;
	/**
	 * 字段描述: 字段:plugin.dl
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String dl;

	/**
	 * 描述:获取-
	 * @return  the value of plugin.name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * 描述:设置-
	 * @param name  the value for plugin.name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of plugin.dl
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getDl() {
		return dl;
	}

	/**
	 * 描述:设置-
	 * @param dl  the value for plugin.dl
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setDl(String dl) {
		this.dl = dl == null ? null : dl.trim();
	}
}