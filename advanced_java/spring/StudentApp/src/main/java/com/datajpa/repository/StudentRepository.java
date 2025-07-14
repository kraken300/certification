package com.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.datajpa.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	// Custom Queries
	// @Query("SELECT s FROM Student s WHERE s.phone=:stuPhone")
	// public List<Student> getStudentByPhone(Long stuPhone); // Naming based

	// @Query(value = "SELECT * FROM student_app", nativeQuery = true) //
	// nativeQuery : SQL
	@Query("SELECT s FROM Student s WHERE s.phone=?1")
	public List<Student> getStudentByPhone(Long phone); // Index based

	// @Query("SELECT s FROM Student s WHERE s.phone=:stuPhone AND s.name=:stuName")
	// public List<Student> getStudentByPhoneAndName(Long stuPhone, String stuName);
	// // Naming based

	@Query("SELECT s FROM Student s WHERE s.phone=?1 AND s.name=?2")
	public List<Student> getStudentByPhoneAndName(Long phone, String name); // Index based

	// Custom method : We need to follow method naming convention, method name
	// should start from findBy();
	
	List<Student> findByPhone(Long phone);
	
	List<Student> findByNameContaining(String name);
	
	List<Student> findByIdGreaterThanEqual(Integer id);
	
	List<Student> findByNameAndPhone(String name, Long phone);
}
