package com.dayuanit.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserServiceHandler implements InvocationHandler {
	private Object target;
	
	public UserServiceHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("befor ....");
		
		Object obj = method.invoke(target, args);
		
		System.out.println("after ....");
		
		return obj;
	}
}
