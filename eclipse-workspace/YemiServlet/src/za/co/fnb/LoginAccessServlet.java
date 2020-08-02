package za.co.fnb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.fnb.People.Person;
import za.co.fnb.db.LoginDatabase;


public class LoginAccessServlet extends HttpServlet{
	
protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		
	}
	
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {
		
		Person person = new Person();
		//String fullName = person.getFullNames();
		String accessNumber = req.getParameter("accessNumber");
		String password = req.getParameter("password");

		boolean access = LoginDatabase.loginDb(accessNumber, password);
	
	if(access) {
		try {
			
			req.getRequestDispatcher("Menu.jsp").forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	else {
		try {
			String response = "You have entered an invalid access number and password!!!!";
			req.setAttribute("responseName", response);
			req.getRequestDispatcher("LogAgain.jsp").forward(req, res);
		} catch (ServletException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println("Invalid Student number and password!!!!");
	}
	
	
	
}
}
