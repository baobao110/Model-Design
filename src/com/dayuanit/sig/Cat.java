package com.dayuanit.sig;

public class Cat {
	
	private static Cat cat;
	
	private Cat() {
		
	}
	
	public static Cat getCat() {
		
		synchronized (Cat.class) {
			if (null == cat) {
				cat = new Cat();
			}
		}
		
		return cat;
	}

}
