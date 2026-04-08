package com.abstracclass;

public class PartTime extends Employee{
	
	@Override
	public void calculateSalary(double salary, double bouns) {
		System.out.println("Part time employe salary "+(salary+bouns));

		System.out.println("salary "+salary);
		System.out.println("bonus "+bouns);

		System.out.println("Part time employe salary "+(salary+bouns));
		
	}

}
