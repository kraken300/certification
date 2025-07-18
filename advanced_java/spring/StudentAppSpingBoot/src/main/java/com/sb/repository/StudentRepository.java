package com.sb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	// custom method
	Optional<Student> findByEmail(String email);

}
