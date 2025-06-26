package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Person;
import com.entity.PersonId;

public class SavePerson {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Person person = new Person();
		person.setName("John");
		person.setAge(30);

		PersonId personId = new PersonId();
		personId.setEmail("johnabc@gmail.com");
		personId.setPhone(1234567822L);

		person.setPersonId(personId);

		et.begin();
		em.persist(person);
		et.commit();

		System.out.println("Person saved successfully!");
	}
}
