package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {

	@GetMapping("/form")
	public String getUserData() {
		System.out.println("Form displayed");
		return "userform.html";
	}

	@PostMapping("/displayuser")
	public ModelAndView displayUser(HttpServletRequest request) {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println("Got the data from client");

		System.out.println("Username : " + username);
		System.out.println("Email : " + email);
		System.out.println("Password : " + password);

		ModelAndView mv = new ModelAndView("user.jsp");
		mv.addObject("username",username);
		mv.addObject("email", email);
		mv.addObject("password", password);
		return mv;
	}
}
