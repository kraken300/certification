package com.di.state;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchoolDriver {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config2.xml");
		
		School school = (School) app.getBean("mySchool");
		
		System.out.println("Name : "+school.getName());
		System.out.println("Address : "+school.getAddress());
		
		app.close();
	}
}
