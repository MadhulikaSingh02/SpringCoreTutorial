package org.madhulika.java.springautowiring;

public class Lungs {
	private String nameOfAnimal;
	private int noOfLungs;
	
	
	public void breathe() {
		System.out.println("Lungs are inhaling and exhaling!!");
	}


	public String getNameOfAnimal() {
		return nameOfAnimal;
	}


	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}


	public int getNoOfLungs() {
		return noOfLungs;
	}


	public void setNoOfLungs(int noOfLungs) {
		this.noOfLungs = noOfLungs;
	}

}
