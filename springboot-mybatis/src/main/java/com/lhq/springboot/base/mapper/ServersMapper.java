package com.lhq.springboot.base.mapper;

import com.lhq.springboot.base.enpty.Servers;
import com.lhq.springboot.base.enpty.ServersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServersMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servers
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	long countByExample(ServersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servers
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByExample(ServersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servers
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByPrimaryKey(String serverName);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servers
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insert(Servers record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servers
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insertSelective(Servers record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servers
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */List<Servers> selectByExample(ServersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servers
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	Servers selectByPrimaryKey(String serverName);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servers
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExampleSelective(@Param("record") Servers record,@Param("example") ServersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servers
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExample(@Param("record") Servers record,@Param("example") ServersExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servers
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKeySelective(Servers record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table servers
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKey(Servers record);
}