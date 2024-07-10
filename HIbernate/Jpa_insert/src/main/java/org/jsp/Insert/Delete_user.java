package org.jsp.Insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete_user 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		System.out.println(emf);
		EntityManager em=emf.createEntityManager();
		EntityTransaction trans=em.getTransaction();
		trans.begin();
		User u=em.find(User.class, 3);
		if(u!=null)
		{	
			em.remove(u);
			trans.commit();
		}
		else
		{
			System.out.println("the record is not present in the table so cant delete");
		}
	}
}
