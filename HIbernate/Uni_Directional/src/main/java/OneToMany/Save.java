package OneToMany;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("dev");
		EntityManager em =emf.createEntityManager();
		EntityTransaction tran=em.getTransaction();
		tran.begin();
		
		Department d =new Department();
		d.setName("Traning");
		d.setLocation("banglore");
		
		Employee e= new Employee();
		e.setName("guru");
		e.setDesg("manager");
		
		Employee e1= new Employee();
		e1.setName("Raj");
		e1.setDesg("Hr");
		
		d.setEmps(Arrays.asList(e1,e));
		em.persist(d);
		tran.commit();
		
	}

}
