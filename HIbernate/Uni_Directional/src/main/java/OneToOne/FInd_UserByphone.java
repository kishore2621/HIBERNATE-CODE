package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FInd_UserByphone 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		Query q= em.createQuery("select u from User u where u.phno=?1");
		q.setParameter(1, 6380654823l);
		try 
		{
			User u = (User) q.getSingleResult();
			System.out.println(u);
		} 
		catch (NoResultException e) 
		{
			System.out.println("invalid phone number");
		}
	}
}
