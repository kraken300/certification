package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Bank;

public class DeleteBank {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Bank b1 = em.find(Bank.class, 2);

		et.begin();
		if (b1 != null) {
			em.remove(b1);
			System.out.println("Deleted successfully!");
		} else {
			System.out.println("Bank not found!");
		}
		et.commit();
	}
}
