package org.jsp.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

  
public class Find_PersonById 
{
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		Person p= em.find(Person.class, 3);
		if(p!=null)
		{
			System.out.println(p);
		}
		else
		{
			System.out.println("invalid identifier");
		}
	}

}
