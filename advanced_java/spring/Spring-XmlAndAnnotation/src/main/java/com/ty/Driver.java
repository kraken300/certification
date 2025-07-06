package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");

		Person person = (Person) app.getBean("person");
		person.speak();

		MyApp myApp = (MyApp) app.getBean("myApp");
		myApp.login();

//		RCB rcb = (RCB) app.getBean("RCB");
		RCB rcb = (RCB) app.getBean("myRCB");
		rcb.play();

		app.close();
	}
}
