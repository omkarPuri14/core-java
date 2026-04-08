package com.abstracclass;

public class Main {
	
	public static void main(String[] args) {
//		Bank_Account b;
//		System.out.println("saving account");
//		System.out.println();
//		b=new SavingsAccount();
//		b.account_No=343524562544l;
//		b.blance=45000;
//		b.deposite(47000);
//		b.calculateInterest(6.5, 4);
//		
//		System.out.println();
//		System.out.println("cureent account");
//		System.out.println();
//		
//		b=new CurrentAccount();
//		b.account_No=23425262625l;
//		b.blance=4000;
//		b.deposite(40000);
//		b.calculateInterest(4, 2);
		
//		FoodOrder fd;
//		fd=new DineInOrder();
//		fd.calculateBill("pizz", 450, 5,0);
//		fd.printReceipt();
//		System.out.println();
//		
//		fd=new OnlineOrder();
//		fd.calculateBill("pizz", 450, 5, 200);
//		fd.printReceipt();
		
//		
//		Ride_with rd;
//		rd=new MiniRide();
//		rd.startRide("bhosari", "chinchavad");
//		rd.calculateFare(10);
//		
//		System.out.println();
//		
//		rd=new PrimeRide();
//		rd.startRide("Bhosari","vakad");
//		rd.calculateFare(15);
		
//		Product pd;
//		pd=new Electronics();
//		pd.displayProductDetails("tv");
//		pd.calculateDiscount(20, 12000);
//		System.out.println();
//		pd=new Clothing();
//		pd.displayProductDetails("T shirt");
//		pd.calculateDiscount(12, 400);
		
		Employee emp;
		emp=new FullTime();
		emp.calculateSalary(40000, 6000);
		
		System.out.println();
		
		emp=new PartTime();
		emp.calculateSalary(15000, 2000);
	}

}
