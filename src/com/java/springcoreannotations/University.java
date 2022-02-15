package com.java.springcoreannotations;

import org.springframework.stereotype.Component;

@Component
public class University {
	
	private String uName;
	
	public void displayAffUniversity() {
		System.out.println("Affliated to :"+uName);
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

}
