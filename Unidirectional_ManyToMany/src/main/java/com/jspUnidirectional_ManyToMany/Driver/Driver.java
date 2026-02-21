package com.jspUnidirectional_ManyToMany.Driver;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspUnidirectional_ManyToMany.Book;
import com.jspUnidirectional_ManyToMany.Persone;

public class Driver {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Book b1 = new Book(1, "	Don Quixote", 200);
		Book b2 = new Book(2, "Alice's Adventures in Wonderland", 3200);
		Book b3 = new Book(3, "	Treasure Island", 600);
		
		List<Book> allbook1 = Arrays.asList(b1, b2);
		List<Book> allbook2 = Arrays.asList(b1, b2, b3);
		
		Persone p1 = new Persone(1, "omkar", 18, allbook2);
		Persone p2 = new Persone(2, "Bapu", 20, allbook1);
		
		et.begin();
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		em.persist(p1);
		em.persist(p2);
		et.commit();
		
		
		
		
	}
}
