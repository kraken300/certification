package com.user;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		System.out.println("Email : " + email);
		System.out.println("Password : " + password);

		Connection conn = ConnectionPool.giveConnection();

		String select = "SELECT * FROM users WHERE email = ?";

		try {
			PreparedStatement pstm = conn.prepareStatement(select);
			pstm.setString(1, email);

			ResultSet rs = pstm.executeQuery();

			ConnectionPool.submitConnection(conn);

			if (rs.next()) {
				String dbPwd = rs.getString(3);

				if (dbPwd.equals(password)) {
					// Redirect to home page
					RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
					rd.forward(req, resp);
				} else {
					// Redirect to login and show incorrect password error
					RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
					req.setAttribute("msg", "Incorrect password!");
					rd.forward(req, resp);
				}
			} else {
				// Redirect to register page if user is not registered
				RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
				req.setAttribute("msg", "User is not registered!");
				rd.forward(req, resp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			req.setAttribute("msg", "Something went wrong!");
			rd.forward(req, resp);
		}
	}
}
