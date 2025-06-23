package com.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Student;
import com.entity.Subject;

public class FetchedBySubject {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Subject sub1 = em.find(Subject.class, 1);

		if (sub1 != null) {
			System.out.println("========Subject Details========");
			System.out.println(sub1);

			System.out.println("========Student Details========");
			List<Student> students = sub1.getStudents();
			for (Student student : students) {
				System.out.println(student);
			}

			System.out.println("Fetched successfully!");
		} else {
			System.out.println("Student not found!");
		}
	}
}
