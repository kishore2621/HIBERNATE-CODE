package OneToOne;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Find_UserByAadharAndDOB 
{
	public static void main(String[] args) 

	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter Aadhar Card Number");
		long ad=sc.nextLong();
		System.out.println("enter Date of Birth");
		sc.nextLine();
		String user=sc.nextLine();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date =LocalDate.parse(user, format);
		
		
		
		
		
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		Query q= em.createQuery("select u from User u where u.card.number=?1 and u.card.bob=?2");
		q.setParameter(1, ad);
		q.setParameter(2, date);
		try {
			User u = (User) q.getSingleResult();
			System.out.println(u);
		} catch (NoResultException e) 
		{
			System.out.println("Your data is not found");
		}
		sc.close();
	}

}
