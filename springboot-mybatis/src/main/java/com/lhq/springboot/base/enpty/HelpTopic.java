package com.lhq.springboot.base.enpty;

public class HelpTopic {

	/**
	 * 字段描述: 字段:help_topic.help_topic_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer helpTopicId;
	/**
	 * 字段描述: 字段:help_topic.name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String name;
	/**
	 * 字段描述: 字段:help_topic.help_category_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Short helpCategoryId;

	/**
	 * 描述:获取-
	 * @return  the value of help_topic.help_topic_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getHelpTopicId() {
		return helpTopicId;
	}

	/**
	 * 描述:设置-
	 * @param helpTopicId  the value for help_topic.help_topic_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setHelpTopicId(Integer helpTopicId) {
		this.helpTopicId = helpTopicId;
	}

	/**
	 * 描述:获取-
	 * @return  the value of help_topic.name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getName() {
		return name;
	}

	/**
	 * 描述:设置-
	 * @param name  the value for help_topic.name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of help_topic.help_category_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Short getHelpCategoryId() {
		return helpCategoryId;
	}

	/**
	 * 描述:设置-
	 * @param helpCategoryId  the value for help_topic.help_category_id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setHelpCategoryId(Short helpCategoryId) {
		this.helpCategoryId = helpCategoryId;
	}
}