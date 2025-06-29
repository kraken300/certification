package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Product;
import com.entity.Review;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Product p1 = new Product(1111, "LAPTOP", 40000);
		Review r1 = new Review(1, "Good Laptop!");
		Review r2 = new Review(2, "Best buy!");

//		Product p1 = new Product(2222, "PHONE", 20000);
//		Review r1 = new Review(2, "Good Phone!");

		r1.setProduct(p1);
		r2.setProduct(p1);
//		p1.setReviews(Arrays.asList(r1, r2)); 

		et.begin();
		em.persist(p1);
		em.persist(r1);
		em.persist(r2);
		et.commit();
	}
}
