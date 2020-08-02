package za.co.fnb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.InputMismatchException;


import za.co.fnb.People.Person;

public class LoginDatabase {
	
	public static boolean loggedIn;

	public static boolean loginDb(String accessNumber, String password) {
			Person person = new Person();
	try {
		Class.forName("com.mysql.jdbc.Driver");
		// "com.mysql.jdbc.Driver" this is the path
		Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaEE", "root", "pvi@2020");
		// here Pvi is database name, root is username and password
		Statement st = c1.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM Information WHERE personal_number =" + "'" + accessNumber
				+ "'" + "AND password =" + "'" + password + "'");
		while (res.next()) {
			//Student student = new Student();
			person.setAccessNumber(res.getString("personal_number"));
			person.setPassword(res.getString("password"));
			//calling login method in student class
			
		loggedIn = person.logIn(accessNumber, password, person);
	}
		c1.close();
	} catch (InputMismatchException e) {
		System.out.println("Invalid input");
	} catch (Exception ex) {
		System.out.println(ex);
	}
	if(loggedIn) {
		return true;
	}else
	return false;
}

}
