package com.jsp.BidirectionalOneToOne.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.BidirectionalOneToOne.Entity.AadharCard;
import com.jsp.BidirectionalOneToOne.Entity.Human;

public class Driver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Human h1 = new Human();
		h1.setId(1);
		h1.setName("Omkar");
		h1.setAddress("yadrav");
		
		
		AadharCard ac1 = new AadharCard();
		
		ac1.setId(1);
		ac1.setAadharNumber(1234);
		ac1.setAge(18);
		
		
		h1.setAadharCard(ac1);
		ac1.setHuman(h1);
		
		et.begin();
		 em.persist(h1);
		 em.persist(ac1);
		et.commit();
		
	}
	
}
