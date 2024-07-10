package org.jsp.Insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUser 
{
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		
		System.out.println(emf);
		EntityManager em=emf.createEntityManager();
		EntityTransaction trans=em.getTransaction();
		trans.begin();
		User u= new User();
		u.setName("guru");
		u.setEmail("ab@gmail.com");
		u.setPassword("123abc");
		u.setPhno(917664549403l);
		em.persist(u);
		trans.commit();
	}

}
