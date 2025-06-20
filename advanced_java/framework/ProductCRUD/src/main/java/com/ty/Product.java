package com.ty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int pid;
	private String name;
	private int price;
	private String description;
	private int units;

	public Product() {
		super();
	}

	public Product(int pid, String name, int price, String description, int units) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.description = description;
		this.units = units;
	}

	@Override
	public String toString() {
		return "Insert [pid=" + pid + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", units=" + units + "]";
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}
}
