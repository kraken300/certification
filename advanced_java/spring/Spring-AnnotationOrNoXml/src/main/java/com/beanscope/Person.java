package com.beanscope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service
//@Repository
@Component
@Scope(value = "prototype")
public class Person {

	@Value(value = "John")
	private String name;

	@Value(value = "30")
	private int age;

	public Person() {

	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
