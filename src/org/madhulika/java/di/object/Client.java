package org.madhulika.java.di.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		/*Student student1 = new Student();
		Marks m = new Marks();
		student1.setMarks(m);
		student1.setStudentName("asd");
		student1.setStudentId(1);*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beansDI2.xml");
		Student student1 = context.getBean("student", Student.class);
		student1.displayStudentDetails();
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
