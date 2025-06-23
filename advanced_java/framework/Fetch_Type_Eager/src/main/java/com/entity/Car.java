package com.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {

	@Id
	private int cid;
	private String name;
	private double price;

	// By default FetchType is Eager
	@OneToOne(fetch = FetchType.LAZY)
	private Engine engine;

	public Car() {
		super();
	}

	public Car(int cid, String name, double price, Engine engine) {
		super();
		this.cid = cid;
		this.name = name;
		this.price = price;
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", name=" + name + ", price=" + price + "]";
	}
}
