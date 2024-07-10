package org.hib.FetchBasedColumn;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.*;
import org.hibernate.query.Query;

import org.hibernate.cfg.Configuration;

public class BasedColumn 
{
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) 
	{
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session s= sf.openSession();
		Query<Employee> q= s.createQuery("select e from Employee e");
		List<Employee> l1=q.getResultList();
		for(Employee e:l1)
		{
			
//			System.out.println(e);
			System.out.print(e.getId()+" ");
			System.out.print(e.getName()+" ");
			System.out.print(e.getEmail()+" ");
			System.out.print(e.getPassword());
			System.out.println();
		}
		
		Query<String> q1=s.createQuery("select e.name from Employee e where e.id=:id" );
		    q1.setParameter("id", 6);
		   
		    try {
				String s1 = q1.getSingleResult();
				System.out.println(s1);
			} catch (NoResultException e) {
				System.out.println("invalid");
			}
			Query<String> q2=s.createQuery("select e.name from Employee e where e.id=?0 and e.email=?1" );
		    q2.setParameter(0, 1);
		    q2.setParameter(1, "@12345");
		    String s2=q2.getSingleResult();
		    System.out.println(s2 );
		   
		    
	}

}
