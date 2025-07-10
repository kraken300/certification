package com.mvc;

public class Person {
	private int id;
	private String name;
	private Long phone;
	
	
	public Person() {
		
	}
	
	public Person(int id, String name, Long phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Long getPhone() {
		return this.phone;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(Long phone) {
		this.phone = phone;
	}
}
