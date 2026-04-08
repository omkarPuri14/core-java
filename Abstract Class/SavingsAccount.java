package com.abstracclass;

public class SavingsAccount extends Bank_Account{
	
	

	

	@Override
	void calculateInterest(double intrest,double year) {
		
		double sp=(blance*year*intrest)/100;
		
		System.out.println("calculate simple intrest "+sp);
		
		System.out.println("amoumt after intrest "+(blance+sp));
		
		
		
		
	}

}
