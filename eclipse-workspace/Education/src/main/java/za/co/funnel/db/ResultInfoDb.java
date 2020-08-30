package za.co.funnel.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import za.co.funnel.servlet.YemiProjectManager;
import za.co.funnel.Result.Result;

public class ResultInfoDb {

	@SuppressWarnings("unchecked")
	public static List<Result> resultInfo(String accessNumber) {

		EntityManager e = YemiProjectManager.getEntityManager();
		Query que = e.createQuery("SELECT r FROM Result r WHERE r.examNumber = :access");
		que.setParameter("access", accessNumber);

		List<Result> resultList = (List<Result>) que.getResultList();

		return resultList;
	}

}
