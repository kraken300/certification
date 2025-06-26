package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.entity.Employee;

import java.util.List;

public class ReadAll {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

		String jpql = "SELECT e FROM Employee e";

		TypedQuery<Employee> query = em.createQuery(jpql, Employee.class);

		List<Employee> employees = query.getResultList();

		for (Employee e : employees) {
			System.out.println(e);
		}

		et.commit();
	}
}
