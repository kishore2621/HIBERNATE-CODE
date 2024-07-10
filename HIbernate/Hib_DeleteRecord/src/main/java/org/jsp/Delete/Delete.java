package org.jsp.Delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete 
{
	public static void main(String[] args) 
	{
		Configuration configuration= new Configuration();
		configuration.configure();
		SessionFactory sf= configuration.buildSessionFactory();
		Session s= sf.openSession();
		Transaction ts=s.getTransaction();
		ts.begin();
		Employee e= s.get(Employee.class, 3);
		s.delete(e);
		ts.commit();
	}
}
