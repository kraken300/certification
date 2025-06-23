package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {

	@Id
	private int eId;
	private int cc;
	private String type;

	public Engine() {
		super();
	}

	public Engine(int eId, int cc, String type) {
		super();
		this.eId = eId;
		this.cc = cc;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [eId=" + eId + ", cc=" + cc + ", type=" + type + "]";
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
