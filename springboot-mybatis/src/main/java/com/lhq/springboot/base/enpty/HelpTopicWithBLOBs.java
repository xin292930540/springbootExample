package com.lhq.springboot.base.enpty;

public class HelpTopicWithBLOBs extends HelpTopic {

	/**
	 * 字段描述: 字段:help_topic.description
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String description;
	/**
	 * 字段描述: 字段:help_topic.example
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String example;
	/**
	 * 字段描述: 字段:help_topic.url
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String url;

	/**
	 * 描述:获取-
	 * @return  the value of help_topic.description
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 描述:设置-
	 * @param description  the value for help_topic.description
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of help_topic.example
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getExample() {
		return example;
	}

	/**
	 * 描述:设置-
	 * @param example  the value for help_topic.example
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setExample(String example) {
		this.example = example == null ? null : example.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of help_topic.url
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * 描述:设置-
	 * @param url  the value for help_topic.url
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}
}