package com.ty.FirstMVCProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstMvcProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(FirstMvcProjectApplication.class, args);
		
		app.close();
	}

}
