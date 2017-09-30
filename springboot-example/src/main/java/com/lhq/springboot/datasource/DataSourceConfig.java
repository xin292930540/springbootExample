package com.lhq.springboot.datasource;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DataSourceConfig {

	@Bean(name = "writeDataSource")
	@ConfigurationProperties(prefix = "write.datasource")
	public DataSource writeDataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		return dataSource;
	}

	// @Bean(name = "readOneDataSource")
	// @ConfigurationProperties(prefix = "readone.datasource")
	// public DataSource readOneDataSource() {
	// DruidDataSource dataSource = new DruidDataSource();
	// return dataSource;
	// }
	//
	// @Bean(name = "readTwoDataSource")
	// @ConfigurationProperties(prefix = "readtwo.datasource")
	// public DataSource readTwoDataSource() {
	// DruidDataSource dataSource = new DruidDataSource();
	// return dataSource;
	// }
	//
	// @Bean(name = "readDataSources")
	// public List<DataSource> readDataSources() {
	// List<DataSource> dataSources = new ArrayList<DataSource>();
	// dataSources.add(readOneDataSource());
	// dataSources.add(readTwoDataSource());
	// return dataSources;
	// }

}
