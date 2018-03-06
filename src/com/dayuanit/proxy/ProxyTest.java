package com.dayuanit.proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {
	
	public static void main(String[] args) {
//		UserService userService = new UserServiceStaticProxy();
//		userService.login();
		
		
		
		UserService userService = (UserService)Proxy.newProxyInstance(ProxyTest.class.getClassLoader(), 
				new Class[]{UserService.class}, 
				new UserServiceHandler(new UserServiceImpl()));
		
		System.out.println(userService.getClass().getName());
		userService.login();
		
	}

}
