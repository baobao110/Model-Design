package com.dayuanit.factory;

public class Apple5Factory extends AppleFactory {

	@Override
	public Phone createPhone() {
		Phone phone = new Phone();
		phone.setName("苹果");
		phone.setType("5");
		phone.setOs("IOS5");
		return phone;
	}
	
	
}
