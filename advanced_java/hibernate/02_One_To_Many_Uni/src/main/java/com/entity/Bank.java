package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	private int bid;
	private String name;

	@OneToMany
	private List<Account> accounts;

	public Bank() {
		super();
	}

	public Bank(int bid, String name) {
		super();
		this.bid = bid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bank [bid=" + bid + ", name=" + name + "]";
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
