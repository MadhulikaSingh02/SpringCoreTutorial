package org.madhulika.java.springioc;

public class Vodafone implements SimCard{

	@Override
	public void calling() {
		System.out.println("Calling using Vodafone sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Vodafone sim");
		
	}
	
}
