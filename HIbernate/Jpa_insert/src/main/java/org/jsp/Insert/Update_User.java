package org.jsp.Insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update_User 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction trans=em.getTransaction();
		trans.begin();
		User u= new User(); //---> Transient state
			u.setName("rahul");
			u.setId(10);
			u.setEmail("axy@gmail.com");
			u.setPassword("123");
			u.setPhno(6380609823l);
			em.merge(u);
			
		trans.commit();
	}
}
