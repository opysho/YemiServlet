package za.co.fnb.db;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import za.co.fnb.YemiProjectManager;
import za.co.fnb.People.Person;

public class CheckIfAccountOfficer {

	@SuppressWarnings("unchecked")
	public static List<Person> checkIfAccountant(String accessNumber, String position) {

		EntityManager ex = YemiProjectManager.getEntityManager();

		Query query = ex.createQuery("SELECT p FROM Person p WHERE p.accessNumber = :access and p.post = :abc");
		query.setParameter("access", accessNumber);
		query.setParameter("abc", position);

		List<Person> isAnAccountant = (List<Person>) query.getResultList();
		return isAnAccountant;

	}

}
