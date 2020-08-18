package za.co.fnb;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.fnb.Fee.Fee;
import za.co.fnb.db.FinancialInfoDb;

@WebServlet(urlPatterns ="/checkFees.html")
public class FeesInfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) {

		String access = req.getParameter("accessNumber");
		
		List<Fee> finance = FinancialInfoDb.checkFinance(access);

		if (finance.isEmpty()) {

			String listEmpty = "This access number is invalid !!!";
			try {
				req.setAttribute("listIsEmpty", listEmpty);
				req.getRequestDispatcher("InvalidAccessNumber.jsp").forward(req, res);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				req.setAttribute("finance", finance);
				req.getRequestDispatcher("FinancialRecords.jsp").forward(req, res);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
