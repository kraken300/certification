package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Car;

public class DeleteCar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Car c1 = em.find(Car.class, 2);

		et.begin();
		if (c1 != null) {
			em.remove(c1);
			System.out.println("Car deleted successfully!");
		} else {
			System.out.println("Car not found!");
		}
		et.commit();
	}
}
