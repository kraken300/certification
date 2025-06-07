package com.tyss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo?user=postgres&password=root";

		try {
			Class.forName(driver);

			Connection connection = DriverManager.getConnection(url);

			Statement smt = connection.createStatement();

			String fetch = "SELECT * FROM student";

//			System.out.println(smt.execute(fetch)); // true

			ResultSet rs = smt.executeQuery(fetch);
			
			System.out.println("=======Student Details======");

			while (rs.next()) {
				int sid = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				long phone = rs.getLong(4);

				System.out.println("sid : " + sid + ", name : " + name + ", address : " + address + ", phone : " + phone);
			}
			
			connection.close();

			System.out.println("Data fetched and connection closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
