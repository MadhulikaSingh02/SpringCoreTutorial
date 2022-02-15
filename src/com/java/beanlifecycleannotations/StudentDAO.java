package com.java.beanlifecycleannotations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {
	private String url;
	private String driver;
	private String user;
	private String password;
	Connection con;

	//@PostConstruct
	//to use the annotation 1)give <context:annotation-config> in xml or
	//2)if you don't want the above in xml, then use CommonAnnotationBeanPostProcessor bean in xml
	//3) if you dont want to use annotation, use  init-method="myInit" destroy-method="myDestroy" in xml
	public void myInit() throws ClassNotFoundException, SQLException {
		System.out.println("Entering myInit");
		openConnection();
	}

	public void openConnection() throws SQLException, ClassNotFoundException {
		System.out.println("Entering openConnection");
		// load the driver
		Class.forName(driver);

		// getConnection
		con = DriverManager.getConnection(url, user, password);
	}

	public void fetchAllRows() throws ClassNotFoundException, SQLException {
		System.out.println("Entering fetchAllRows");
		// execute Query
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM backend_test.hostelstudentinfo");

		while (rs.next()) {
			String StudentId = rs.getString(1);
			String StudentName = rs.getString(2);
			double hostelFees = rs.getDouble(3);
			String foodPref = rs.getString(4);
			System.out.println(StudentId + " " + StudentName + " " + hostelFees + " " + foodPref);
		}
	}

	public void deleteStudentRecord(String studentId) throws ClassNotFoundException, SQLException {
		// SET SQL_SAFE_UPDATES = 0;
		Statement st = con.createStatement();
		st.executeUpdate("delete FROM backend_test.hostelstudentinfo where Student_Id='" + studentId + "'");
		System.out.println("Record deleted for " + studentId);
	}

	
	public void closeConnection() throws SQLException, ClassNotFoundException {
		if (con != null) {
			con.close();
		}
		System.out.println("Connection closed");
	}
	
	//@PreDestroy
	public void myDestroy() throws ClassNotFoundException, SQLException {
		System.out.println("Entering myDestroy");
		closeConnection();
	}


	public void setUrl(String url) {
		this.url = url;
	}

	public void setDriver(String driver) {
		System.out.println("setDriver>>injecting all the dependencies");
		this.driver = driver;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
