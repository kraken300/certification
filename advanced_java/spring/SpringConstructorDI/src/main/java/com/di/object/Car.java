package com.di.object;

public class Car {

	private String brand;

	private Engine engine;

	public Car(String brand, Engine engine) {
		super();
		this.brand = brand;
		this.engine = engine;
	}

	public String getBrand() {
		return brand;
	}

//	public void setBrand(String brand) {
//		this.brand = brand;
//	}

	public Engine getEngine() {
		return engine;
	}

//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}

}
