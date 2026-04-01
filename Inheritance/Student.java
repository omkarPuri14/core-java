package com.inheritance;

public class Student extends Person{
	
//	Derived class: Student
//	adds attribute: grade
//	method: study()
	
	char grade;
	
	public void study(char grade) {
		
		this.grade=grade;
		switch (grade) {
		
				case 'A':
					System.out.println("pass with distinction");
					break;
				case 'B':
					System.out.println("pass with first class");
					break;
				case 'C':
					System.out.println("pass with second class");
					break;
				case 'D':
					System.out.println("pass");
					break;
				case 'F':
					System.out.println("Fail  ");
					break;
				default:
					System.out.println("Invalid Input");
				}
		
		
	}

}
