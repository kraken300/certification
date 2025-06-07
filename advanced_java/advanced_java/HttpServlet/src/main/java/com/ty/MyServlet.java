package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")
public class MyServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Read data from servlet");

		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String address = req.getParameter("user_address");

		System.out.println("Name : " + name + ", Email : " + email + ", Address : " + address);

		PrintWriter pw = resp.getWriter();
		pw.print("<body><html>");
		pw.print("<h1>User details</h1>");
		pw.print("<h2>Name : " + name + "</h2>");
		pw.print("<h2>Email : " + email + "</h2>");
		pw.print("<h2>Address : " + address + "</h2>");
	}
}
