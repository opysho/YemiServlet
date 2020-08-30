package za.co.funnel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.funnel.People.Person;
import za.co.funnel.db.CheckIfAccountOfficer;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/updateFees.html")
public class FeeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) {

		String accessFee = req.getParameter("accessNumber");

		List<Person> accessAccount = CheckIfAccountOfficer.checkIfAccountant(accessFee, "Accountant");

		if (accessAccount.isEmpty()) {

			try {
				String listEmpty = "This access number is either invalid or doesn't belong to an authorized account officer !!!";

				req.setAttribute("listIsEmpty", listEmpty);
				req.getRequestDispatcher("InvalidAccountInfo.jsp").forward(req, res);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {

			try {
				req.getRequestDispatcher("FeeUpdateForm.jsp").forward(req, res);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}