package com.jsp.CurdHibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Laptop l1 = new Laptop(1, "HP", 7800000.00);
		Laptop l2 = new Laptop(2, "DEll", 800000.00);
		Laptop l3 = new Laptop(3, "Acer", 600000.00);
		Laptop l4 = new Laptop(4, "Acer", 600000.00);
		Laptop l5 = new Laptop(5, "Acer", 1600000.00);
		
		
	     et.begin();
	     em.persist(l1);
	     em.persist(l2);
	     em.persist(l3);
	     em.persist(l4);
	     em.persist(l5);
	     
	     et.commit();
		
	}

}
