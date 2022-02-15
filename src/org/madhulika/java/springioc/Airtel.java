package org.madhulika.java.springioc;

public class Airtel implements SimCard{
	//the constructor is not needed ..uncomment to see the flow of control
	/*public Airtel() {
		System.out.println("Airtel Constructor called");
	}*/

	@Override
	public void calling() {
		System.out.println("Calling using Airtel sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Airtel sim");
		
	}
	
}
