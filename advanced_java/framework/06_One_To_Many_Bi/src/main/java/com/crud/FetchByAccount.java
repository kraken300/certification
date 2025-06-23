package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Account;

public class FetchByAccount {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Account a1 = em.find(Account.class, 1111l);

		if (a1 != null) {
			System.out.println("========ACCOUNT DETAILS========");
			System.out.println(a1);
			System.out.println("========BANK DETAILS========");
			System.out.println(a1.getBank());
		} else {
			System.out.println("Bank not found!");
		}
	}
}
