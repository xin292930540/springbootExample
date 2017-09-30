package com.lhq.springboot.datasource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.github.pagehelper.PageHelper;

@Configuration
@ConditionalOnClass({ EnableTransactionManagement.class, EntityManager.class })
@AutoConfigureAfter({ DataSourceConfig.class })
@MapperScan(basePackages = { "com.lhq.springboot.base.mapper" })
public class MyBatisConfig implements TransactionManagementConfigurer {
	private static Log logger = LogFactory.getLog(MyBatisConfig.class);

	@Resource(name = "writeDataSource")
	private DataSource writeDataSource;

	// @Resource(name = "readDataSources")
	// private List<Object> readDataSources;
	// @Value("${mybatis.mapperLocations}")
	// private List<String> mapperLocations;
	@Value("${mybatis.mapperLocations}")
	private String mapperLocation;

	@Bean
	@ConditionalOnMissingBean
	@ConfigurationProperties(prefix = "mybatis")
	public SqlSessionFactory sqlSessionFactory() {
		try {
			SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
			sessionFactory.setDataSource(writeDataSource);
			sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(mapperLocation));
			// 添加分页插件
			PageHelper pageHelper = new PageHelper();
			Properties properties = new Properties();
			properties.setProperty("reasonable", "true");
			properties.setProperty("supportMethodsArguments", "true");
			properties.setProperty("returnPageInfo", "check");
			properties.setProperty("params", "count=countSql");
			pageHelper.setProperties(properties);
			sessionFactory.setPlugins(new Interceptor[] { pageHelper });
			return sessionFactory.getObject();
		} catch (Exception e) {
			logger.warn("Could not confiure mybatis session factory");
			return null;
		}
	}

	// public org.springframework.core.io.Resource[] getResources() {
	// List<org.springframework.core.io.Resource> resources = new
	// ArrayList<org.springframework.core.io.Resource>();
	// for (String mapperLocation : mapperLocations) {
	// org.springframework.core.io.Resource resource = new
	// PathMatchingResourcePatternResolver()
	// .getResource(mapperLocation);
	// resources.add(resource);
	// }
	// return (org.springframework.core.io.Resource[]) resources.toArray();
	//
	// }

	/**
	 * 事务管理
	 */
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return new DataSourceTransactionManager(writeDataSource);
	}

	/**
	 * druid监控
	 * 
	 * @return
	 */
	@Bean
	@ConfigurationProperties(prefix = "druid")
	public ServletRegistrationBean druidServlet() {
		ServletRegistrationBean reg = new ServletRegistrationBean();
		reg.setServlet(new StatViewServlet());
		reg.addUrlMappings("/druid/*");
		reg.addInitParameter("allow", "127.0.0.1");
		reg.addInitParameter("deny", "");
		reg.addInitParameter("loginUsername", "niuli");
		reg.addInitParameter("loginPassword", "123456");
		return reg;
	}

	/**
	 * 用于实际查询的sql工具,传统dao开发形式可以使用这个,基于mapper代理则不需要注入
	 * 
	 * @param sqlSessionFactory
	 * @return
	 */

	@Bean(name = "sqlSessionTemplate")
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

	/**
	 * druid监控过滤
	 * 
	 * @return
	 */
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new WebStatFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		return filterRegistrationBean;
	}

}
