package com.lhq.springboot.base.mapper;

import com.lhq.springboot.base.enpty.GeneralLog;
import com.lhq.springboot.base.enpty.GeneralLogExample;
import com.lhq.springboot.base.enpty.GeneralLogWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GeneralLogMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table general_log
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	long countByExample(GeneralLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table general_log
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByExample(GeneralLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table general_log
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insert(GeneralLogWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table general_log
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insertSelective(GeneralLogWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table general_log
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */List<GeneralLogWithBLOBs> selectByExampleWithBLOBs(GeneralLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table general_log
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */List<GeneralLog> selectByExample(GeneralLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table general_log
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExampleSelective(@Param("record") GeneralLogWithBLOBs record,@Param("example") GeneralLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table general_log
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExampleWithBLOBs(@Param("record") GeneralLogWithBLOBs record,@Param("example") GeneralLogExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table general_log
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExample(@Param("record") GeneralLog record,@Param("example") GeneralLogExample example);
}