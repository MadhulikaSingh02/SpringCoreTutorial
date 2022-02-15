package com.java.springcoreannotations;

import org.springframework.stereotype.Component;

@Component
public class PhysicsTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Physics teacher teaching Newton's Law");

	}

}
