package com.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Person {

	@EmbeddedId
	private PersonId personId;

	private String name;
	private Integer age;

	public Person() {
		super();
	}

	public Person(PersonId personId, String name, Integer age) {
		super();
		this.personId = personId;
		this.name = name;
		this.age = age;
	}

	public PersonId getPersonId() {
		return personId;
	}

	public void setPersonId(PersonId personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", age=" + age + "]";
	}

}
