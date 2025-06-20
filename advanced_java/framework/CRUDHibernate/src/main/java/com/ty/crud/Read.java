package com.ty.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Read {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

		Employee e1 = em.find(Employee.class, 101);

		if (e1 != null) {
			System.out.println(e1);
		} else {
			System.out.println("Employee does not exist!");
		}

		et.commit();
	}
}
