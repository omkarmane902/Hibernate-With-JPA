package com.jsp.Unidirectional_OneToMany.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher {

	@Id
	private int id;
	private String teacher_name;
	private double exp;
	
	public Teacher() {
	}

	public Teacher(int id, String teacher_name, double exp) {
		super();
		this.id = id;
		this.teacher_name = teacher_name;
		this.exp = exp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}
	
	
	
	
	
	
	
}
