package za.co.funnel.servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.funnel.Result.Result;
import za.co.funnel.db.ResultInfoDb;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/studentResult.html")
public class FetchResultServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) {

		String access = req.getParameter("accessNumber");

		List<Result> resultInfoList = ResultInfoDb.resultInfo(access);
		System.out.println(resultInfoList);

		if (resultInfoList.isEmpty()) {

			try {
				String listEmpty = "Access number is invalid and doesn't belong to a student";
				req.setAttribute("listIsEmpty", listEmpty);

				req.getRequestDispatcher("InvalidResultInfo.jsp").forward(req, res);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {

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
}