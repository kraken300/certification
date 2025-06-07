package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo?user=postgres&password=root";

		try {
			Class.forName(driver);

			Connection connection = DriverManager.getConnection(url);

			Statement smt = connection.createStatement();

			String update = "UPDATE student SET address = 'Mumbai' WHERE sid = 3";

			System.out.println(smt.execute(update)); // false

			connection.close();

			System.out.println("Data updated and connection closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
