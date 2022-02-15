package org.madhulika.java.spring.database;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Login {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("beansDB.xml");
		JDBCConnection jdbc= context.getBean("jdbcConnection", JDBCConnection.class);
		jdbc.displayConnectionParams();
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
