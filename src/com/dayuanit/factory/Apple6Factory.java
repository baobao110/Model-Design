package com.dayuanit.factory;

public class Apple6Factory extends AppleFactory {
	
	@Override
	public Phone createPhone() {
		Phone phone = new Phone();
		phone.setName("苹果");
		phone.setType("6");
		phone.setOs("IOS6");
		return phone;
	}

}
