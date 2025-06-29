package com.crud;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Account;
import com.entity.Bank;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

//		Bank b1 = new Bank(1, "SBI");
		Bank b1 = new Bank(2, "HDFC");

		Account a1 = new Account(3333, "David", 8000);
//		Account a2 = new Account(4444, "James", 10000);

//		ArrayList<Account> accounts = new ArrayList<Account>();
//		accounts.add(a1);
//		accounts.add(a2);
//
//		b1.setAccounts(accounts);
		b1.setAccounts(Arrays.asList(a1));

		et.begin();
		em.persist(b1);
		em.persist(a1);
//		em.persist(a2);
		et.commit();
	}
}
