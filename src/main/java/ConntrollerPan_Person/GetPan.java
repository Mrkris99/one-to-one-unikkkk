package ConntrollerPan_Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import person_dto.Pan;
import person_dto.Person;

public class GetPan {

	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("kp");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Pan pn=em.find(Pan.class, 1);
		Person p1=pn.getP();
		System.out.println(pn.getPanNo());
		System.out.println(p1.getName());

	}

}
