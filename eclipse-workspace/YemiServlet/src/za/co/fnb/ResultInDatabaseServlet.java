package za.co.fnb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResultInDatabaseServlet extends HttpServlet{

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//"com.mysql.jdbc.Driver" this is the path
			Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaEE", "root", "pvi@2020");
			//here Pvi is database name, root is username and password
			Statement  st = c1.createStatement();
			
			String  personalNumber=  req.getParameter("accessNumber");
			String subject = req.getParameter("subject");
			double assignment = Double.parseDouble(req.getParameter("assignment"));
			double test = Double.parseDouble(req.getParameter("test"));
			double exam = Double.parseDouble(req.getParameter("exam"));
		
			double average = (assignment + test + exam)/3;
			
			System.out.println(average);						
			String sql = "INSERT INTO Result (personal_number, subject_name, assignment, test, exam, average)"
			+ " VALUES ('" + personalNumber + "','" + subject + "'," + assignment + "," + test + "," + exam + "," + average +  ")"; 
				
			
			
			
			st.executeUpdate(sql);
			c1.close();
		}catch(Exception ex) {
			System.out.println(ex);
		}
		
		try {
			req.getRequestDispatcher("ResultUpdateCompleted.jsp").forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
