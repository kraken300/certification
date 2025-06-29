package com.di.list;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config4.xml");

		Student student = (Student) app.getBean("myStudent");

		System.out.println("Name : " + student.getStudentName());
		System.out.println("ID : " + student.getStudentId());
		System.out.println("Subjects : " + student.getSubjects());
		
		app.close();
	}
}
