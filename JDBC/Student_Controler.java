package com.day3;

import java.util.Scanner;

public class Student_Controler {
	public static void main(String[] args) throws Exception {
		
		
		Stud_Service sd=new Stud_Service();
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name ");
		String name = sc.nextLine();
		System.out.println("Enter city ");
		String city = sc.nextLine();
		Student s=new Student(id, name, city);
		
		sd.insertData(s);
//		sd.upDateData(s);
//		sd.deletData(s);
//		sd.getAllRecord();
//		sd.getSingle_Record(s);
	}

}
