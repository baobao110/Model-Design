package com.dayuanit.proxy;

public class UserServiceStaticProxy implements UserService {
	
	private UserService userSerice = new UserServiceImpl();

	@Override
	public void login() {
		System.out.println("befor login");
		userSerice.login();
		System.out.println("after login");
	}

}
