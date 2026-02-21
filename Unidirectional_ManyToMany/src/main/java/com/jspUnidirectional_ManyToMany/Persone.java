package com.jspUnidirectional_ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Persone {
    @Id
	private int id;
    private String name;
    private int age;
    
  
    @ManyToMany
    private  List<Book>books;
    
    
    public Persone() {
		// TODO Auto-generated constructor stub
	}


	public Persone(int id, String name, int age, List<Book> books) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.books = books;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public List<Book> getBooks() {
		return books;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
	}
    
    
    
    
  
	
}
