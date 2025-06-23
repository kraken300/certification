package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Student;
import com.entity.Subject;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student stud2 = em.find(Student.class, 102);
		Subject sub3 = em.find(Subject.class, 3);

		et.begin();
		if (stud2 != null) {
			stud2.setName("Steve");
			sub3.setDays(30);
			em.merge(stud2);
			em.merge(sub3);
			System.out.println("Updated successfully");
		} else {
			System.out.println("Student not found!");
		}
		et.commit();
	}
}
