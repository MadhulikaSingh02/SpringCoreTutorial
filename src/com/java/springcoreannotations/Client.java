package com.java.springcoreannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		//container object creation
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class); 
		//College col = context.getBean("collegeBean", College.class);// this is for @Bean
		College col = context.getBean("college", College.class); //this is for @Component

		col.display();
		((AnnotationConfigApplicationContext) context).close();

	}

}
