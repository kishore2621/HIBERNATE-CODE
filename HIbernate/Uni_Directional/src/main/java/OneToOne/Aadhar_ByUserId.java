package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Aadhar_ByUserId 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		Query q= em.createQuery("select a from AadharCard a where a.user.id=?1");
		q.setParameter(1, 1);
		AadharCard u=(AadharCard) q.getSingleResult();
		System.out.println(u);
	}

}
