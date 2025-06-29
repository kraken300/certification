package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Car;
import com.entity.Engine;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
//		Engine e1 = new Engine(11, 220, "DIESEL");
//		Car c1 = new Car(1, "TATA", 100000, e1);

//		Engine e2 = new Engine(22, 320, "PETROL");
//		Car c2 = new Car(2, "Mahindra", 1000000, e2);
		
		Engine e3 = new Engine(33, 420, "DIESEL");
		Car c3 = new Car(3, "Toyota", 200000, e3);

		em.persist(c3);
//		em.persist(e3);

		et.commit();

		System.out.println("Data inserted successfully!");
	}
}