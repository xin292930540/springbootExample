package com.lhq.springboot.base.enpty;

public class HelpCategory {

	/**
	 * 字段描述: 字段:help_category.help_category_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Short helpCategoryId;
	/**
	 * 字段描述: 字段:help_category.name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String name;
	/**
	 * 字段描述: 字段:help_category.parent_category_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Short parentCategoryId;
	/**
	 * 字段描述: 字段:help_category.url
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String url;

	/**
	 * 描述:获取-
	 * @return  the value of help_category.help_category_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Short getHelpCategoryId() {
		return helpCategoryId;
	}

	/**
	 * 描述:设置-
	 * @param helpCategoryId  the value for help_category.help_category_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setHelpCategoryId(Short helpCategoryId) {
		this.helpCategoryId = helpCategoryId;
	}

	/**
	 * 描述:获取-
	 * @return  the value of help_category.name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * 描述:设置-
	 * @param name  the value for help_category.name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of help_category.parent_category_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Short getParentCategoryId() {
		return parentCategoryId;
	}

	/**
	 * 描述:设置-
	 * @param parentCategoryId  the value for help_category.parent_category_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setParentCategoryId(Short parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

	/**
	 * 描述:获取-
	 * @return  the value of help_category.url
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 描述:设置-
	 * @param url  the value for help_category.url
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}
}