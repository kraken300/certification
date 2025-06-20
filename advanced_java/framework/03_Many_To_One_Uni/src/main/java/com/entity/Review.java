package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	private int id;
	private String msg;

	@ManyToOne
	private Product product;
	
	public Review() {
		
	}

	public Review(int id, String msg) {
		this.id = id;
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", msg=" + msg + "]";
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}