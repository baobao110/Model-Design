package com.dayuanit.sig;

public class Person {
	
	
	private Person() {
		
	}
	
	public static Person getPerson() {
		return xx.person;
	}
	
	private static class xx {
		public static Person person = new Person();
	}

}
