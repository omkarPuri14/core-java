package com.abstraction;

public class PartTimeEmp implements Employe{

	@Override
	public void calculateSalary(double salary, double bouns) {
		System.out.println("Part time employe salary "+(salary+bouns));
		
	}

}
