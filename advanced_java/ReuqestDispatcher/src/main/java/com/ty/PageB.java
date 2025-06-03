package com.ty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/page-b")
public class PageB extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("PageB triggered");
		int id = (Integer) req.getAttribute("pId");
		String name = (String) req.getAttribute("pName");
		Bank bank = (Bank) req.getAttribute("bank");

		PrintWriter pw = resp.getWriter();

		pw.print("<body><html>");
		pw.print("<h1>Hi! This is PageB</h1>");
		pw.print("<h1>========Person Details========</h1>");
		pw.print("<h2>ID : " + id + "</h2>");
		pw.print("<h2>Name : " + name + "</h2>");
		
		pw.print("<h1>========Bank Details========</h1>");
		pw.print("<h2>Bank Name : " + bank.getName() + "</h2>");
		pw.print("<h2>Bank Branch : " + bank.getBranch() + "</h2>");
		pw.print("<h2>Bank IFSC Code : " + bank.getIfsc() + "</h2>");
		pw.print("</html></body>");
	}
}
