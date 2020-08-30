package za.co.funnel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns ="/returnToMenu.html")
public class MenuListServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		
	}
	
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {
	
    		System.out.println("am here!!!!!!!!");
    	try {
			req.getRequestDispatcher("Menu.jsp").forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
