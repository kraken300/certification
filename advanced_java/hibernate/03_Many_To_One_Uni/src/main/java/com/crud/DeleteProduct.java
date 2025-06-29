package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Product;

public class DeleteProduct {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Product p1 = em.find(Product.class, 2222);

		et.begin();
		if (p1 != null) {
			em.remove(p1);
			System.out.println("Deleted successfully!");
		} else {
			System.out.println("Product not found!");
		}
		et.commit();

	}

}
