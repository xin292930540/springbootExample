package com.lhq.springboot.base.mapper;

import com.lhq.springboot.base.enpty.ProxiesPriv;
import com.lhq.springboot.base.enpty.ProxiesPrivExample;
import com.lhq.springboot.base.enpty.ProxiesPrivKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProxiesPrivMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table proxies_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	long countByExample(ProxiesPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table proxies_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByExample(ProxiesPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table proxies_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByPrimaryKey(ProxiesPrivKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table proxies_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insert(ProxiesPriv record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table proxies_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insertSelective(ProxiesPriv record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table proxies_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */List<ProxiesPriv> selectByExample(ProxiesPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table proxies_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	ProxiesPriv selectByPrimaryKey(ProxiesPrivKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table proxies_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExampleSelective(@Param("record") ProxiesPriv record,@Param("example") ProxiesPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table proxies_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExample(@Param("record") ProxiesPriv record,@Param("example") ProxiesPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table proxies_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKeySelective(ProxiesPriv record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table proxies_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKey(ProxiesPriv record);
}