package com.jsp.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = new Student(1, "omkar", 20000);
		
		Student s2 = new Student(2, "Abhi", 30000);
		
		Student s3 = new Student(3, "yash", 40000);
		et.begin();
//		em.persist(s1);
//		em.persist(s2);
		em.persist(s3);
		et.commit();
		  
	}

}
