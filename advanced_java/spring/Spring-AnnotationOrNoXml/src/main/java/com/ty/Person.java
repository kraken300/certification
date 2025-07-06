package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

//	@Value(value = "John")
	private String name;

//	@Value(value = "30")
	private int age;

	public Person(@Value(value = "Allen") String name, @Value(value = "36") int age) {
		super();
		this.name = name;
		this.age = age;
	}

//	@Value(value = "Steve")
	public void setName(String name) {
		this.name = name;
	}

//	@Value(value = "32")
	public void setAge(int age) {
		this.age = age;
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
