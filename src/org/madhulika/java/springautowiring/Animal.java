package org.madhulika.java.springautowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Animal {
	@Autowired
	@Qualifier("OctopusHeartObj")	
	private Heart heart;
	
	@Autowired
	@Qualifier("OctopusLungObj")
	private Lungs lungs;

	
	 /*public Animal(){
	  
	 }
	 
	public Animal(Heart heart, Lungs lungs) {
		// When using @Autowired, remove "autowire="constructor"" from xml.
		// error will be displayed saying default constr is needed.
		// after providing the def constr, NLP is obtained as this.heart is unavailable.
		// then give <context:annotation-config /> at the top in the config file.
		System.out.println("Human constr called ..for Heart and Lungs");
		this.heart = heart;
		this.lungs = lungs;
	}// now remove @autowire from here and place it before setter
*/
	public void startPumping() {
		heart.pump();
		System.out.println(heart.getNameOfAnimal()+" has "+heart.getNoOfHearts()+" hearts");
	}

	public void startBreathing() {
		lungs.breathe();
		System.out.println(lungs.getNameOfAnimal()+" has "+lungs.getNoOfLungs()+" lungs");
	
	}

	/*// uncomment when using autowire=byname or bytype
	public void setHeart(Heart heart) {
		System.out.println("using setter injection");
		this.heart = heart;
		System.out.println(">>>"+this.heart.getClass());
	}

	public void setLungs(Lungs lungs) {
		this.lungs = lungs;
	}
*/
}
