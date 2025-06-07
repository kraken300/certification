package statements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StoredProcedure {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo?user=postgres&password=root";

		try {
			// Step 1 : Load the driver
			Class.forName(driver);

			// Step 2 : Create the connection
			Connection connection = DriverManager.getConnection(url);

			// Step 3 : Create the statement
			String sql = "call test_procedure(?,?,?)"; // Command to call stored procedure
			CallableStatement cstm = connection.prepareCall(sql);

			// Step 4 : Execute the query
			cstm.setInt(1, 10);
			cstm.setString(2, "John");
			cstm.setString(3, "john@gmail.com");

			System.out.println(cstm.executeUpdate());

			// Step 5 : Close the connection
			connection.close();
			System.out.println("Data inserted and connection closed");

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}
}
