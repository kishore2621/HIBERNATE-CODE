package org.HibFetchRecord;

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
		Session s=sf.openSession();
		Employee e=s.load(Employee.class, 1);
		if(e!=null)
		{
			System.out.println(e.getName());
			System.out.println(e.getEmail());
			System.out.println(e.getPassword());
		}
		else
		{
			System.out.println("INVALID ID NUMBER");
		}
	}
}
