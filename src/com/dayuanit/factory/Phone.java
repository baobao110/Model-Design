package com.dayuanit.factory;

public class Phone {

	private String name;
	private String type;
	private String os;
	
	@Override
	public String toString() {
		return "name=" + name + ", type=" + type + ",o s=" + os;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

}
