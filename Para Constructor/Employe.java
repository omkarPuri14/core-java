package com.construcror;

public class Employe {
	int emp_id;
	String name;
	long mob_No;
	String email_Id;
	String city;
	double salary;
	double boones;
	
	
	public Employe(int emp_id,String name,long mob_No,String email_Id,String city,double salary,double boones) {
		
		
		this.emp_id=emp_id;
		this.name=name;
		this.mob_No=mob_No;
		this.email_Id=email_Id;
		this.city=city;
		this.salary=salary;
		this.boones=boones;
		
		
		
	}
	public void display() {
		
		System.out.println("employe id-"+emp_id);
		System.out.println("employe name:- "+name);
		System.out.println("employe mobile no:- "+mob_No);
		System.out.println("employe email id:- "+email_Id);
		System.out.println("city "+city);
		System.out.println("employe salary:- "+salary);
		System.out.println("employe boones:- "+boones);
		
	}

}
