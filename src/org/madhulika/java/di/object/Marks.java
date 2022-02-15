package org.madhulika.java.di.object;

public class Marks {
	private float math;
	private float english;

	public void displayMarks() {
		System.out.println("Math: " + math + " English: " + english);
	}

	public void setMath(float math) {
		this.math = math;
	}

	public void setEnglish(float english) {
		this.english = english;
	}
}
