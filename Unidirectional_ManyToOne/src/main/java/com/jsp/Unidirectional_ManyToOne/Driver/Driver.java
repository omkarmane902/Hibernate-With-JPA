package com.jsp.Unidirectional_ManyToOne.Driver;

import javax.persistence.*;

import com.jsp.Unidirectional_ManyToOne.Customer;
import com.jsp.Unidirectional_ManyToOne.Order;

public class Driver {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pg");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

       
        Customer c1 = new Customer(1, "Omkar", 12000);

        
        Order o1 = new Order(1, "Chapati", 2, c1);
        Order o2 = new Order(2, "Rice", 1, c1);
        Order o3 = new Order(3, "Bhaji", 3, c1);

        
        em.persist(c1);
        em.persist(o1);
        em.persist(o2);
        em.persist(o3);

        et.commit();

        em.close();
        emf.close();

        System.out.println("Data Inserted Successfully");
    }
}