package OneToOne;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction trans =em.getTransaction();
		trans.begin();
		User u = new User();
		u.setName("tara");
		u.setPhno(6380654823l);
		AadharCard card =new AadharCard();
		card.setNumber(6380124567811l);
		card.setAddress("thanjavur");
		card.setBob(LocalDate.parse("1993-02-17"));
		card.setUser(u);
		u.setCard(card);
		em.persist(u);
		trans.commit();
	}

}
