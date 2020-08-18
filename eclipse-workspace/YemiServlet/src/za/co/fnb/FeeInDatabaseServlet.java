package za.co.fnb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.fnb.Fee.Fee;
import za.co.fnb.db.DatabaseConnection;

@WebServlet(urlPatterns ="/feeInputted.html")
public class FeeInDatabaseServlet extends HttpServlet {

	Fee fee = new Fee();
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) {

		//Fee fee = new Fee();
	
		try {
			Connection c1 = DatabaseConnection.connection();
			Statement st = c1.createStatement();

			String personalNumber = req.getParameter("accessNumber");
			String purpose = req.getParameter("purpose");
			String dateOfPayment = req.getParameter("date");
			double amountDue = Double.parseDouble(req.getParameter("amountDue"));
			double amountPaid = Double.parseDouble(req.getParameter("amountPaid"));
			
			double amountBalance = 		fee.calculateBalance(amountDue, amountPaid);

			String sql = "INSERT INTO Fees (personal_number, purpose_of_payment, date_of_payment, amount, amount_paid, balance)"
					+ " VALUES ('" + personalNumber + "','" + purpose + "'," + dateOfPayment + "," + amountDue + ","
					+ amountPaid + "," + amountBalance + ")";

			st.executeUpdate(sql);
			DatabaseConnection.connectionClose(c1);
		} catch (Exception ex) {
			System.out.println(ex);
		}

		try {
			req.getRequestDispatcher("FeeUpdateCompleted.jsp").forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	

	
}
