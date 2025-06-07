package com.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("Password : " + password);

		Connection conn = ConnectionPool.giveConnection();

		String insert = "INSERT INTO users VALUES(?,?,?)";

		try {
			PreparedStatement pstm = conn.prepareStatement(insert);

			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setString(3, password);

			int executeUpdate = pstm.executeUpdate();

			if (executeUpdate > 0) {
				// Logic to display success message
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				req.setAttribute("msg", "User registered successfully!");
				rd.forward(req, resp);
			} else {
				// Error message
				RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
				req.setAttribute("msg", "Failed to register!");
				rd.forward(req, resp);
			}

			ConnectionPool.submitConnection(conn);
		} catch (SQLException e) {
			// Error message
			e.printStackTrace();
			RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
			req.setAttribute("msg", "User is already registered!");
			rd.forward(req, resp);
		}
	}
}
