package za.co.fnb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.fnb.db.DatabaseConnection;

public class RegisterInDatabaseServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			Connection c1 = DatabaseConnection.connection();
			Statement  st = c1.createStatement();
			
			String surname =  req.getParameter("surname");
			String firstName = req.getParameter("firstName");
			Long id = Long.parseLong(req.getParameter("idNumber"));
			String year = req.getParameter("year");
			String month = req.getParameter("month");
			String day = req.getParameter("day");
			String dateOfBirth = year + "/" + month + "/" + day;
			int age = Integer.parseInt(req.getParameter("age"));
			String sex = req.getParameter("sex");
			String address = req.getParameter("address");
			String email = req.getParameter("email");
			String phoneNumber = req.getParameter("phoneNumber");
			String previousSchool= req.getParameter("previousSchoolAttended");
			String gradeCompleted = req.getParameter("gradeCompleted");
			String grade = req.getParameter("gradeApplying");
			String subject1 = req.getParameter("subject1");
			String subject2 = req.getParameter("subject2");
			String subject3 = req.getParameter("subject3");
			String subject4 = req.getParameter("subject4");
			String subject5 = req.getParameter("subject5");
			String guardianFullnames = req.getParameter("guardianFullnames");
			String guardianAddress = req.getParameter("guardianAddress");
			String guardianPhoneNumber = req.getParameter("guardianPhoneNumber");
			String position = req.getParameter("position");
			String personalNumber = req.getParameter("personalNumber");
			String password = req.getParameter("password");
									
			String sql = "INSERT INTO Information (surname, first_name, id_number, date_of_birth, age, sex, address, email, phone_number, school_attended, grade_completed, grade_apply, subject1, subject2, subject3, subject4, subject5,"
					+ " guardian_fullnames, guardian_address, guardian_phonenumber, position, personal_number, password) VALUES ('" + surname + "','" + firstName + "'," + id + ",'" + dateOfBirth + "'," + age + ",'" + sex + "','" + address + "','" +  
					email + "','" + phoneNumber + "','" + previousSchool + "','" + gradeCompleted + "','" + grade +
					"','" + subject1 + "','" + subject2 + "','" + subject3 + "','" + subject4 + "','" + subject5 + "','" + guardianFullnames + "','" + guardianAddress + "','" +
					guardianPhoneNumber + "','" + position + "','" + personalNumber + "','" + password + "')"; 
				
			st.executeUpdate(sql);
			DatabaseConnection.connectionClose(c1);
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		try {
			req.getRequestDispatcher("RegistrationCompleted.jsp").forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	}


