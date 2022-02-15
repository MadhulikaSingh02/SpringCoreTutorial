package org.madhulika.java.springioc;

public class Fido implements SimCard{
	//the constructor is not needed ..uncomment to see the flow of control
	/*public Fido() {
		System.out.println("Fido Constructor called");
	}*/

	@Override
	public void calling() {
		System.out.println("Calling using Fido sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Fido sim");
		
	}
	
}
