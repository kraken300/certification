package com.crud;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.entity.Student;
import com.entity.Subject;

public class FetchByStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();

		Student stud1 = em.find(Student.class, 101);

		if (stud1 != null) {
			System.out.println("========Student Details========");
			System.out.println(stud1);

			System.out.println("========Subject Details========");
			List<Subject> subjects = stud1.getSubjects();
			for (Subject subject : subjects) {
				System.out.println(subject);
			}
			System.out.println("Fetched successfully!");
		} else {
			System.out.println("Student not found!");
		}
	}
}
