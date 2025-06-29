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

//		Car c1 = new Car(1, "TATA", 10000);
//		Engine e1 = new Engine(11, 120);
		
		Car c1 = new Car(2, "Suzuki", 100000);
		Engine e1 = new Engine(22, 220);

		et.begin();

		c1.setEngine(e1);
//		e1.setCar(c1);

		em.persist(c1);
		em.persist(e1);

		et.commit();
	}
}
