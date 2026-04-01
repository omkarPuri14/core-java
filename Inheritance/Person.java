package com.inheritance;

public class Person {
	
//	Base class: Person
//
//	attributes: name, age
//	method: introduce()
//	Derived class: Student
//	adds attribute: grade
//	method: study()
	
	String name;
	int age;
	
	public void introduction(String name,int age) {
		this.name=name;
		this.age=age;
		
		System.out.println("name "+name);
		System.out.println("age "+age);
		
		
	}



}
