package com.lhq.boot.wx.config;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.apache.commons.dbcp.BasicDataSource;

@Configuration
public class JdbcConfig {
	@Resource(name = "dataSource")
	DataSource dataSource;

	@Bean(name = "jdbcTemplate")
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}

	@Bean(name = "dataSource")
	@ConfigurationProperties(prefix = "jdbc.dataSource")
	public DataSource getDataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		return basicDataSource;
	}

	@Bean(name = "dataSourceTransactionManager")
	public DataSourceTransactionManager getDataSourceTransactionManager() {
		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
		dataSourceTransactionManager.setDataSource(dataSource);
		return dataSourceTransactionManager;
	}
}
