package com.annotations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

		User user1 = new User("Alice", "alice@gmail.com", 1234567890l);
		User user2 = new User("Bob", "bob@gmail.com", 8794561235l);
		em.persist(user1);
		
		em.persist(user2);

		et.commit();
	}
}
