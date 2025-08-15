package com.ss.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

	@GetMapping("/register")
	public String register() {
		return "Register page!";
	}

	@GetMapping("/admin")
	public String admin() {
		return "Admin page";
	}

	@GetMapping("/user")
	public String user() {
		return "User page";
	}

}
