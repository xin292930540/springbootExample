package com.lhq.springboot.base.enpty;

public class SlaveWorkerInfoWithBLOBs extends SlaveWorkerInfo {

	/**
	 * 字段描述: 字段:slave_worker_info.Relay_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String relayLogName;
	/**
	 * 字段描述: 字段:slave_worker_info.Master_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String masterLogName;
	/**
	 * 字段描述: 字段:slave_worker_info.Checkpoint_relay_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String checkpointRelayLogName;
	/**
	 * 字段描述: 字段:slave_worker_info.Checkpoint_master_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private String checkpointMasterLogName;
	/**
	 * 字段描述: 字段:slave_worker_info.Checkpoint_group_bitmap
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	private byte[] checkpointGroupBitmap;

	/**
	 * 描述:获取-
	 * @return  the value of slave_worker_info.Relay_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getRelayLogName() {
		return relayLogName;
	}

	/**
	 * 描述:设置-
	 * @param relayLogName  the value for slave_worker_info.Relay_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setRelayLogName(String relayLogName) {
		this.relayLogName = relayLogName == null ? null : relayLogName.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of slave_worker_info.Master_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getMasterLogName() {
		return masterLogName;
	}

	/**
	 * 描述:设置-
	 * @param masterLogName  the value for slave_worker_info.Master_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setMasterLogName(String masterLogName) {
		this.masterLogName = masterLogName == null ? null : masterLogName.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of slave_worker_info.Checkpoint_relay_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getCheckpointRelayLogName() {
		return checkpointRelayLogName;
	}

	/**
	 * 描述:设置-
	 * @param checkpointRelayLogName  the value for slave_worker_info.Checkpoint_relay_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setCheckpointRelayLogName(String checkpointRelayLogName) {
		this.checkpointRelayLogName = checkpointRelayLogName == null ? null : checkpointRelayLogName.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of slave_worker_info.Checkpoint_master_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public String getCheckpointMasterLogName() {
		return checkpointMasterLogName;
	}

	/**
	 * 描述:设置-
	 * @param checkpointMasterLogName  the value for slave_worker_info.Checkpoint_master_log_name
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setCheckpointMasterLogName(String checkpointMasterLogName) {
		this.checkpointMasterLogName = checkpointMasterLogName == null ? null : checkpointMasterLogName.trim();
	}

	/**
	 * 描述:获取-
	 * @return  the value of slave_worker_info.Checkpoint_group_bitmap
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public byte[] getCheckpointGroupBitmap() {
		return checkpointGroupBitmap;
	}

	/**
	 * 描述:设置-
	 * @param checkpointGroupBitmap  the value for slave_worker_info.Checkpoint_group_bitmap
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	public void setCheckpointGroupBitmap(byte[] checkpointGroupBitmap) {
		this.checkpointGroupBitmap = checkpointGroupBitmap;
	}
}