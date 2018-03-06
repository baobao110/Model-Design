package com.dayuanit.sig;

public enum Bird {
	
	Bird1;
	
	private int age;
	private String name;
	
	
	
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void move() {
		System.out.println("bord move");
	}

}
