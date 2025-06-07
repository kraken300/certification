package closeConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TryFinally {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo";
		String user = "postgres";
		String password = "root";

		Connection connection = null;
		try {
			// Step 1 : Load the driver
			Class.forName(driver);
			System.out.println("Driver loaded");

			// Step 2 : Create the connection
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection created");

			// Step 3 : Create the statement
			String insert = "INSERT INTO student VALUES(?, ?, ?, ?)";
			PreparedStatement pstm = connection.prepareStatement(insert);
			System.out.println("Statment created");

			// Step 4 : Execute the query
			pstm.setInt(1, 10);
			pstm.setString(2, "Raj");
			pstm.setString(3, "Thane");
			pstm.setLong(4, 123456);

			System.out.println(pstm.executeUpdate()); // 1

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					// Step 5 : Close the connection
					connection.close();
					System.out.println("Connection closed");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
