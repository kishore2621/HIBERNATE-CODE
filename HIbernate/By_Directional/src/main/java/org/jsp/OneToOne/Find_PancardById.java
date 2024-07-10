package org.jsp.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Find_PancardById 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Pancard c=em.find(Pancard.class, 4);
		if(c!=null)
		{
			System.out.println(c);
		}
		else
		{
			System.out.println("no result found");
		}
		
	}

}
