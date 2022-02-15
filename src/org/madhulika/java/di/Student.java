package org.madhulika.java.di;

public class Student {
	private String studentName;
	private int studentId;
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void displayStudentDetails() {
		System.out.println("Display student details:"+studentId+" "+studentName);
	}
}
