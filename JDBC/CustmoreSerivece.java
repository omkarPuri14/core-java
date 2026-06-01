package com.day4;

import java.util.Scanner;

public class CustmoreSerivece {
	
	public void insertDAta() throws Exception  {
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter Customer ID: ");
        int custId = scanner.nextInt();
        scanner.nextLine();

       
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

       
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

      
        System.out.print("Enter Phone Number: ");
        long phoneNo = scanner.nextLong();

     
        scanner.nextLine(); 
        System.out.print("Enter City: ");
        String city = scanner.nextLine();

       
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        
        System.out.print("Enter Aadhaar Number: ");
        long adharNo = scanner.nextLong();

        
        System.out.print("Enter Number of Purchases: ");
        int purchases = scanner.nextInt();

        
        System.out.print("Enter Paid Amount: ");
        int payAmount = scanner.nextInt();

       
        System.out.print("Enter Remaining Amount: ");
        int remainingAmount = scanner.nextInt();
        
        Custmore cs=new Custmore(custId, name, email, phoneNo, city, age, adharNo, purchases, payAmount, remainingAmount);
        scanner.close();
       
		
		
		
		
		CustomerDao co=new CustomerDao();
		co.insertData(cs);
		
		
		
	}
	
public void updateDAta() throws Exception  {
	
	Scanner scanner =new Scanner(System.in);
	System.out.print("Enter Name: ");
    String name = scanner.nextLine();
    
	System.out.print("Enter Customer ID: ");
    int custId = scanner.nextInt();
    Custmore cs=new Custmore(custId, name);
    scanner.close();
  
	
	
		
		CustomerDao co=new CustomerDao();
		co.updateData(cs);
		
		
	}
public void deleteDAta() throws Exception  {
	Scanner scanner =new Scanner(System.in);
	
	System.out.print("Enter Customer ID: ");
    int custId = scanner.nextInt();
    Custmore cs=new Custmore(custId);
    scanner.close();
	
	
	
	CustomerDao co=new CustomerDao();
	co.delecetData(cs);
	
	
}

}
