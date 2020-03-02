package com.nana.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class AOPConfig {
	@Autowired
	private DataSource ds;
	@Bean(name = "DsTxMnmg",autowire = Autowire.BY_TYPE)
	public PlatformTransactionManager createDsTxMnmg() {

		return new DataSourceTransactionManager();
	}
//	@Bean(name = "DsTxMnmg")
//	public PlatformTransactionManager createDsTxMnmg(){
//		return  new DataSourceTransactionManager();
//	}

}
