package org.madhulika.java.springloosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beansLC.xml");
		Student student1 = context.getBean("student", Student.class);
		student1.displayStudentDetails();
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
