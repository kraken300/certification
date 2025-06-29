package com.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Student;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Student stud1 = em.find(Student.class, 101);

		if (stud1 != null) {
			System.out.println(stud1);
			System.out.println(stud1.getSubjects());
			System.out.println("Fetched successfully!");
		} else {
			System.out.println("Student not found!");
		}
	}
}
