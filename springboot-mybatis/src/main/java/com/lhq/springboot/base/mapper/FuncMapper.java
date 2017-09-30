package com.lhq.springboot.base.mapper;

import com.lhq.springboot.base.enpty.Func;
import com.lhq.springboot.base.enpty.FuncExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FuncMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table func
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	long countByExample(FuncExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table func
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByExample(FuncExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table func
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByPrimaryKey(String name);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table func
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insert(Func record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table func
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insertSelective(Func record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table func
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */List<Func> selectByExample(FuncExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table func
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	Func selectByPrimaryKey(String name);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table func
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExampleSelective(@Param("record") Func record,@Param("example") FuncExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table func
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExample(@Param("record") Func record,@Param("example") FuncExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table func
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKeySelective(Func record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table func
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKey(Func record);
}