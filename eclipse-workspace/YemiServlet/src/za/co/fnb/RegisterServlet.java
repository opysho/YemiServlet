package za.co.fnb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns ="/registerform.html")
public class RegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {
		
		try {
			req.getRequestDispatcher("RegistrationForm.jsp").forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
