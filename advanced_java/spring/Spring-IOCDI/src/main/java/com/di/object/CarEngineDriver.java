package com.di.object;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarEngineDriver {
	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config3.xml");

		Car car = (Car) app.getBean("myCar");

		System.out.println("Car brand : " + car.getBrand());
		System.out.println("Car engine : " + car.getEngine());
		
//		Engine engine = (Engine) app.getBean("myEngine");
		Engine engine = car.getEngine();

		System.out.println("Engine cc : " + engine.getCc());
		System.out.println("Engine type : " + engine.getType());
		
		app.close();
	}
}
