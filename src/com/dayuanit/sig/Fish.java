package com.dayuanit.sig;

public class Fish {
	
	private static volatile Fish fish;
	
	private Fish() {
		
	}
	
	public static Fish getFish() {
		
		if (null == fish) {
			synchronized (Fish.class) {
				if (null == fish) {
					fish = new Fish();
				}
			}
		}
		
		return fish;
	}

}
