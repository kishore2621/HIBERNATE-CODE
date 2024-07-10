package ManyToOne;



import javax.persistence.*;

public class Find_AnsweDataByAnswerArttribute 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("manytoone");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select a from AnswerData a where a.answer=?1");
		q.setParameter(1, "women");
		AnswerData ad=(AnswerData) q.getSingleResult();
		if(ad!=null)
		{
			System.out.println(ad);
		}
		else
		{
			System.out.println("Invalid answer");
		}
	}
}
