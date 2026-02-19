package com.jsp.Unidirectional_OneToMany.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	int id ;	
	String department;
	int count;
	
	
	
	public Department() {
	}

	public Department(int id, String department, int count) {
		super();
		this.id = id;
		this.department = department;
		this.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	
}
