package com.crud;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Student;
import com.entity.Subject;

public class Insert2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student stud2 = new Student(102, "Bob", "12th");

		Subject sub1 = em.find(Subject.class, 1);
		Subject sub2 = em.find(Subject.class, 2);
		Subject sub4 = new Subject(4, "C++", 50);

		stud2.setSubjects(Arrays.asList(sub1, sub2, sub4));

		et.begin();

		em.persist(stud2);
		em.persist(sub4);

		et.commit();
	}
}
