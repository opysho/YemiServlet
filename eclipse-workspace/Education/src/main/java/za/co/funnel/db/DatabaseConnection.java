package za.co.funnel.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	public static Connection connection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		// "com.mysql.jdbc.Driver" this is the path
		Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaEE", "root", "pvi@2020");
		// here Pvi is database name, root is username and password
		return c1;
	}
	
	public static void connectionClose(Connection c1) throws SQLException {
		c1.close();
	}

}
