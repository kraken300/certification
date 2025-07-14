package com.datajpa;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.datajpa.service.StudentService;

@SpringBootApplication
public class StudentAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(StudentAppApplication.class, args);

		Scanner sc = new Scanner(System.in);

		StudentService service = app.getBean(StudentService.class);

		while (true) {
			System.out.println("====================================");
			System.out.println("|            StudentApp            |");
			System.out.println("====================================");
			System.out.println("Enter 1 to add : ");
			System.out.println("Enter 2 to update : ");
			System.out.println("Enter 3 to delete : ");
			System.out.println("Enter 4 to fetch by id : ");
			System.out.println("Enter 5 to fetch all students : ");
			System.out.println("Enter 6 for pagination : ");
			System.out.println("Enter 7 for sorting : ");
			System.out.println("Enter 8 for filtering : ");
			System.out.println("Enter 9 to search student by phone : ");
			System.out.println("Enter 10 to search student by phone and name : ");
			System.out.println("Enter 11 to search student by phone(custom method) : ");
			System.out.println("Enter 12 to search student by name(custom method) : ");
			System.out.println("Enter 13 to search student by id(custom method) : ");
			System.out.println("Enter 14 to search student by name and phone(custom method) : ");
			System.out.println("Enter 15 to exit : ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				service.saveStudent();
				break;
			}

			case 2: {
				service.updateStudent();
				break;
			}

			case 3: {
				service.deleteStudent();
				break;
			}

			case 4: {
				service.fetchStudentById();
				break;
			}

			case 5: {
				service.fetchAllStudents();
				break;
			}

			case 6: {
				service.pagination();
				break;
			}

			case 7: {
				service.sortStudents();
				break;
			}

			case 8: {
				service.filterStudents();
				break;
			}

			case 9: {
				service.getStudByPhone();
			}

			case 10: {
				service.getStudByPhoneAndName();
			}
			
			case 11:{
				service.findStudentByPhone();
				break;
			}
			
			case 12:{
				service.findStudentByName();
				break;
			}
			
			case 13:{
				service.findStudentById();
				break;
			}

			case 14:{
				service.findStudentByNameAndPhone();
				break;
			}
			
			case 15: {
				System.out.println("Thank you!");
				return;
			}
			}
		}
	}
}
