package com.encapsulation;

public class Person {
//	 Create a class with private variables
//
//	 Question:
//	 Create a class Person with private variables name and age.
//	 Add setter and getter methods.
//	 Create an object and print the name and age.
	
	private String name;
	private int age;
	
	public String getName() {
		
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
		
	}
	
	public int getId() {
		return age;
	}
	public void setId(int age) {
		this.age=age;
	}
	
	
	

}
