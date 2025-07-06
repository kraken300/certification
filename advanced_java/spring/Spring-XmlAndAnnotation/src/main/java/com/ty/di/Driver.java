package com.ty.di;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");

		Teacher teacher = app.getBean(Teacher.class);
		teacher.display();

		Student student = app.getBean(Student.class);
		student.display();

		Car car = app.getBean(Car.class);
		car.display();

		app.close();
	}
}
