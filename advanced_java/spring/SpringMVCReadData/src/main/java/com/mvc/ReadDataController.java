package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ReadDataController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getForm() {
		System.out.println("Got the request");
		return "form.html";
	}

//	Sending data from view to controller
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String getData(HttpServletRequest request) {

		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println("Username : " + username);
		System.out.println("Email : " + email);
		System.out.println("Password : " + password);

		System.out.println("Got the data from client");
		return "display1.jsp";
	}

	// Sending view from controller to client
	@GetMapping("/displaya")
	public String displayThroughModel(Model model) {

		model.addAttribute("userId", 1);
		model.addAttribute("username", "John");

		model.addAttribute("person", new Person(101, "Ben", 123456789L));

		return "display1.jsp";
	}

	// Sending model and view from controller to client

	@GetMapping("/displayb")
	public ModelAndView displayThroughModelView() {
		ModelAndView mv = new ModelAndView("display2.jsp");

		mv.setViewName("display2.jsp");
		mv.addObject("userId", 2);
		mv.addObject("username", "Kevin");

		mv.addObject("person", new Person(102, "Mike", 2468795256L));

		return mv;
	}

}
