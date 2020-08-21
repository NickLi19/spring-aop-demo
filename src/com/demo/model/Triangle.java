package com.demo.model;

public class Triangle {
	
	private String name;
	private String city;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Inside TR setter.");
//		throw(new ArithmeticException());
	}

	public String setCity(String city) {
		this.city = city;
		return city.toUpperCase();
	}

}
