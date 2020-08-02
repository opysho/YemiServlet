package za.co.fnb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FeeInDatabaseServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			// "com.mysql.jdbc.Driver" this is the path
			Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaEE", "root", "pvi@2020");
			// here Pvi is database name, root is username and password
			Statement st = c1.createStatement();

			String personalNumber = req.getParameter("accessNumber");
			String purpose = req.getParameter("purpose");
			String dateOfPayment = req.getParameter("date");
			double amountDue = Double.parseDouble(req.getParameter("amountDue"));
			double amountPaid = Double.parseDouble(req.getParameter("amountPaid"));
			
			double amountBalance = amountDue - amountPaid;
			

			String sql = "INSERT INTO Fees (personal_number, purpose_of_payment, date_of_payment, amount, amount_paid, balance)"
					+ " VALUES ('" + personalNumber + "','" + purpose + "'," + dateOfPayment + "," + amountDue + ","
					+ amountPaid + "," + amountBalance + ")";

			st.executeUpdate(sql);
			c1.close();
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
