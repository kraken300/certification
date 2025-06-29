package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Product p1 = em.find(Product.class, 1);

		if (p1 != null) {
			System.out.println(p1);
			System.out.println("Product fetched!");
		} else {
			System.out.println("Product does not exist!");
		}
	}
}
