package com.ethigpen.objectMaster;

public class Ninja extends Human{
	
// constructor	
	public Ninja() {
		this.stealth = 10;
	}

//	methods
	public void steal(Human person) {
		person.health -= this.stealth;
		this.health += this.stealth;
	}
	
	public void runAway() {
		this.health -= 10;
	}
}
