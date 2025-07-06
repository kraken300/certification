package com.ty.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Field or Variable injection using @Value annotation
@Component
public class Teacher {

	@Value(value = "John")
	private String name;

	@Value(value = "30")
	private int age;

	public void display() {
		System.out.println("TEACHER DETAILS");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
