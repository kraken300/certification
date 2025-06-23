package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Subject;

public class DeleteSubject {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Subject sub4 = em.find(Subject.class, 4);

		et.begin();
		if (sub4 != null) {
			em.remove(sub4);
			System.out.println("Subject deleted successfully!");
		} else {
			System.out.println("Subject not found!");
		}
		et.commit();
	}
}
