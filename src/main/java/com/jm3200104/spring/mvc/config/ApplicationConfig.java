package com.jm3200104.spring.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.jm3200104.spring.mvc")
@Import({ SpringMvcConfig.class, SpringHibernateConfig.class, SpringAopConfig.class })
public class ApplicationConfig {

}
