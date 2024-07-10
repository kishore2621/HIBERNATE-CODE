package ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Find_questiondatabyid 
{
		public static void main(String[] args) 
		{

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytoone");
			EntityManager em = emf.createEntityManager();

			QuestionData data =em.find(QuestionData.class, 1);
			if(data != null)
			{
				System.out.println(data);
			}
			else
			{
				System.out.println("no record is found");
			}
		}

}
