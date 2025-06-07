package com.ty;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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

		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/mock?user=postgres&password=root";

		System.out.println(email + " " + password);

		Connection conn = null;
		try {
			Class.forName(driver);

			conn = DriverManager.getConnection(url);

			String select = "SELECT * FROM users WHERE email = ?";

			PreparedStatement pstm = conn.prepareStatement(select);
			pstm.setString(1, email);

			ResultSet rs = pstm.executeQuery();

			if (rs.next()) {
				String storedPwd = rs.getString(3);
				System.out.println(rs.getString(3));
				if (storedPwd.equals(password)) {
					RequestDispatcher rd = req.getRequestDispatcher("home.jsp");
					rd.forward(req, resp);
				}

				else {
					RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
					req.setAttribute("message", "Wrong password!");
					rd.forward(req, resp);
				}
			} else {
				RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
				req.setAttribute("message", "User does not exist!");
				rd.forward(req, resp);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
			req.setAttribute("message", "Something went wrong!!");
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
