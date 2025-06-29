package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Car;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Car c1 = em.find(Car.class, 3);

		if (c1 != null) {
			System.out.println(c1);
			System.out.println(c1.getEngine());
		} else {
			System.out.println("Car does not exist!");
		}
	}
}
