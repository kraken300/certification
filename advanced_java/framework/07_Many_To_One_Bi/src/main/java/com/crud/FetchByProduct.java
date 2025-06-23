package com.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Product;
import com.entity.Review;

public class FetchByProduct {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Product p1 = em.find(Product.class, 1111);

		if (p1 != null) {
			System.out.println("========Product Details========");
			System.out.println(p1);
			System.out.println("========Reviews========");
			List<Review> reviews = p1.getReviews();
			for (Review review : reviews) {
				System.out.println(review);
			}
		} else {
			System.out.println("Review not found!");
		}
	}
}
