package com.java.springcoreannotations;

import org.springframework.stereotype.Component;

@Component
public class Department {
	public void showDept() {
		System.out.println("In electronics dept");
	}
}
