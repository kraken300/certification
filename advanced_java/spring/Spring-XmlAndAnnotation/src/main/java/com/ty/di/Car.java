package com.ty.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Constructor injection using @Value annotation
@Component
public class Car {
	private String brand;
	private double price;

	public Car(@Value(value = "Tata") String brand, @Value(value = "100000") double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public void display() {
		System.out.println("CAR DETAILS");
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
	}

}
