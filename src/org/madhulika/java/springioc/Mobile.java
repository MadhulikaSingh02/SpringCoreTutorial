package org.madhulika.java.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		//1.using new obejct creation
		/*Airtel airtel = new Airtel();
		airtel.calling();
		airtel.data();

		//2.using interface implementation
		SimCard simCard = new Vodafone();
		simCard.calling();
		simCard.data();*/
		
		//3.ioc container created. It is going to read the config file and create objects
		//for Airtel and Vodafone
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		
		//create Airtel class reference
		Airtel obj1= (Airtel)context.getBean("airtel");
		obj1.calling();
		obj1.data();
		
		Vodafone obj2 = context.getBean("vodafone",Vodafone.class);
		obj2.calling();
		obj2.data();
		
		//4.now let us use the interface reference to get the bean
		SimCard simObj = context.getBean("sim", SimCard.class);
		simObj.calling();
		simObj.data();
		//advantage of above approach..if new mobile service is added, there is no need
		//to change the java class, only the configurable file needs to change
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
