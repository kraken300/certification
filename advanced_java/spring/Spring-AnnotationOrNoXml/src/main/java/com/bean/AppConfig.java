package com.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.bean")
public class AppConfig {

	@Bean
	public Address getAddress() {
		Address address = new Address("India", "Maharashtra", "Thane", 400061D);
		return address;
	}

	@Bean
	public List<String> getSubjects() {
		List<String> subjects = new ArrayList<String>();
		subjects.add("Java");
		subjects.add("Python");
		subjects.add("SQL");
		subjects.add("Javascript");
		return subjects;
	}

	@Bean
	public Map<String, Integer> getMarks() {
		Map<String, Integer> marks = new HashMap<>();
		marks.put("Java", 80);
		marks.put("Python", 70);
		marks.put("SQL", 70);
		marks.put("Javascript", 80);

		return marks;
	}
}