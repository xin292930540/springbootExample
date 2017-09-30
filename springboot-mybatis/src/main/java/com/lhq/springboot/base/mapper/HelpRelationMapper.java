package com.lhq.springboot.base.mapper;

import com.lhq.springboot.base.enpty.HelpRelationExample;
import com.lhq.springboot.base.enpty.HelpRelationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpRelationMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table help_relation
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	long countByExample(HelpRelationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table help_relation
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByExample(HelpRelationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table help_relation
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByPrimaryKey(HelpRelationKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table help_relation
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insert(HelpRelationKey record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table help_relation
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insertSelective(HelpRelationKey record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table help_relation
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */List<HelpRelationKey> selectByExample(HelpRelationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table help_relation
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExampleSelective(@Param("record") HelpRelationKey record,@Param("example") HelpRelationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table help_relation
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExample(@Param("record") HelpRelationKey record,@Param("example") HelpRelationExample example);
}