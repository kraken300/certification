package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int eId;
	private String eName;
	private String email;
	private String phoneNumber;

	public Employee() {

	}

	public Employee(int eId, String eName, String email, String phoneNumber) {
		super();
		seteId(eId);
		seteName(eName);
		setEmail(email);
		setPhoneNumber(phoneNumber);
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}

}
