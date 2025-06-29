package com.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Account;
import com.entity.Bank;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Bank b1 = em.find(Bank.class, 1);

		if (b1 != null) {
			System.out.println("========BANK DETAILS========");
			System.out.println(b1);
			System.out.println("========ACCOUNT DETAILS========");
//			List<Account> accounts = b1.getAccounts();
//			for (Account account : accounts) {
//				System.out.println(account);
//			}
		} else {
			System.out.println("Bank not found!");
		}
	}
}
