package org.jsp.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOne 
{
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		System.out.println(emf);
		EntityManager em= emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		Pancard c1= new Pancard();
		c1.setNumber("1234psqr");
		c1.setPincode(613002);
		Person p = new Person();
		p.setName("kishore");
		p.setPhno(9176869403l);
		p.setEmail("kishoretnj0926@gmail.com");
		p.setCard(c1);
		em.persist(p);
		
		trans.commit();
	}

}
