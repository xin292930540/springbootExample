package com.lhq.springboot.base.mapper;

import com.lhq.springboot.base.enpty.TimeZoneTransitionType;
import com.lhq.springboot.base.enpty.TimeZoneTransitionTypeExample;
import com.lhq.springboot.base.enpty.TimeZoneTransitionTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneTransitionTypeMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table time_zone_transition_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	long countByExample(TimeZoneTransitionTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table time_zone_transition_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByExample(TimeZoneTransitionTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table time_zone_transition_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByPrimaryKey(TimeZoneTransitionTypeKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table time_zone_transition_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insert(TimeZoneTransitionType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table time_zone_transition_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insertSelective(TimeZoneTransitionType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table time_zone_transition_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */List<TimeZoneTransitionType> selectByExample(TimeZoneTransitionTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table time_zone_transition_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	TimeZoneTransitionType selectByPrimaryKey(TimeZoneTransitionTypeKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table time_zone_transition_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExampleSelective(@Param("record") TimeZoneTransitionType record,@Param("example") TimeZoneTransitionTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table time_zone_transition_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExample(@Param("record") TimeZoneTransitionType record,@Param("example") TimeZoneTransitionTypeExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table time_zone_transition_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKeySelective(TimeZoneTransitionType record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table time_zone_transition_type
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKey(TimeZoneTransitionType record);
}