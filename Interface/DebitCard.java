package com.abstraction;

public class DebitCard implements Payment {
	
	@Override
	public void pay(double amount) {
		
		System.out.println("payment throught the debite card is "+amount);
		
		
	}

}
