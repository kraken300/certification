package com.beanscope;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);

		Person person1 = app.getBean(Person.class);
		person1.display();
		System.out.println(person1);

		Person person2 = app.getBean(Person.class);
		System.out.println(person2);

		Person person3 = app.getBean(Person.class);
		System.out.println(person3);

		app.close();
	}
}
