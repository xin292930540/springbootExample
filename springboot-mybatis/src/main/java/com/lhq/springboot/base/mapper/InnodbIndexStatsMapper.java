package com.lhq.springboot.base.mapper;

import com.lhq.springboot.base.enpty.InnodbIndexStats;
import com.lhq.springboot.base.enpty.InnodbIndexStatsExample;
import com.lhq.springboot.base.enpty.InnodbIndexStatsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InnodbIndexStatsMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table innodb_index_stats
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	long countByExample(InnodbIndexStatsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table innodb_index_stats
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByExample(InnodbIndexStatsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table innodb_index_stats
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int deleteByPrimaryKey(InnodbIndexStatsKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table innodb_index_stats
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insert(InnodbIndexStats record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table innodb_index_stats
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int insertSelective(InnodbIndexStats record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table innodb_index_stats
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */List<InnodbIndexStats> selectByExample(InnodbIndexStatsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table innodb_index_stats
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	InnodbIndexStats selectByPrimaryKey(InnodbIndexStatsKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table innodb_index_stats
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExampleSelective(@Param("record") InnodbIndexStats record,@Param("example") InnodbIndexStatsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table innodb_index_stats
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */int updateByExample(@Param("record") InnodbIndexStats record,@Param("example") InnodbIndexStatsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table innodb_index_stats
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKeySelective(InnodbIndexStats record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table innodb_index_stats
	 * @mbg.generated  Sat Sep 23 23:18:55 CST 2017
	 */
	int updateByPrimaryKey(InnodbIndexStats record);
}