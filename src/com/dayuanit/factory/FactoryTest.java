package com.dayuanit.factory;

public class FactoryTest {
	
	public static void main(String[] args) {
//		PhoneFacotry factory = new Apple5Factory();
		PhoneFacotry factory = new Apple6Factory();
		Phone phone = factory.createPhone();
		System.out.println(phone);
	}

}
