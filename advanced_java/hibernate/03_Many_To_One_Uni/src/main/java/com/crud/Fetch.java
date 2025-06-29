package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Review;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Review r1 = em.find(Review.class, 1);

		if (r1 != null) {
			System.out.println("========Review========");
			System.out.println(r1);
			System.out.println("========Product Details========");
			System.out.println(r1.getProduct());
		} else {
			System.out.println("Review not found!");
		}
	}
}
