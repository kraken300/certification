package statements;

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
			// Step 1 : Load the driver
			Class.forName(driver);

			// Step 2 : Create the connection
			Connection connection = DriverManager.getConnection(url);

			// Step 3 : Create the statement
			Statement smt = connection.createStatement();

			String fetch1 = "SELECT * FROM student";
//			String fetch2 = "SELECT * FROM student WHERE sid = 1";

//			System.out.println(smt.execute(fetch)); // true

			// Step 4 : Execute the query
			ResultSet rs = smt.executeQuery(fetch1);

			System.out.println("=======Student Details======");

//			if (rs.next()) {
//				int sid = rs.getInt(1);
//				String name = rs.getString(2);
//				String address = rs.getString(3);
//				long phone = rs.getLong(4);
//
//				System.out.println("sid : " + sid + ", name : " + name + ", address : " + address + ", phone : " + phone);
//			}

			while (rs.next()) {
				int sid = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				long phone = rs.getLong(4);

				System.out.println("sid : " + sid + ", name : " + name + ", address : " + address + ", phone : " + phone);
			}

			// Step 5 : Close the connection
			connection.close();
			System.out.println("Data fetched and connection closed");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
