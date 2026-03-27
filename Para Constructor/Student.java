package com.construcror;

public class Student {
	String fname;
	String lname;
	int age;
	long mob_No;
	String email;
	String class_Room_No;
	
	public Student(String fname,String lname,int age,long mob_No,String email,String class_Room_No) {
		this.fname=fname;
		this.lname=lname;
		this.age=age;
		this.mob_No=mob_No;
		this.email=email;
		this.class_Room_No=class_Room_No;
		
		
		
	}
	public void display() {
System.out.println("student info");
		
		System.out.println("student first :- "+fname);
		System.out.println("student last name:- "+lname);
		System.out.println("age:- "+age);
		System.out.println("mobile no:- "+mob_No);
		System.out.println("email id:- "+email);
		System.out.println("Student class room no "+class_Room_No);
		
	}

}
