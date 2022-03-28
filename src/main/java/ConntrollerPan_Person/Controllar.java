package ConntrollerPan_Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import person_dto.Pan;
import person_dto.Person;

public class Controllar {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("kp");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		Person p=new Person();
		
		p.setCno(1234);
		p.setGender("female");
		p.setName("sheela");
		p.setGender("male");
		
		Pan p1 = new Pan();
		p1.setCno(76544);
		p1.setPanNo(12222224);
		
		
		
		et.begin();
		em.persist(p1);
		em.persist(p);
		et.commit();
		

	}

}
