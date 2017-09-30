package com.lhq.springboot.base.mapper;

import com.lhq.springboot.base.enpty.ProcsPriv;
import com.lhq.springboot.base.enpty.ProcsPrivExample;
import com.lhq.springboot.base.enpty.ProcsPrivKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcsPrivMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table procs_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	long countByExample(ProcsPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table procs_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByExample(ProcsPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table procs_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByPrimaryKey(ProcsPrivKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table procs_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insert(ProcsPriv record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table procs_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insertSelective(ProcsPriv record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table procs_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */List<ProcsPriv> selectByExample(ProcsPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table procs_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	ProcsPriv selectByPrimaryKey(ProcsPrivKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table procs_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExampleSelective(@Param("record") ProcsPriv record,@Param("example") ProcsPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table procs_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExample(@Param("record") ProcsPriv record,@Param("example") ProcsPrivExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table procs_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKeySelective(ProcsPriv record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table procs_priv
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKey(ProcsPriv record);
}