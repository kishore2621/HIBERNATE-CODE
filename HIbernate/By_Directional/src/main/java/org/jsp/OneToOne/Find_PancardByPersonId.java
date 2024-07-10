package org.jsp.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Find_PancardByPersonId 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select p.card from Person p where p.id=?1");
			q.setParameter(1, 3);
		try {
			Pancard p = (Pancard) q.getSingleResult();
			System.out.println(p);
		} catch (NoResultException e) {
			// TODO: handle exception
			System.out.println("record is not found");
		}
		
	}

}
