package za.co.funnel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.funnel.People.Person;
import za.co.funnel.db.OtherInfoDb;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/checkInfo.html")
public class OtherInfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) {

		String access = req.getParameter("accessNumber");

		List<Person> otherInfo = OtherInfoDb.otherInfo(access);

		if (otherInfo.isEmpty()) {
			try {
				String listEmpty = "Access number is invalid, try again !!!";

				req.setAttribute("listIsEmpty", listEmpty);

				req.getRequestDispatcher("InvalidOtherInfo.jsp").forward(req, res);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			req.setAttribute("otherInfo", otherInfo);
			req.getRequestDispatcher("OtherInfo.jsp").forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
