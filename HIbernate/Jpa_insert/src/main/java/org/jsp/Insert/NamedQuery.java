package org.jsp.Insert;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class NamedQuery 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();

		//---------------------Query interface---------------------
		Query q=em.createNamedQuery("details");
		/*if the named query argument is wrong it will throw illegal argument exception
		 the return type of createNamedQuery(name ) is Query interface and it will
		 return the implementation class object of Query interface
		 */
		List<User> result	= q.getResultList();
		if(!result.isEmpty())					
		{
			for( User u:result)
			{
				System.out.println(u);
			}
		}
		else 
		{
			System.out.println(result);

		}

		//-----------------------------TypedQueryinterface------------------
		TypedQuery<String> tq= em.createNamedQuery("phoneno",String.class);
		/*TypedQuery interface is the sub interface of Query interface if the named query argument is wrong
		it will throw illegal argument exception the return type of createNamedQuery(String name,class<T>resultclass) is
		Typedqueryinterface and it will return the implementation object of Typedqueryinterface
		 */
		tq.setParameter(1,"krish");						
		try {											

			String u = tq.getSingleResult();
			System.out.println(u);
		} catch (NoResultException e) 
		{
			System.out.println("no result found by name");
		}



		TypedQuery<Long> tq1=em.createNamedQuery("findname", Long.class);
		/* if you pass User.class it will throw Argument Exception
		   if the query return what type of Result that class type  you will assign as second argument
		 */
		List<Long> l2=	tq1.getResultList();						 
		if(!l2.isEmpty())
		{
			for( Long u:l2)
			{
				System.out.println(u);
			}
		}
		else 
		{
			System.out.println(result);

		}

	}

}
