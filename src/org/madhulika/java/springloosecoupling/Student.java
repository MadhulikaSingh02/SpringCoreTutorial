package org.madhulika.java.springloosecoupling;

public class Student {
	private String studentName;
	private int studentId;

	private Marks marksInterfaceObj;

	public void displayStudentDetails() {
		System.out.println("Display student details:" + studentId + " " + studentName);

		marksInterfaceObj.displaySemMarks();
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setMarksInterfaceObj(Marks marksInterfaceObj) {
		this.marksInterfaceObj = marksInterfaceObj;
	}

	}
