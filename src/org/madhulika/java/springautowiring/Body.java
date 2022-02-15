package org.madhulika.java.springautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansAW.xml");
		Animal animalObj = context.getBean("animalBean", Animal.class);
		animalObj.startPumping();
		animalObj.startBreathing();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
