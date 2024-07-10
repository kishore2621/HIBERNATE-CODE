package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Find_UserByName 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();
		Query q= em.createQuery("select u from User u where u.name=:name ");
		q.setParameter("name", "tara");
		try
		{
			User u = (User) q.getSingleResult();
			System.out.println(u);
		} catch (NoResultException e) 
		{
			System.out.println("User name is not found");
		}
	}

}
