package com.abstraction;

public class UPI implements Payment{

	@Override
	public void pay(double amount) {
		
		System.out.println("payment throught the upi is "+amount);
		
		
	}

}
