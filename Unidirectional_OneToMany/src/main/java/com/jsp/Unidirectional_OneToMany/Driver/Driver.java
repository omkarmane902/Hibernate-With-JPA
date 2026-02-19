package com.jsp.Unidirectional_OneToMany.Driver;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Unidirectional_OneToMany.Entity.Department;
import com.jsp.Unidirectional_OneToMany.Entity.Employee;



public class Driver {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Department d1 = new Department(1, "Tester", 3);
		Department d2 = new Department(2, "Backend Developer", 5);
		Department d3 = new Department(3, "Frontend Developer", 8);
		
		
        Employee e1 = new Employee(1, "omkar", 18, d3);
        Employee e2 = new Employee(2, "Chinamay", 22, d2);
        Employee e3 = new Employee(3, "Rahul", 18, d1);
		
		
		
		et.begin();
		em.persist(d1);
		em.persist(d2);
		em.persist(d3);
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		et.commit();
	}
}
