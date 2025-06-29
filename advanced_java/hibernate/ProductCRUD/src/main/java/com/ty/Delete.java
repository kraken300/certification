package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Product p1 = em.find(Product.class, 4);
		
		et.begin();
		
		if(p1 != null) {
			em.remove(p1);
			System.out.println("Product deleted!");
		}
		else {
			System.out.println("Product does not exist!");
		}
		et.commit();
	}
	
}
