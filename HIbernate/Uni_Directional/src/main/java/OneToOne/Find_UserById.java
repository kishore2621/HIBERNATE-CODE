package OneToOne;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Find_UserById 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em= emf.createEntityManager();
		User u=em.find(User.class,1);
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
