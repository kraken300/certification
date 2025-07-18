package com.sb.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
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

import com.sb.dto.StudentDTO;
import com.sb.dto.StudentResponseDTO;
import com.sb.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@GetMapping("/get")
	public ResponseEntity<?> getStudent(@RequestParam(name = "sid") Long id) {
		return studentService.getById(id);
	}

	@GetMapping("/getAll")
	public List<StudentResponseDTO> getAllStudents(@RequestParam Integer pageNumber) {
		return studentService.findAll(pageNumber);
	}

	@PostMapping("/save")
	public ResponseEntity<String> postStudent(@RequestBody @Valid StudentDTO studentDTO) {
		return studentService.saveStudent(studentDTO);
	}

	@PutMapping("/update/{sid}/{name}")
	public String updateName(@PathVariable(name = "sid") Long id, @PathVariable String name) {
		return studentService.updateName(id, name);
	}

	@DeleteMapping("/delete")
	public String deleteStudent(@RequestParam Long sid) {
		return studentService.deleteStudent(sid);
	}

	@GetMapping("/head")
	public String getSecretKey(@RequestHeader String secretKey) {
		System.out.println(secretKey);
		return "Read the data from the headers";
	}
}
