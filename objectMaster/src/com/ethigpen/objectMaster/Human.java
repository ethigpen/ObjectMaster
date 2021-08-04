package com.ethigpen.objectMaster;

public class Human {
//	member variables
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	
//	constructor
	public Human() {
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
		
	}
	
//	methods
	public void attack( Human person ) {
		person.health -= this.strength;
	}
	
//	get
	public String getHealth() {
		String msg = String.format("Current Health is %s", this.health);
		return msg;
	}
	
}
