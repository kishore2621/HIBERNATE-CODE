package org.jsp.OneToOne;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Find_PersonByName 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		Query q = em.createQuery("select p from Person p where p.name=?1");
			q.setParameter(1, "kishore");
		List<Person > p=q.getResultList();
		if (!p.isEmpty())
		{
			
			for (Person person : p) 
				System.out.println(person);
		}
		else
		{
			System.out.println("invalid person name not found in table");
		}
		
	}

}
