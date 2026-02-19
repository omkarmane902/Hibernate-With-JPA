package com.jsp.Unidirectional_OneToOne.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int id;
	private String name;
	private int age;
	
	@OneToOne
    private Department department_id;
	
	
	public Employee() {
	}


	public Employee(int id, String name, int age, Department department_id) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department_id = department_id;
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


	public Department getDepartment_id() {
		return department_id;
	}


	public void setDepartment_id(Department department_id) {
		this.department_id = department_id;
	}
	
	
	
	
	
}
