package za.co.fnb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.fnb.Result.Result;
import za.co.fnb.db.DatabaseConnection;

@WebServlet(urlPatterns ="/resultInputted.html")
public class ResultInDatabaseServlet extends HttpServlet{

	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {

		Result result = new Result();
		
		try {
			Connection c1 = DatabaseConnection.connection();
			Statement  st = c1.createStatement();
			
			String  personalNumber=  req.getParameter("accessNumber");
			String subject = req.getParameter("subject");
			double assignment = Double.parseDouble(req.getParameter("assignment"));
			double test = Double.parseDouble(req.getParameter("test"));
			double exam = Double.parseDouble(req.getParameter("exam"));
	
			
			double average = result.calculateAverage(assignment, test, exam);			

			
			System.out.println(average);						
			String sql = "INSERT INTO Result (personal_number, subject_name, assignment, test, exam, average)"
			+ " VALUES ('" + personalNumber + "','" + subject + "'," + assignment + "," + test + "," + exam + "," + average +  ")"; 
				
			st.executeUpdate(sql);
			DatabaseConnection.connectionClose(c1);
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
