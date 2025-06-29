package com.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class PersonId implements Serializable {
	private String email;
	private Long phone;

	public PersonId() {
		super();
	}

	public PersonId(String email, Long phone) {
		super();
		this.email = email;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "PersonId [email=" + email + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonId other = (PersonId) obj;
		return Objects.equals(email, other.email) && Objects.equals(phone, other.phone);
	}

}
