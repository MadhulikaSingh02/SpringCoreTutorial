package com.java.springcoreannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Principal {
	
	@Value("${college.principal.name}")
	private String pName;
	
	@Value("${college.principal.degree}")
	private String pDegree;
	
	public void displayPrincipalDetails() {
		System.out.println(pName+"-"+pDegree);
	}
}
