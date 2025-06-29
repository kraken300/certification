package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Employee;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

//		Employee e1 = new Employee(102, "mike", "mike@gmail.com", "1234");

//		Employee e1 = em.find(Employee.class, 102);
//		
//		System.out.println(e1);
//
//		if (e1 != null) {
//			em.remove(e1);
//			System.out.println("Employee with id : " + e1.geteId() + " deleted!");
//		} else {
//			System.out.println("Employee does not exist");
//		}

		Employee emp = new Employee();
		emp.seteId(104);

		et.begin();
		em.remove(em.merge(emp));
		et.commit();

		System.out.println("Employee deleted!");

	}
}
