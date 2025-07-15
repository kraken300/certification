package com.sb.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;


// @Controller Returns file

@RestController
public class MsgController {
	
	@GetMapping("/get")
	public String getMethod() {
		System.out.println("get method triggered");
		return "Data fetched!";
	}

	@PostMapping("/post")
	public String postMethod() {
		System.out.println("post method triggered");
		return "Data saved!";
	}

	@PutMapping("/put")
	public String putMethod() {
		System.out.println("put method triggered");
		return "Data updated!";
	}

	@DeleteMapping("/delete")
	public String deleteMethod() {
		System.out.println("delete method triggered");
		return "Data deleted!";
	}
}
