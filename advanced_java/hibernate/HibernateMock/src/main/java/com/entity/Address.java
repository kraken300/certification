package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {

	@Id
	private Integer aid;
	private String country;
	private String state;
	private String city;
	private Long zipCode;

	@ManyToOne()
	@JoinColumn(name = "user_id")
	private User user;

	public Address() {
		super();
	}

	public Address(Integer aid, String country, String state, String city, Long zipCode) {
		super();
		this.aid = aid;
		this.country = country;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", country=" + country + ", state=" + state + ", city=" + city + ", zipCode="
				+ zipCode + "]";
	}

}
