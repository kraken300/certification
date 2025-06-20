package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Review;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Review r1 = em.find(Review.class, 2);
//		Product p1 = em.find(Product.class, 2222);

		et.begin();
		if (r1 != null) {
			r1.setMsg("Bad Phone!");

			em.merge(r1);

			System.out.println("Updated successfully!");
		} else {
			System.out.println("Review not found");
		}
		et.commit();
	}
}
