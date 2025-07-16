package com.sb.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sb.util.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	static Set<Student> students = new HashSet<>();

	static {
		students.add(new Student(101, "John", "john@gmail.com"));
		students.add(new Student(102, "Alice", "alice@gmail.com"));
		students.add(new Student(103, "Bob", "bob@gmail.com"));
		students.add(new Student(104, "David", "david@gmail.com"));
	}

	@GetMapping("/get")
	public Student getStudent(@RequestParam Integer sid) {
		for (Student student : students) {
			if (student.getSid() == sid) {
				System.out.println("student fetched with sid : " + sid);
				return student;
			}
		}

		return null;
	}

	@GetMapping("/getAll")
	public Set<Student> getAllStudents() {
		return students;
	}

	@PostMapping("/post")
	public String postStudent(@RequestBody Student student) {
		students.add(student);
		System.out.println(student);
		return "Student saved with sid : " + student.getSid();
	}

	@PutMapping("/update/{sid}/{name}/{email}")
	public String updateStudent(@PathVariable(name = "sid") Integer id, @PathVariable String name,
			@PathVariable String email) {
		for (Student student : students) {
			if (student.getSid() == id) {
				student.setName(name);
				student.setEmail(email);
				System.out.println(student);
				return "Student with sid : " + id + " name changed to " + name;
			}
		}

		return "Student not found!";
	}

	@DeleteMapping("/delete")
	public String deleteStudent(@RequestParam Integer sid) {
		for (Student student : students) {
			if (student.getSid() == sid) {
				students.remove(student);
				System.out.println("Student deleted");
				return "Student with sid : " + sid + " deleted successfully!";
			}
		}
		return "Student not found!";
	}

	@GetMapping("/head")
	public String getSecretKey(@RequestHeader String secretKey) {
		System.out.println(secretKey);
		return "Read the data from the headers";
	}
}
