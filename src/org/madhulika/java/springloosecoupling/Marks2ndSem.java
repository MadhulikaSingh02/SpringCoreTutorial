package org.madhulika.java.springloosecoupling;

public class Marks2ndSem implements Marks {
	private float enggDrawing;
	private float physics;

	public void displaySemMarks() {
		System.out.println("enggDrawing: " + enggDrawing + " English: " + physics);
	}

	public void setEnggDrawing(float enggDrawing) {
		this.enggDrawing = enggDrawing;
	}

	public void setPhysics(float physics) {
		this.physics = physics;
	}	

	}
