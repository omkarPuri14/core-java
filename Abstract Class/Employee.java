package com.abstracclass;

public abstract class Employee {
	
	abstract void calculateSalary(double salary,double bonuce);
	void  getEmployeeDetails(int emp_id,String name,long mobile_No,String city) {
		System.out.println("emp id "+emp_id);
		System.out.println("emp name "+name);
		System.out.println(" mobile no "+mobile_No);
		System.out.println("city "+city);
		
	}

	


}
