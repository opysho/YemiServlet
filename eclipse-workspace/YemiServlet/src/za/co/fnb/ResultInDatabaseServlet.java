package za.co.fnb;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.co.fnb.Result.Result;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/resultInputted.html")
public class ResultInDatabaseServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) {

		EntityManager em = YemiProjectManager.getEntityManager();

		em.getTransaction().begin();

		String personalNumber = req.getParameter("accessNumber");
		String subject = req.getParameter("subject");
		double assignment = Double.parseDouble(req.getParameter("assignment"));
		double test = Double.parseDouble(req.getParameter("test"));
		double exam = Double.parseDouble(req.getParameter("exam"));

		Result result = new Result();

		double average = result.calculateAverage(assignment, test, exam);

		Result result2 = new Result(personalNumber, subject, assignment, test, exam, average);

		em.persist(result2);
		em.getTransaction().commit();

		try {
			req.getRequestDispatcher("ResultUpdateCompleted.jsp").forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
