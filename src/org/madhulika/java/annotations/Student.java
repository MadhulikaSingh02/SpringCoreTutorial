package org.madhulika.java.annotations;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")
	private String studentName;
	
	private String courseName;
	private String hobby;
	
	
	/*public void setStudentName(String studentName) {
		this.studentName = studentName;
	}*/
	
	@Required
	@Value("${student.course}")
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void displayStudentDetails() {
		System.out.println(studentName + " "+ courseName +" "+ hobby);
	}
}
