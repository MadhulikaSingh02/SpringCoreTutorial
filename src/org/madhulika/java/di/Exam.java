package org.madhulika.java.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		/*Student student1 = new Student();
		student1.setStudentId(12345);
		student1.setStudentName("Madhulika");
		
		student1.displayStudentDetails();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beansDI.xml");
		Student stud1 = context.getBean("student",Student.class);
		stud1.displayStudentDetails();
		
		Venue v1 = context.getBean("venue", Venue.class);
		v1.displayVenueDetails();
		
		Venue v2 = context.getBean("kv2venue", Venue.class);
		v2.displayVenueDetails();
		((ClassPathXmlApplicationContext)context).close();
	}

}
