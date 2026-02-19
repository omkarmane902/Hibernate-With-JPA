package com.jsp.Unidirectional_OneToMany.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class College {
    @Id
	private int id;
	private String college_name;
	private String gread;
	

	@OneToMany
	private List<Teacher> teacher;
	
	
	public College() {
		// TODO Auto-generated constructor stub
	}


	public College(int id, String college_name, String gread, List<Teacher> teacher) {
		super();
		this.id = id;
		this.college_name = college_name;
		this.gread = gread;
		this.teacher = teacher;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCollege_name() {
		return college_name;
	}


	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}


	public String getGread() {
		return gread;
	}


	public void setGread(String gread) {
		this.gread = gread;
	}


	public List<Teacher> getTeacher() {
		return teacher;
	}


	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
	  
	
	
	
	
	
	

	
	
	
	
	
	
}
