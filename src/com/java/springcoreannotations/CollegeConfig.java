package com.java.springcoreannotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.java.springcoreannotations")
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {
	
	/*@Bean
	public Principal principalBean() {
		return new Principal();
	}
	
	@Bean
	public University universityBean() {
		return new University();
	}
	
	@Bean Teacher teacherInterfaceBean() {
		return new MathTeacher();
	}
	
	@Bean
	public College collegeBean() {//collegeBean is the bean id used in .getBean()
		//this method returns a new bean of type College
		College college = new College(principalBean());//for constr injection
		college.setUniversity(universityBean());//setter injection
		college.setTeacher(teacherInterfaceBean());
		return college;
	}*/

}
