package com.jsp.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	int studentid ;
	String name ;
	double fee;
	
	public Student(int studentid, String name, double fee) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.fee = fee;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	
	
	

}
