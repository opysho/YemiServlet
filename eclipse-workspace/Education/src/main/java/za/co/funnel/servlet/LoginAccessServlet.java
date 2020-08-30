package za.co.funnel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.funnel.db.LoginDatabase;


@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/logging.html")
public class LoginAccessServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {

		String accessNumber = req.getParameter("accessNumber");
		String password = req.getParameter("password");

		boolean access = LoginDatabase.loginDb(accessNumber, password);
		
		
		if (access == true) {
			try {
				req.getRequestDispatcher("Menu.jsp").forward(req, res);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				String response = "You have entered an invalid access number and password!!!!";
				req.setAttribute("responseName", response);
				req.getRequestDispatcher("LogAgain.jsp").forward(req, res);
			} catch (ServletException e) {
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
