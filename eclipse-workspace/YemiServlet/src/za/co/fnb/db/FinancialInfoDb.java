package za.co.fnb.db;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import za.co.fnb.YemiProjectManager;
import za.co.fnb.Fee.Fee;

public class FinancialInfoDb {

	@SuppressWarnings("unchecked")
	public static List<Fee> checkFinance(String accessNumber) {

		EntityManager ex = YemiProjectManager.getEntityManager();
		Query query = ex.createQuery("SELECT f FROM Fee f WHERE f.personalNumber =:access");
		query.setParameter("access", accessNumber);

		List<Fee> feeInfo = (List<Fee>) query.getResultList();

		return feeInfo;
	}
}
