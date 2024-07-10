package org.hib.FetchBasedColumn;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Range 
{
	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf =con.buildSessionFactory();
		Session s= sf.openSession();
		Query< String> q= s.createQuery("select e.name from Employee e where e.Salary BETWEEN :min AND :max");
		q.setParameter("min", 200.0);
		q.setParameter("max", 6000.);
		List <String> l1=	q.getResultList();
		
		
			System.out.println(l1);
		
	}

}
