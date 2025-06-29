package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Product p1 = em.find(Product.class, 1);
		
		et.begin();
		if (p1 != null) {
			p1.setUnits(20);
			Product updatedProduct = em.merge(p1);
			System.out.println(updatedProduct);
			System.out.println("Product updated!");
		} else {
			System.out.println("Product not found!");
		}
		et.commit();
	}
}
