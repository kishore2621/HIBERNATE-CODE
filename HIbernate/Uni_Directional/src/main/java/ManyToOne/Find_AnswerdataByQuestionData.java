package ManyToOne;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Find_AnswerdataByQuestionData 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manytoone");
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select a from AnswerData a where a.data.id=?1");
		q.setParameter(1, 1);
		List<AnswerData> l=q.getResultList();
		
		if(!l.isEmpty())
		{
			for (AnswerData s : l) 
				System.out.println(s);
		}
		else
		{
			System.out.println("no record found");
		}
		
	}

}
