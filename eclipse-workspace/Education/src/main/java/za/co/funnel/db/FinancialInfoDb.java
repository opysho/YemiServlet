package za.co.funnel.db;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import za.co.funnel.servlet.YemiProjectManager;
import za.co.funnel.Fee.Fee;

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
