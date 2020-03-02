package com.nana.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(basePackages = "com.nana.dao")
public class PersistanceConfig {
	

}
