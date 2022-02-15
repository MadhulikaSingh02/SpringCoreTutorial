package com.java.beanlifecycleannotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello implements InitializingBean ,DisposableBean{
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("This is the new init method using Interface method--");
		
	}
	
	public void demo() {
		System.out.println("do whatever you want to!!!!");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("this is the new destroy method using Interface method ");
		
	}

	
	/*public void myInit() {
		System.out.println("Hello class-myInit");
	}

	public void myDestroy() {
		System.out.println("Hello class-myDestroy");
	}*/

}
