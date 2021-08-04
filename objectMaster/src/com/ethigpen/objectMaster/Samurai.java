package com.ethigpen.objectMaster;

public class Samurai extends Human {
	
	public static int numOfS;
	
	public Samurai() {
		this.health = 200;
		numOfS++;
	}
	
//	methods
	
	public void deathBlow(Human person) {
		person.health = 0;
		this.health = (this.health/2);
	}
	
	public void meditate() {
		this.health += (this.health/2);
	}
		
	public static String howMany() {
		String msg = String.format("There are %s Samurai", numOfS);
		return msg;
	}

}
