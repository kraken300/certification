package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

//		Product p1 = new Product(1, "laptop", 30000, "Best laptop to buy", 10);
//		Product p1 = new Product(2, "phone", 20000, "Best phone to buy", 10);
//		Product p1 = new Product(3, "camera", 10000, "Best camera to buy", 40);
		Product p1 = new Product(4, "tablet", 16000, "Best tablet to buy", 60);

		et.begin();
		em.persist(p1);
		et.commit();
	}
}
