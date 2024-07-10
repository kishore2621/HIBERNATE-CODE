package ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Find_QusetionDataByAnswerDataId 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("manytoone");
		EntityManager em =emf.createEntityManager();
		
		Query q= em.createQuery("select a.data from AnswerData a where a.id=?1");
		q.setParameter(1, 1);
		try {
			QuestionData data = (QuestionData) q.getSingleResult();
			System.out.println(data);
		} catch (NoResultException e) 
		{
			System.out.println("no record found ");
		}
		
	}

}
