package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Employee;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

		Employee e1 = new Employee(102, "mike", "mike@gmail.com", "1234");

		if (em.find(Employee.class, e1.geteId()) != null) {
			em.merge(e1);
			System.out.println("Employee with id : " + e1.geteId() + " updated!");
		} else {
			System.out.println("Employee with id : " + e1.geteId() + " does not exist");
		}

		et.commit();

	}
}
