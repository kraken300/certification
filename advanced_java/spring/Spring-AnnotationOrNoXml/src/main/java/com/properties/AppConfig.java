package com.properties;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.properties")
@PropertySource(value = "classpath:db.properties")
public class AppConfig {

}
