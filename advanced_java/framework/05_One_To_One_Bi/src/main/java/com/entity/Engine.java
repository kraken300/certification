package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine {
	@Id
	private int eid;
	private double cc;

	@OneToOne(mappedBy = "engine")
	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Engine() {
		super();

	}

	public Engine(int eid, double cc) {
		super();
		this.eid = eid;
		this.cc = cc;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public double getCc() {
		return cc;
	}

	public void setCc(double cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Engine [eid=" + eid + ", cc=" + cc + "]";
	}

}
