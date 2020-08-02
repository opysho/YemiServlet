package za.co.fnb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import za.co.fnb.People.Person;

public class OtherInfoDb {
	
	
	public static List<Person> otherInfo(String accessNumber) {
		
		
		List<Person> list = new ArrayList<>();

	try {	
		Class.forName("com.mysql.jdbc.Driver");
		// "com.mysql.jdbc.Driver" this is the path
		Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaEE", "root",
				"pvi@2020");
		// here Pvi is database name, root is username and password
		Statement st = c1.createStatement();


		// Sql statement for student
		ResultSet res = st.executeQuery("SELECT surname, first_name, id_number, date_of_birth, age, sex,"
				+ " address, email, phone_number, school_attended, grade_completed, grade_apply, subject1, subject2, subject3, subject4, subject5, "
				+ "guardian_fullnames, guardian_address, guardian_phonenumber, position, personal_number FROM Information WHERE personal_number =" + "'" + accessNumber + "'");

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
			person.setPreviousSchool(res.getString("school_attended"));
			person.setGradeCompleted(res.getString("grade_completed"));
			person.setGrade(res.getString("grade_apply"));
			person.setSubject1(res.getString("subject1"));
			person.setSubject2(res.getString("subject2"));
			person.setSubject3(res.getString("subject3"));
			person.setSubject4(res.getString("subject4"));
			person.setSubject5(res.getString("subject5"));
			person.setGuardianFullnames(res.getString("guardian_fullnames"));
			person.setGuardianAddress(res.getString("guardian_address"));
			person.setGuardianPhoneNumber(res.getString("guardian_phonenumber"));
			person.setPost(res.getString("position"));;
			
			list.add(person);
			
		
		}
		c1.close();
	} catch (InputMismatchException e) {
		System.out.println("Invalid input");
	} catch (Exception ex) {
		System.out.println(ex);
	}
	return list;
}
		
	}


