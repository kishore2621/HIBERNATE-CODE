package org.jsp.Insert;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

;

public class JPQL_Tofetch 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q= em.createQuery("select u from User u ");
		List<User> l= q.getResultList();
		if(!l.isEmpty())
		{
			for (User user : l) 
			{
				System.out.println(user.getName());
			}
		}
		else
		{
			System.out.println("No user Found");
		}
	}
}
//q.setParameter(2, "123abc");
//try 
//{
//User u1=(User)	q.getSingleResult();
//System.out.println(u1.getName());
//}
//catch(NoResultException e) 
//{
//	System.out.println("NO Result Found for that phno and password");
//}
