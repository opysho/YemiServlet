package za.co.fnb;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.fnb.Fee.Fee;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/feeInputted.html")
public class FeeInDatabaseServlet extends HttpServlet {

	Fee fee = new Fee();

	protected void doGet(HttpServletRequest req, HttpServletResponse res) {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) {

		EntityManager em = YemiProjectManager.getEntityManager();

		em.getTransaction().begin();

		String personalNumber = req.getParameter("accessNumber");
		String purpose = req.getParameter("purpose");
		String dateOfPayment = req.getParameter("date");
		double amountDue = Double.parseDouble(req.getParameter("amountDue"));
		double amountPaid = Double.parseDouble(req.getParameter("amountPaid"));

		Fee fee = new Fee();

		double amountBalance = fee.calculateBalance(amountDue, amountPaid);

		Fee fees = new Fee(personalNumber, purpose, dateOfPayment, amountDue, amountPaid, amountBalance);

		em.persist(fees);
		em.getTransaction().commit();

		try {
			req.getRequestDispatcher("FeeUpdateCompleted.jsp").forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
