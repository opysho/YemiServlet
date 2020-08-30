package za.co.funnel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns ="/frontPage.html")
public class HomePageServlet extends HttpServlet{
	
protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) {

		try {
			req.getRequestDispatcher("index.html").forward(req, res);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}