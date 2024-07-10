package OneToOne;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Find_AadharNumber_and_DOB 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your AadharNumber");
		long number=sc.nextLong();
		System.out.println("Enter Your Date of Birth (yyyy-mm-dd)");
		sc.nextLine();
		String userinput=sc.nextLine();
		DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date =LocalDate.parse(userinput, format);
		
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		Query q= em.createQuery("select a from AadharCard a where a.number=?1 and a.bob=?2");
		q.setParameter(1, number);
		q.setParameter(2, date);
		try {
			AadharCard card = (AadharCard) q.getSingleResult();
			System.out.println(card);
		} 
		catch (NoResultException e) 
		{
			System.out.println("Record is Not Avaliable");
		}
		
	}

}
