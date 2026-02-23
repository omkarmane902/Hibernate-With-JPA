package com.jsp.BidirectionalOneToOne.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AadharCard {

		@Id
		private int id;
		private int aadharNumber;
		private int age;
		
		
		@OneToOne 
		private Human human;
		
		
		public AadharCard() {
		}


		public AadharCard(int id, int aadharNumber, int age, Human human) {
			super();
			this.id = id;
			this.aadharNumber = aadharNumber;
			this.age = age;
			this.human = human;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public int getAadharNumber() {
			return aadharNumber;
		}


		public void setAadharNumber(int aadharNumber) {
			this.aadharNumber = aadharNumber;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public Human getHuman() {
			return human;
		}


		public void setHuman(Human human) {
			this.human = human;
		}





		
		
}
