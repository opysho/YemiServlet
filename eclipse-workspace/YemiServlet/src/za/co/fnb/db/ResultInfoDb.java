package za.co.fnb.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

import za.co.fnb.Result.Result;


public class ResultInfoDb {
	
	
	
	public static List<Result> resultInfo(String accessNumber) {
		
		List<Result> list = new LinkedList<>();
		
		try {	
		Connection c1 = DatabaseConnection.connection();
		Statement st = c1.createStatement();


		// Sql statement for student
		ResultSet res = st.executeQuery("SELECT * FROM Result WHERE personal_number =" + "'" + accessNumber+ "'");

		while (res.next()) {
		
			Result result = new Result();
		
			result.setExamNumber(res.getString("personal_number"));
			result.setSubject(res.getString("subject_name"));
			result.setAssignmentMarks(res.getDouble("assignment"));
			result.setTestMarks(res.getDouble("test"));
			result.setExaminationMarks(res.getDouble("exam"));
			result.setAverageMarks(res.getDouble("average"));
		
			
			list.add(result);
					//System.out.println();	
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
	
