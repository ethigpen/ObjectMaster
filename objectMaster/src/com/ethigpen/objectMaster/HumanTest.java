package com.ethigpen.objectMaster;

public class HumanTest {

	public static void main(String [] args) {
		
		Human num1 = new Human();
		Human num2 = new Human();
		
		num1.attack(num2);
		System.out.println(num2.getHealth());
		
	}
}