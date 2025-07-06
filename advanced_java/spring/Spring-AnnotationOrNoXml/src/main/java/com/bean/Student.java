package com.bean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value(value = "Mark")
	private String name;

	@Autowired
	private List<String> subjects;

	@Autowired
	private Address address;

	@Autowired
	private Map<String, Integer> map;

	public void display() {
		System.out.println("Name : " + name);

		System.out.println("==============Address==============");
		address.display();

		System.out.println("Subjects : " + subjects);

		System.out.println("Marks : " + map);

	}
}
