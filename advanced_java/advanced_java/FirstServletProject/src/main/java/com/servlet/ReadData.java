package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/read")
public class ReadData extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Read data from request");

		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String address = req.getParameter("user_address");

		System.out.println(name + " " + email + " " + address);

		PrintWriter pw = res.getWriter();
		pw.print("<html><body>");

		pw.print("<h1>========User Details========</h1>");
		pw.print("<h2> Name : " + name + "</h2>");
		pw.print("<h2> Email : " + email + "</h2>");
		pw.print("<h2> Address : " + address + "</h2>");
		pw.print("</html></body>");
	}

}
