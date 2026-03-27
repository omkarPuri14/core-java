package com.construcror;

public class My_port_Folio {
	
	String fname;
	String lname;
	int age;
	long mob_No;
	String email;
	
	public My_port_Folio(String fname,String lname,int age,long mob_No,String email) {
		
		this.fname=fname;
		this.lname=lname;
		this.age=age;
		this.mob_No=mob_No;
		this.email=email;
		
		
		
		
		
 }
	public void display() {
System.out.println("my port folio");
		
		System.out.println("first :- "+fname);
		System.out.println("last name:- "+lname);
		System.out.println("age:- "+age);
		System.out.println("mobile no:- "+mob_No);
		System.out.println("email id:- "+email);
		
	}
	
	

}
