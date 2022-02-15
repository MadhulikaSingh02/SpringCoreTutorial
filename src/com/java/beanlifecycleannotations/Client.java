package com.java.beanlifecycleannotations;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 
	 System.out.println("Before creating container-----****");
	 ApplicationContext context = new ClassPathXmlApplicationContext("beansDBBLC.xml");
	 //AbstractApplicationContext c= new ClassPathXmlApplicationContext();
	 System.out.println("container created--------");
	 
	 //StudentDAO dao=context.getBean("studentDAO", StudentDAO.class );
	 //System.out.println("Object created:"+dao);
	 //dao.fetchAllRows();
	 //((ClassPathXmlApplicationContext) context).registerShutdownHook();
	 //studentDAO.deleteStudentRecord("S004");
	 
	 Hello hello = context.getBean("hello", Hello.class);
	 hello.demo();
	 
	 
	 
	 System.out.println("Before closing container");
	 ((ClassPathXmlApplicationContext) context).close();
	 System.out.println("After closing container");
	 //((ClassPathXmlApplicationContext) context).registerShutdownHook();
	 //StudentDAO dao1=context.getBean("studentDAO", StudentDAO.class );-->this throws exception if you 
	 //close the container using context.close().
	 //you have to again create the container.
	 //whereas if you use registerShutdownHook(), you can still create beans.because this method is invoked 
	 //only when the main thread ends(ie after all the code execution is completed)
		
	 
	 }
}
