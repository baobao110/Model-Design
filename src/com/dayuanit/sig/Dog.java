package com.dayuanit.sig;

public class Dog {
	
	private static Dog dog = new Dog();
	
	private Dog() {
		
	}
	
	public static Dog getDog() {
		return dog;
	}

}
