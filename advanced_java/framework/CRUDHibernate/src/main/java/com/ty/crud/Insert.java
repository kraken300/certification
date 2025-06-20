package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

//		Employee e1 = new Employee(102, "mike", "mike@gmail.com", "87654321");
		Employee e1 = new Employee(104, "allen", "allen@gmail.com", "2468");

		System.out.println(e1);

		em.persist(e1);

		et.commit();
	}
}
