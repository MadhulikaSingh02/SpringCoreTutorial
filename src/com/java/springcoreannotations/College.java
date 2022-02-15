package com.java.springcoreannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("collegeBean")
//@Component
//now we are not using any component annot, use @Bean
@Component
public class College {
	
	@Autowired
	private Principal principal;//Initially without any annot, this obj is null.Usin constr injection
	
	@Autowired
	private University university;//using setter injection
	
	@Autowired
	//@Qualifier("physicsTeacher")
	private Teacher teacher; //using interface. check Simcard example
	
	@Autowired
	private Department dept; //for this i am not creating const or setter, lets use autowiring.
	//so now again put @component
	
	
	public void display() {
		System.out.println("inside display method");
		principal.displayPrincipalDetails();
		
		university.setuName("VTU"); //this can be done using the @Value , then 
		//no need for setter
		university.displayAffUniversity();
		teacher.teach();
		dept.showDept();
	}

	/*public College(Principal principal) {
		System.out.println("Constructor for Principal used");
		this.principal = principal;
	}
	
	public void setUniversity(University university) {
		this.university = university;
		System.out.println("Setter for University");
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}*/
}
