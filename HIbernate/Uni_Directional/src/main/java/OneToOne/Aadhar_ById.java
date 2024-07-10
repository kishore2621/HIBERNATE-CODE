package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Aadhar_ById 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		AadharCard u=em.find(AadharCard.class,1);
		if (u!=null)
		{
			System.out.println(u);
		}
		else
		{
			System.out.println("Record Is Not Found");
		}
		
	}

}
