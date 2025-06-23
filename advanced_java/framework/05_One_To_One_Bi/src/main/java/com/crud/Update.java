package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Car;
import com.entity.Engine;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Car c1 = em.find(Car.class, 2);
		Engine e1 = em.find(Engine.class, 22);

		et.begin();

		if (c1 != null) {
//			Engine newEngine = new Engine(222, 420, "Petrol");
//			c1.setEngine(newEngine);
			c1.setBrand("Toyota");

//			e1.seteId(222);	
			e1.setCc(420);

			em.merge(c1);
			em.merge(e1);
//			em.merge(e1);
			System.out.println("Car updated successfully!");

		} else {
			System.out.println("Car does not exist!");
		}

		et.commit();
	}
}
