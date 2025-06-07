package com.ty;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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

		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/mock?user=postgres&password=root";

		System.out.println(name + " " + email + " " + password);

		Connection conn = null;
		try {
			Class.forName(driver);

			conn = DriverManager.getConnection(url);

			String insert = "INSERT INTO users VALUES(?,?,?)";

			PreparedStatement pstm = conn.prepareStatement(insert);
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setString(3, password);

			int i = pstm.executeUpdate();

			if (i > 0) {
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
			} else {
				RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
				req.setAttribute("message", "Could not register user");
				rd.forward(req, resp);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
			req.setAttribute("message", "User already exists!");
			rd.forward(req, resp);
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
