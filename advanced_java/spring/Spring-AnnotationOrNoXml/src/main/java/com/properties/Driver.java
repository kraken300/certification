package com.properties;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ReadProperties prop = app.getBean(ReadProperties.class);
		System.out.println(prop.getUrl());
		System.out.println(prop.getUsername());
		System.out.println(prop.getPassword());
		System.out.println(prop.getSecretKey());
		
		app.close();
	}
}
