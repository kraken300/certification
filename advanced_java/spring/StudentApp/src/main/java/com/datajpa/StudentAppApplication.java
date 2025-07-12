package com.datajpa;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StudentAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(StudentAppApplication.class, args);

		Scanner sc = new Scanner(System.in);

		StudentRepository repo = app.getBean(StudentRepository.class);

		while (true) {
			System.out.println("=============StudentApp=============");
			System.out.println("Enter 1 to add : ");
			System.out.println("Enter 2 to update : ");
			System.out.println("Enter 3 to delete : ");
			System.out.println("Enter 4 to fetch by id : ");
			System.out.println("Enter 5 to fetch all students : ");
			System.out.println("Enter 6 to exist : ");

			int choice = sc.nextInt();

			switch (choice) {
				case 1: {
					System.out.println("Enter name : ");
					String name = sc.next();

					System.out.println("Enter phone : ");
					Long phone = sc.nextLong();

					Student saved = repo.save(new Student(name, phone));
					System.out.println("Student saved with id : " + saved.getId());

					break;
				}

				case 2: {
					System.out.println("Enter id to update : ");
					int id = sc.nextInt();

					Optional<Student> opt = repo.findById(id);

					if (opt.isPresent()) {
						Student student = opt.get();

						System.out.println("Enter new name : ");
						String newName = sc.next();

						student.setName(newName);

						Student updatedStudent = repo.save(student);

						System.out.println("Student updated with id : " + updatedStudent.getId());
					} else {
						System.out.println("Student not found!");
					}
					break;
				}

				case 3: {
					System.out.println("Enter id to delete a student : ");
					int id = sc.nextInt();

					Optional<Student> opt = repo.findById(id);

					if (opt.isPresent()) {
						repo.delete(opt.get());
						System.out.println("Student deleted successfully!");
					} else {
						System.out.println("Student not found!");
					}
					break;
				}

				case 4: {
					System.out.println("Enter id to find a student : ");
					int id = sc.nextInt();

					Optional<Student> opt = repo.findById(id);
					if (opt.isPresent()) {
						Student student = opt.get();
						System.out.println("=========================");
						System.out.println("Id : " + student.getId());
						System.out.println("Name : " + student.getName());
						System.out.println("Phone : " + student.getPhone());
						System.out.println("=========================");
					} else {
						System.out.println("Student not found!");
					}
					break;
				}

				case 5: {
					Iterable<Student> students = repo.findAll();

					if (students != null) {
						for (Student s : students) {
							System.out.println(s);
						}
					} else {
						System.out.println("No student found!");
					}
					break;
				}

				case 6: {
					System.out.println("Thank you!");
					return;
				}
			}
		}
	}

}
