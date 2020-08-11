package za.co.fnb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

import za.co.fnb.Fee.Fee;

public class FinancialInfoDb {
	
	
	public static List<Fee> checkFinance(String accessNumber) {
		

	List<Fee> list = new ArrayList<>();
		
	Fee fee = new Fee();
	
	try {	
		Connection c1 = DatabaseConnection.connection();
		Statement st = c1.createStatement();


		// Sql statement for student
		ResultSet res = st.executeQuery("SELECT * FROM Fees WHERE personal_number =" + "'" + accessNumber+ "'");

		while (res.next()) {
				
			fee.setPersonalNumber(res.getString("personal_number"));
			fee.setPurposeOfPayment(res.getString("purpose_of_payment"));
			fee.setDateOfPayment(res.getString("date_of_payment"));
			fee.setInitialAmount(res.getDouble("amount"));
			fee.setAmountPaid(res.getDouble("amount_paid"));
			fee.setAmountBalance(res.getDouble("balance"));
			
			list.add(fee);
				
		}
		DatabaseConnection.connectionClose(c1);
	} catch (InputMismatchException e) {
		System.out.println("Invalid input");
	} catch (Exception ex) {
		System.out.println(ex);
	}
	
	return list;	
	}
}
