package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Bank;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Bank b1 = em.find(Bank.class, 1);

		et.begin();
		if (b1 != null) {
			b1.setName("KOTAK");
			em.merge(b1);
			
			System.out.println("Updated successfully!");
		} else {
			System.out.println("Bank not found!");
		}
		et.commit();
	}
}
