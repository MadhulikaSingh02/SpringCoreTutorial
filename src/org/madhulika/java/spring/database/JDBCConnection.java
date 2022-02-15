package org.madhulika.java.spring.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {
	
	@Value("${user}")
	private String user;
	
	@Value("${password}")
	private String password;
	
	@Value("${driver}")
	private String driver;
	
	@Value("${url}")
	private String url;
	
	public void displayConnectionParams() throws ClassNotFoundException, SQLException {		
		System.out.println("user: "+user);
		System.out.println("password: "+password);
		System.out.println("driver: "+driver);
		System.out.println("url: "+url);
		establishConnection();
	}
	
	public void establishConnection() throws ClassNotFoundException, SQLException {
		System.out.println("Entering establishConnection");
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Connection successful"+con);	
		
		if(con != null) {
			con.close();
		}
	}
	
}