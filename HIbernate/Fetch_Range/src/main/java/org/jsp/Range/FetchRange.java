package org.jsp.Range;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchRange 
{
	public static void main(String[] args) {
		
		EntityManagerFactory m = Persistence.createEntityManagerFactory("example-unit");
		
		EntityManager m1=m.createEntityManager();
		EntityTransaction t=m1.getTransaction();
		t.begin();
		Employee e= new Employee();
		e.setName("kishore");
		e.setEmail("kishore@gmail.com");
		e.setPassword("@1324");
		m1.persist(e);
		
	}

}
