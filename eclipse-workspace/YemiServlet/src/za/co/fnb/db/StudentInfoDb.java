package za.co.fnb.db;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import za.co.fnb.YemiProjectManager;
import za.co.fnb.People.Person;

public class StudentInfoDb {

	@SuppressWarnings("unchecked")
	public static boolean checkIfStudent(String accessNumber, String position) {

		EntityManager ex = YemiProjectManager.getEntityManager();

		Query query = ex.createQuery("SELECT p FROM Person p WHERE p.accessNumber = :access and p.post = :abc");
		query.setParameter("access", accessNumber);
		query.setParameter("abc", position);

		List<Person> listOfStudentInfo = (List<Person>) query.getResultList();

		if (listOfStudentInfo.isEmpty()) {
			return false;
		} else
			return true;

	}

	@SuppressWarnings("unchecked")
	public static List<Person> studentInfo(String accessNumber) {

		EntityManager ex = YemiProjectManager.getEntityManager();

		Query query = ex.createQuery("SELECT p FROM Person p WHERE p.accessNumber = :access");
		query.setParameter("access", accessNumber);

		List<Person> studentLists = query.getResultList();
		return studentLists;

	}
}
