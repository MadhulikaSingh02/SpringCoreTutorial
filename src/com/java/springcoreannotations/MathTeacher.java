package com.java.springcoreannotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher {
	@Override
	public void teach() {
		System.out.println("Math teacher teaching Vectors");
	}
}
