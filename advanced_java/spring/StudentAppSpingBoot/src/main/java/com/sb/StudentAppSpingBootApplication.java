package com.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@Profile(value = "dev")
public class StudentAppSpingBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppSpingBootApplication.class, args);
	}

}
