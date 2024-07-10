package org.jsp.Insert;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class NativeQuery 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		Query q= em.createNativeQuery("select name from User");
		/* if you want to use sql query to use craetive Native method
		 * if the query returning only one coloum the return type is that data type 
		 * more than one the it is object [] 
		 * 
		 */
		List<String> u= q.getResultList();
		if(!u.isEmpty())
		{
			for(String u1:u)
			System.out.println(u1);
		}
		else
		{
			System.out.println("invalid ");
		}
		
		Query q1=em.createNamedQuery("detailsUser");
		/* create named query method present in entity manager factory
		 * this method is used to excute the Sql query in jpa 
		 * the query contaning more then one result use getResultList()
		 * this method is return List<Object[]> list of object array 
		 * 
		 */
		List<Object[]> l= q1.getResultList();
		
		if(!l.isEmpty())
			{
				for(Object[] u1:l)
				{
					for(int i=0;i<=u1.length-1;i++)
						System.out.print(u1[i] +" ");
					{
						System.out.println();
					}
					
				}
			}
			else
			{
				System.out.println("invalid ");
			}
		
		Query q2=em.createNamedQuery("findbyname");
		/* this method is returning object[] array 
		 * if you want to change the return type query add the attribute in the 
		 *  namedNative query annotation to add result class or result mapping
		 */
		    q2.setParameter("name", "krish");
		    User res= (User) q.getSingleResult();
		    System.out.println(res);
		
		TypedQuery<User> ty= em.createNamedQuery("detailsUser", User.class);
						List<User> l4 =	ty.getResultList();
						
						if(!l4.isEmpty())
							{
								for(User u1:l4)
										System.out.println(u1);
							}
							else
							{
								System.out.println("invalid ");
							}
						
	}

}
