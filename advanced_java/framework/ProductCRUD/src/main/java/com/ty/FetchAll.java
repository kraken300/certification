package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

//		ArrayList<Product> prods = new ArrayList<Product>();
//		int i = 1;
//		Product p1 = em.find(Product.class, i);
//		prods.add(p1);
//		System.out.println(p1);
//		while (p1 != null) {
//			i++;
//			p1 = em.find(Product.class, i);
//			prods.add(p1);
////			System.out.println(p1 != null ? p1 : "");
//		}

		String hql = "SELECT p from Product p";
		Query query = em.createQuery(hql);

		List<Product> products = query.getResultList();

		for (Product prod : products) {
			System.out.println(prod);
		}

	}
}
