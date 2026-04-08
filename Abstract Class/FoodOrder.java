package com.abstracclass;

public abstract class FoodOrder {
	double endbill;
	
	abstract void calculateBill(String name,double price,double tax,double delevire_Charge);
	void printReceipt() {
		
		
		
		System.out.println("print resicept "+endbill);
		
	}

}
