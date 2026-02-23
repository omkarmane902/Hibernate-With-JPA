package com.jsp.BidirectionalOneToOne.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "human")
public class Human {

	
	@Id
	private int id;
	private String name;
	private String address;
	
	
	@OneToOne
	private AadharCard aadharCard;
	
	public Human() {
	}

	public Human(int id, String name, String address, AadharCard aadharCard) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.aadharCard = aadharCard;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public AadharCard getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(AadharCard aadharCard) {
		this.aadharCard = aadharCard;
	}
	
	
}
