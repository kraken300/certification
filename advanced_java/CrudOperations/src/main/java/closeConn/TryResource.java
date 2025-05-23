package closeConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TryResource {
	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/demo?user=postgres&password=root";

		// Step 1 : Load the driver
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// Step 2 : Create the connection
		try (Connection connection = DriverManager.getConnection(url);) {

			// Step 3 : Create the statement
			String sql = "SELECT * FROM student";
			Statement stm = connection.createStatement();

			// Step 4 : Execute the query
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				int sid = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				long phone = rs.getLong(4);

				System.out
						.println("sid : " + sid + ", name : " + name + ", address : " + address + ", phone : " + phone);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
