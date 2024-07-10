package org.jsp.Insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch_BasedonId 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		System.out.println(emf);
		EntityManager em=emf.createEntityManager();
		User u=em.find(User.class, 1);
		if(u!=null)
		{
			System.out.println(u.getId());
			System.out.println(u.getEmail());
			System.out.println(u.getName());
			System.out.println(u.getPhno());
		}
		else 
		{
			System.out.println("invalid id value");
		}
	}
}
