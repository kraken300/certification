package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-a")
public class PageA extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PageA triggered");

//		PrintWriter pw = resp.getWriter();
//		pw.print("<body><html>");
//		pw.print("<h1>Hi! This is PageA</h1>");
//		pw.print("</html></body>");

//		resp.sendRedirect("https://www.google.com");

		int personId = 101;
		String personName = "John";

		Bank b1 = new Bank();
		b1.setName("SBI");
		b1.setBranch("Thane");
		b1.setIfsc("SBIN001122");

		req.setAttribute("pId", personId);
		req.setAttribute("pName", personName);
		req.setAttribute("bank", b1);

		RequestDispatcher rd = req.getRequestDispatcher("test.jsp"); // page-b
		rd.forward(req, resp);
//		rd.include(req, resp);
	}
}
