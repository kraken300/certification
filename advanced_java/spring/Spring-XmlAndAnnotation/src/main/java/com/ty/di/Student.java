package com.ty.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Setter injection using @Value annotation
@Component
public class Student {

	private String name;

	private int age;

	@Value(value = "Steve")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "18")
	public void setAge(int age) {
		this.age = age;
	}

	public void display() {
		System.out.println("STUDENT DETAILS");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
