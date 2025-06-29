package com.crud;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Student;
import com.entity.Subject;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student stud1 = new Student(101, "Alice", "10th");
		Student stud2 = new Student(102, "Bob", "12th");

		Subject sub1 = new Subject(1, "Java", 60);
		Subject sub2 = new Subject(2, "Javascript", 30);
		Subject sub3 = new Subject(3, "Python", 40);

		stud1.setSubjects(Arrays.asList(sub1, sub2, sub3));
		stud2.setSubjects(Arrays.asList(sub1, sub2, sub3));

//		sub1.setStudents(Arrays.asList(stud1, stud2));
//		sub2.setStudents(Arrays.asList(stud1, stud2));
//		sub3.setStudents(Arrays.asList(stud1, stud2));

		et.begin();

		em.persist(stud1);
		em.persist(stud2);
		em.persist(sub1);
		em.persist(sub2);
		em.persist(sub3);

		et.commit();
	}
}
