package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MsgController {

	@RequestMapping("/msg")
//	@ResponseBody
	public String getMessage() {
		System.out.println("API is triggered!");
		return "message.html";
	}

	@RequestMapping("/test")
	public String getTest() {
		System.out.println("Test API is triggered");
		return "test.jsp";
	}

}
