package za.co.funnel.servlet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class YemiProjectManager {
	
		
	public static EntityManager getEntityManager() {
		//creating a local variable to name the persistent.xml file "jpaPersistentUnit"
		String persistentUnitName = "jpaPersistentUnit";
		EntityManagerFactory fmf = Persistence.createEntityManagerFactory(persistentUnitName);

		EntityManager ex = fmf.createEntityManager();
		
		return ex;
}
}