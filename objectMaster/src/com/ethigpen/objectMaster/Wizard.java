package com.ethigpen.objectMaster;

public class Wizard extends Human{
//	wizard variables
	
// wizard constructor
	public Wizard() {
		this.intelligence = 8;
		this.health = 50;
	}
	
//	methods
	public void heal(Human person) {
		person.health += this.intelligence;
	}
	
	public void fireball(Human person) {
		person.health -= (3*this.intelligence);
	}

}
