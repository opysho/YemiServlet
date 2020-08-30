package za.co.funnel.db;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import za.co.funnel.servlet.YemiProjectManager;
import za.co.funnel.People.Person;

public class CheckIfTeacher {

	@SuppressWarnings("unchecked")
	public static List<Person> checkIfAccessIsTeacher(String accessNumber, String position) {

		EntityManager ex = YemiProjectManager.getEntityManager();

		Query query = ex.createQuery("SELECT p FROM Person p WHERE p.accessNumber = :access and p.post = :abc");
		query.setParameter("access", accessNumber);
		query.setParameter("abc", position);

		List<Person> isTeacher = (List<Person>) query.getResultList();
		return isTeacher;

	}

}