package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Find_UserByAadharCardNumber 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		Query q= em.createQuery("select a from User a where a.card.number=?1");
		q.setParameter(1, 6380124567811l);
		User u=(User) q.getSingleResult();
		System.out.println(u);
	}

}
