package za.co.fnb;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.fnb.People.Person;
import za.co.fnb.db.CheckIfTeacher;

public class ResultServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) {
		
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) {
	
		
		String accessResultUpdate = req.getParameter("accessNumber");
		
		List<Person> isAccessGranted = CheckIfTeacher.checkIfAccessIsTeacher(accessResultUpdate);
		
		if(isAccessGranted.isEmpty()) {
			
			try {
			
				String listEmpty = "Access number is invalid and doesn't belong to a teacher";
			
				req.setAttribute("listIsEmpty", listEmpty);			
				req.getRequestDispatcher("InvalidTeacherInfo.jsp").forward(req, res);
			} catch (ServletException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
		
			try {
			req.getRequestDispatcher("ResultUpdateForm.jsp").forward(req, res);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
}