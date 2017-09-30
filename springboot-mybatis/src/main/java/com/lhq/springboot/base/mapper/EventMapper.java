package com.lhq.springboot.base.mapper;

import com.lhq.springboot.base.enpty.Event;
import com.lhq.springboot.base.enpty.EventExample;
import com.lhq.springboot.base.enpty.EventKey;
import com.lhq.springboot.base.enpty.EventWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table event
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	long countByExample(EventExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table event
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByExample(EventExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table event
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByPrimaryKey(EventKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table event
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insert(EventWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table event
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insertSelective(EventWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table event
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */List<EventWithBLOBs> selectByExampleWithBLOBs(EventExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table event
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */List<Event> selectByExample(EventExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table event
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	EventWithBLOBs selectByPrimaryKey(EventKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table event
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExampleSelective(@Param("record") EventWithBLOBs record,@Param("example") EventExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table event
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExampleWithBLOBs(@Param("record") EventWithBLOBs record,@Param("example") EventExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table event
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExample(@Param("record") Event record,@Param("example") EventExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table event
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKeySelective(EventWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table event
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKeyWithBLOBs(EventWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table event
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKey(Event record);
}