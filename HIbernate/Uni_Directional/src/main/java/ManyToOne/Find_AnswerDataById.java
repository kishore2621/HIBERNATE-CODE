package ManyToOne;

import javax.persistence.*;

public class Find_AnswerDataById 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytoone");
		EntityManager em=emf.createEntityManager();
		AnswerData ans=em.find(AnswerData.class, 5);
		try
		{
			System.out.println(ans);
		}
		catch(NoResultException e)
		{
			System.out.println("Mistake hai bhaiya");
		}
		
		
	}

}
