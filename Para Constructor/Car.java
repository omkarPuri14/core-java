package com.construcror;



public class Car {
	int modle_no;
	int eging_no;
	int modle_Year;
	String colour;
	String name;
	
	
	public Car(int modle_no,int eging_no,int modle_Year,String colour,String name) {
		
		this.modle_no=modle_no;
		this.eging_no=eging_no;
		this.modle_Year=modle_Year;
		this.colour=colour;
		this.name=name;
		
		
		
		
	}
	public void display() {
		System.out.println("car info");
		System.out.println("modle no:- "+modle_no);
		System.out.println("eging no:- "+eging_no);
		System.out.println("modeal year:- "+modle_Year);
        System.out.println("car name:- "+name);
		System.out.println("car colur:- "+colour);
	}

}
