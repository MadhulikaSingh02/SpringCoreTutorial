package org.madhulika.java.di.object;

public class Student {
	private String studentName;
	private int studentId;

	private Marks marks;

	public void displayStudentDetails() {
		System.out.println("Display student details:" + studentId + " " + studentName);

		marks.displayMarks();

	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setMarks(Marks marks) {
		this.marks = marks;
	}
}
