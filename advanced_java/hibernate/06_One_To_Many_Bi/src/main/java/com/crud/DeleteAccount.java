package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Account;

public class DeleteAccount {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Account a1 = em.find(Account.class, 3333l);

		et.begin();
		if (a1 != null) {
			em.remove(a1);
			System.out.println("Deleted successfully!");
		} else {
			System.out.println("Bank not found!");
		}
		et.commit();
	}
}
