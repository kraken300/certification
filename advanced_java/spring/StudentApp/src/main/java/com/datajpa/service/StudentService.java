package com.datajpa.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.datajpa.entity.Student;
import com.datajpa.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;

	@Autowired
	private Scanner sc;

	public void saveStudent() {
		System.out.println("Enter name : ");
		String name = sc.next();

		System.out.println("Enter phone : ");
		Long phone = sc.nextLong();

		Student saved = repo.save(new Student(name, phone));
		System.out.println("Student saved with id : " + saved.getId());
	}

	public void updateStudent() {
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
	}

	public void deleteStudent() {
		System.out.println("Enter id to delete a student : ");
		int id = sc.nextInt();

		Optional<Student> opt = repo.findById(id);

		if (opt.isPresent()) {
			repo.delete(opt.get());
			System.out.println("Student deleted successfully!");
		} else {
			System.out.println("Student not found!");
		}
	}

	public void fetchStudentById() {
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
	}

	public void fetchAllStudents() {
		Iterable<Student> students = repo.findAll();

		List<Student> students2 = (List<Student>) students;

		printStudents(students2);
	}

	public void pagination() {
		System.out.println("Enter page number, starts from 1 : ");
		int pageNumber = sc.nextInt();

		System.out.println("Enter number of records to fetch : ");
		int pageSize = sc.nextInt();

		// By default start page number is 0
		PageRequest pageable = PageRequest.of(pageNumber - 1, pageSize);

		Page<Student> all = repo.findAll(pageable);

		List<Student> students = all.toList();

		printStudents(students);
	}

	public void sortStudents() {
		System.out.println("Enter a paramater for sorting");
		String param = sc.next();

		List<Student> students = repo.findAll(Sort.by(param).descending());

		printStudents(students);
	}

	public void filterStudents() {
		System.out.println("Filtering the records : ");

		Student st = new Student();
//		st.setPhone(1234L);
		st.setName("John Doe");

		// Query By Example:
		Example<Student> filter = Example.of(st);

		List<Student> students = repo.findAll(filter);

		printStudents(students);
	}

	public void getStudByPhone() {
		System.out.println("Enter phone : ");
		Long phone = sc.nextLong();

		List<Student> students = repo.getStudentByPhone(phone);
		printStudents(students);
	}

	public void getStudByPhoneAndName() {
		System.out.println("Enter phone : ");
		Long phone = sc.nextLong();

		System.out.println("Enter name : ");
		String name = sc.next();

		List<Student> students = repo.getStudentByPhoneAndName(phone, name);
		printStudents(students);
	}

	public void findStudentByPhone() {
		System.out.println("Enter phone : ");
		Long phone = sc.nextLong();

		List<Student> students = repo.findByPhone(phone);
		printStudents(students);
	}

	public void findStudentByName() {
		System.out.println("Enter name : ");
		String name = sc.next();

		List<Student> students = repo.findByNameContaining(name);
		printStudents(students);
	}

	public void findStudentById() {
		System.out.println("Enter id : ");
		Integer id = sc.nextInt();

		List<Student> students = repo.findByIdGreaterThanEqual(id);
		printStudents(students);
	}
	
	public void findStudentByNameAndPhone() {
		System.out.println("Enter name : ");
		String name = sc.next();

		System.out.println("Enter phone : ");
		Long phone = sc.nextLong();
		
		List<Student> students = repo.findByNameAndPhone(name, phone);
		printStudents(students);
	}

	public void printStudents(List<Student> students) {
		if (!students.isEmpty()) {
			System.out.println("============Students============");
			for (Student s : students) {
				System.out.println("=========================");
				System.out.println("sid : " + s.getId());
				System.out.println("name : " + s.getName());
				System.out.println("phone : " + s.getPhone());
				System.out.println("=========================");
			}
		} else {
			System.out.println("No student found!");
		}
	}
}
