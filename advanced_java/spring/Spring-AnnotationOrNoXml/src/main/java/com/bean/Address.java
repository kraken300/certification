package com.bean;

public class Address {
	private String country;

	private String state;

	private String city;

	private Double pinCode;

	public Address(String country, String state, String city, Double pinCode) {
		super();
		this.country = country;
		this.state = state;
		this.city = city;
		this.pinCode = pinCode;
	}

	public void display() {
		System.out.println("Country : " + country);
		System.out.println("State : " + state);
		System.out.println("City : " + city);
		System.out.println("PinCode : " + pinCode);
	}
}
