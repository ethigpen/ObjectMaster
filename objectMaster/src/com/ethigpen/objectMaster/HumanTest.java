package com.ethigpen.objectMaster;

public class HumanTest {

	public static void main(String [] args) {
		
		Human num1 = new Human();
		Human num2 = new Human();
		Wizard num3 = new Wizard();
		Ninja num4 = new Ninja();
		Samurai num5 = new Samurai();
		Samurai num6 = new Samurai();
		
		num1.attack(num2);
		System.out.println(num2.getHealth());
		num3.fireball(num1);
		System.out.println(num1.getHealth());
		num4.steal(num2);
		num4.runAway();
		System.out.println(num4.getHealth());
		num5.deathBlow(num6);
		num5.meditate();
		System.out.println(num5.getHealth());
		System.out.println(Samurai.howMany());
		
	}
}
