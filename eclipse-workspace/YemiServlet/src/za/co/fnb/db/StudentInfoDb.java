package za.co.fnb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import za.co.fnb.People.Person;

public class StudentInfoDb {

	
	
	public static List<Person> studentInfo(String accessNumber) {
		
			
			List<Person> list = new ArrayList<>();
			
		try {	
			Connection c1 = DatabaseConnection.connection();
			Statement st = c1.createStatement();


			// Sql statement for student
			ResultSet res = st.executeQuery("SELECT surname, first_name, id_number, date_of_birth, age, sex,"
					+ " address, email, phone_number, grade_apply, subject1, subject2, subject3, subject4, subject5,"
					+ " position FROM Information WHERE personal_number =" +"'" + accessNumber+"'" + "AND position = 'Student' ");

			while (res.next()) {
				
				Person person = new Person();
				
				person.setSurname(res.getString("surname"));
				person.setFirstName(res.getString("first_name"));
				person.setIdentityNumber(res.getLong("id_number"));
				person.setDateOfBirth(res.getString("date_of_birth"));
				person.setAge(res.getInt("age"));
				person.setSex(res.getString("sex"));
				person.setAddress(res.getString("address"));
				person.setEmail(res.getString("email"));
				person.setPhoneNumber(res.getString("phone_number"));
				person.setGrade(res.getString("grade_apply"));
				person.setSubject1(res.getString("subject1"));
				person.setSubject2(res.getString("subject2"));
				person.setSubject3(res.getString("subject3"));
				person.setSubject4(res.getString("subject4"));
				person.setSubject5(res.getString("subject5"));
				person.setPost(res.getString("position"));;
				
				list.add(person);
				
			
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
