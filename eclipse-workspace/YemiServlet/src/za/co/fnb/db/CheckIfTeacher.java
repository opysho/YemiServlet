package za.co.fnb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import za.co.fnb.People.Person;

public class CheckIfTeacher {

	
	public static List<Person>  checkIfAccessIsTeacher(String accessNumber) {
		
		
		List<Person> list = new ArrayList<>();
		Person person = new Person ();
		
		
		try {
			Connection c1 = DatabaseConnection.connection();
			Statement st = c1.createStatement();
			
			ResultSet res = st.executeQuery("SELECT surname, first_name, position , personal_number FROM Information WHERE personal_number =" + "'" + accessNumber + "'" + "AND position = 'Teacher'");
			while (res.next()) {
					
				person.setSurname(res.getString("surname"));
				person.setFirstName(res.getString("first_name"));
				person.setPost(res.getString("position"));
				person.setAccessNumber(res.getString("personal_number"));
					
	
					list.add(person);
					System.out.println(person);
			}
			DatabaseConnection.connectionClose(c1);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return list;
		
	}
	
}