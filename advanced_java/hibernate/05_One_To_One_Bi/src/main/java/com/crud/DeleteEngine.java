package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Engine;

public class DeleteEngine {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Engine e1 = em.find(Engine.class, 22);

		et.begin();
		if (e1 != null) {
			em.remove(e1);
			System.out.println("Engine deleted successfully!");
		} else {
			System.out.println("Engine not found!");
		}
		et.commit();
	}
}
