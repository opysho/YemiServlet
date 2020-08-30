package za.co.funnel.db;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import za.co.funnel.servlet.YemiProjectManager;
import za.co.funnel.People.Person;

public class LoginDatabase {

	public static boolean loggedIn;

	@SuppressWarnings("unchecked")
	public static boolean loginDb(String accessNumber, String password) {

		EntityManager ex = YemiProjectManager.getEntityManager();
		String stringQuery = ("SELECT p FROM Person p WHERE p.accessNumber = :access and p.password = :pass");
		Query query = ex.createQuery(stringQuery);
		query.setParameter("access", accessNumber);
		query.setParameter("pass", password);

		List<Person> loginList = (List<Person>) query.getResultList();

		if (loginList.isEmpty()) {
		return false;
		} else {
			return true;
		}
	}

}