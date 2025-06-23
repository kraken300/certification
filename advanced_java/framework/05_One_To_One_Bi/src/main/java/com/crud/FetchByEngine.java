package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Engine;

public class FetchByEngine {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Engine e1 = em.find(Engine.class, 11);

		if (e1 != null) {
			System.out.println(e1);

			System.out.println(e1.getCar());
		} else {
			System.out.println("Engine not found!");
		}

	}
}
