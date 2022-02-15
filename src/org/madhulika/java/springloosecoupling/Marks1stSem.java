package org.madhulika.java.springloosecoupling;

public class Marks1stSem implements Marks {
	private float compSc;
	private float chemistry;

	public void displaySemMarks() {
		System.out.println("compSc: " + compSc + " chemistry: " + chemistry);
	}

	public void setCompSc(float compSc) {
		this.compSc = compSc;
	}

	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}

}
