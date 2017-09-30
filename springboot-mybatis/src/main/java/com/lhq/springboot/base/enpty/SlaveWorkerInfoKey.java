package com.lhq.springboot.base.enpty;

public class SlaveWorkerInfoKey {

	/**
	 * 字段描述:The channel on which the slave is connected to a source. Used in Multisource Replication 字段:slave_worker_info.Channel_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String channelName;
	/**
	 * 字段描述: 字段:slave_worker_info.Id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private Integer id;

	/**
	 * 描述:获取-The channel on which the slave is connected to a source. Used in Multisource Replication
	 * @return  the value of slave_worker_info.Channel_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getChannelName() {
		return channelName;
	}

	/**
	 * 描述:设置-The channel on which the slave is connected to a source. Used in Multisource Replication
	 * @param channelName  the value for slave_worker_info.Channel_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setChannelName(String channelName) {
		this.channelName = channelName == null ? null : channelName.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of slave_worker_info.Id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * 描述:设置-
	 * @param id  the value for slave_worker_info.Id
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setId(Integer id) {
		this.id = id;
	}
}