package ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args) 
	{
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytoone");
		 EntityManager em= emf.createEntityManager();
		 EntityTransaction trans = em.getTransaction();
		 trans.begin();
		 QuestionData q = new QuestionData();
		 q.setQuestion("what is your valuable think for in your life ?");
		 q.setPostedby("guru");
		 
		 AnswerData a1= new AnswerData();
		 a1.setAnswer("time");
		 a1.setAnswerby("sumit");
		 a1.setData(q);
		 
		 AnswerData a2= new AnswerData();
		 a2.setAnswer("women");
		 a2.setAnswerby("gautham");
		 a2.setData(q);
		 
		 em.persist(a1);
		 em.persist(a2);
		 trans.commit();
		 
		
	}

}
