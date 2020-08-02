package za.co.fnb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.fnb.Result.Result;
import za.co.fnb.db.ResultInfoDb;

public class FetchResultServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) {

		
		String access = req.getParameter("accessNumber");
		
		List<Result> resultInfoList = ResultInfoDb.resultInfo(access);		
		for(Result result : resultInfoList) {
			System.out.println(result);
		}
		
		if(resultInfoList.isEmpty()) {
			
			try {
			String listEmpty = "Access number is invalid and doesn't belong to a student";
		req.setAttribute("listIsEmpty", listEmpty);
		
			req.getRequestDispatcher("InvalidResultInfo.jsp").forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
		
		 try {
			 req.setAttribute("personResult", resultInfoList);
			req.getRequestDispatcher("ResultInfo.jsp").forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}
