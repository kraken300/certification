package com.containers;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver2 {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml"); // J2EE container

		Person person = (Person) app.getBean("myPerson");
		person.speak();

		Student student = (Student) app.getBean("myStudent");
		student.study();
		
		app.close(); // Close the application context to release resources
	}
}
