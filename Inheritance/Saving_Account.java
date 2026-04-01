package com.inheritance;

public class Saving_Account extends Bank_Account {
	
	
//	Derived class: SavingsAccount
//	adds attribute: interest_rate
//	method: add_interest()
	
	double interest_Rate;
     int time;
	
	
	public void add_Intrest(double intersest_rate,int time) {
		this.time=time;
		this.interest_Rate=intersest_rate;
		
		System.out.println();
		
		System.out.println("interest rate "+intersest_rate+"%");
		System.out.println(time+" year");
		
		System.out.println();
		
		System.out.println("blance amount "+total_amount);
		
		double simple_interst=(total_amount*time*intersest_rate)/100;
		System.out.println("interst amount "+simple_interst);
		System.out.println("total amount after interst "+(simple_interst+total_amount));
		
		
	}
	
	


}
