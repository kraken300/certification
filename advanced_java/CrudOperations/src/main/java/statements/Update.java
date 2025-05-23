package statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo?user=postgres&password=root";

		try {
			// Step 1 : Load the driver
			Class.forName(driver);

			// Step 2 : Create the connection
			Connection connection = DriverManager.getConnection(url);

			// Step 3 : Create the statement
			String update = "UPDATE student SET address = ? WHERE sid = ?";
			PreparedStatement pstm = connection.prepareStatement(update);

			// Step 4 : Execute the query
			pstm.setString(1, "Mumbai");
			pstm.setInt(2, 10);
			
			System.out.println(pstm.executeUpdate()); // 1

			// Step 5 : Close the connection
			connection.close();

			System.out.println("Data updated and connection closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
