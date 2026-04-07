package com.abstraction;

public class FullTimeEmp implements Employe{

	@Override
	public void calculateSalary(double salary, double bouns) {
		System.out.println("full time employe salary "+(salary+bouns));
		
	}

}
