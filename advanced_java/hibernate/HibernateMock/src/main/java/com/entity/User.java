package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "user_info")
@Entity
public class User {

	@Id
	private Integer uid;
	private String name;
	private Long phone;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Address> addresses;

	public User() {
		super();
	}

	public User(Integer uid, String name, Long phone) {
		super();
		this.uid = uid;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", phone=" + phone + ", ]";
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}
