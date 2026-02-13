package com.jsp.CurdHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SelectFind {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Laptop  l = em.find(Laptop.class, 5);
		
		if (l != null) {
			System.out.println("ID: " +l.getId());
			System.out.println("Brand: "+l.getBrand());
			System.out.println("Price: " +l.getPrice());
			
		} else {
			 System.out.println("Data not found");
		}
		
		
		et.begin();
		
		et.commit();
		
	}
}
