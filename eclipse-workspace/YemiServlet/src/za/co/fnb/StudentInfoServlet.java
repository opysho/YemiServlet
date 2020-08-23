package za.co.fnb;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.fnb.People.Person;
import za.co.fnb.db.StudentInfoDb;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/studentInfo.html")
public class StudentInfoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) {

		String accessNumber = req.getParameter("accessNumber");

		boolean checkList = StudentInfoDb.checkIfStudent(accessNumber, "Student");

		if (checkList == false) {

			try {
				String listEmpty = "Access number is invalid and doesn't belong to a student";

				req.setAttribute("listIsEmpty", listEmpty);

				req.getRequestDispatcher("InvalidStudentInfo.jsp").forward(req, res);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {

				List<Person> studentInfoList = StudentInfoDb.studentInfo(accessNumber);

				req.setAttribute("studentInfoList", studentInfoList);
				req.getRequestDispatcher("StudentInfo.jsp").forward(req, res);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
