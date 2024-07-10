package org.jsp.Update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update 
{
	public static void main(String[] args) 
	{
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf= con.buildSessionFactory();
		Session s=sf.openSession();
		Transaction ts= s.beginTransaction();
		Employee e= new Employee();
		e.setId(1);
		e.setName("kishore");
		e.setEmail("@12345");
		e.setPassword("123467");
		s.saveOrUpdate(e);
		ts.commit();
	}
}
