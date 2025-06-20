package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Student;

public class DeleteStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student stud2 = em.find(Student.class, 102);

		et.begin();
		if (stud2 != null) {
			em.remove(stud2);
			System.out.println("Student deleted successfully!");
		} else {
			System.out.println("Account not found!");
		}
		et.commit();
	}
}
