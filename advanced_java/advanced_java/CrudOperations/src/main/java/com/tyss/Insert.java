package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo";
//		String url = "jdbc:postgresql://localhost:5432/demo?user=postgres&password=root";
		String user = "postgres";
		String password = "root";

		try {
			// Step 1 : Load the driver
			Class.forName(driver);
			System.out.println("Driver loaded");

			// Step 2 : Create the connection
			Connection connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection created");

			// Step 3 : Create the statement
			Statement stm = connection.createStatement();
			System.out.println("Statment created");

			// Step 4 : Execute the query
//			String insert = "INSERT INTO student VALUES(2, 'Mike', 'Pune', 456789)"
			String insert = "INSERT INTO student (sid, name, address, phone) "
					+ "VALUES(3, 'Smith', 'Nagpur', 246842), (4, 'Jack', 'Thane', 654789)";
			stm.execute(insert);

			// Step 5 : Close the connection
			connection.close();

			System.out.println("Data inserted and connection closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
