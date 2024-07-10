package org.jsp.HibinsertRecord;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecord 
{
	public static void main(String[] args) {
		
		Configuration con= new Configuration();
		con.configure();
		SessionFactory sf=con.buildSessionFactory();
		System.out.println(sf);
		Session s=sf.openSession();
		Transaction trans= s.getTransaction();
		trans.begin();
		Employee e= new Employee();
		e.setName("gowtham");
		e.setEmail("@123");
		e.setPassword("12345abc");
		e.setSalary(4000);
		s.save(e);
		
		Employee e1= new Employee();
		e1.setName("hari");
		e1.setEmail("@123");
		e1.setPassword("12345abc");
		e1.setSalary(200);
		s.save(e1);
		trans.commit();
	}

}
