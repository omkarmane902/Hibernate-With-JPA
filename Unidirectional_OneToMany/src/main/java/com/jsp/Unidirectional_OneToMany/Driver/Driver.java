package com.jsp.Unidirectional_OneToMany.Driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Unidirectional_OneToMany.Entity.College;
import com.jsp.Unidirectional_OneToMany.Entity.Teacher;

public class Driver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		

		
		Teacher t1 = new Teacher(1, "Sahinat", 2);
		Teacher t2 = new Teacher(2, "Omkar", 5);
		Teacher t3 = new Teacher(3, "abhi", 1);
		
		List<Teacher> list1 = Arrays.asList(t1,t2);
		List<Teacher> list2 = Arrays.asList(t3);
		
		 College c1 = new College(1, "NMCE", "A++", list1);
		 College c2 = new College(2, "COP", "B+",list2 );
		 
		
		et.begin();
		    em.persist(t1);
		    em.persist(t2);
		    em.persist(t3);
			em.persist(c1);
			em.persist(c2);
			
		
		et.commit();
		
	}
}
