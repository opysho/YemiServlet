package za.co.fnb.db;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import za.co.fnb.YemiProjectManager;
import za.co.fnb.People.Person;

public class OtherInfoDb {

	@SuppressWarnings("unchecked")
	public static List<Person> otherInfo(String accessNumber) {

		EntityManager ex = YemiProjectManager.getEntityManager();

		Query query = ex.createQuery("SELECT p FROM Person p WHERE p.accessNumber = :access");
		query.setParameter("access", accessNumber);

		List<Person> allPersonalInfo = (List<Person>) query.getResultList();
		return allPersonalInfo;
	}

}
