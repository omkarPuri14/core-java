package com.abstraction;

public class Recetangle implements Shape{

	@Override
	public void area() {
		
		
		
		double l=10;
		double w=2;
		System.out.println("area of rectangle "+(l*w));
		
		
		
	}

	@Override
	public void perimeter() {
		double l=10;
		double w=2;
		System.out.println("Parimeter of rectangle "+2*(l+w));
		
	}

}
