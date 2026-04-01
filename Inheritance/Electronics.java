package com.inheritance;

public class Electronics extends Product {
	
//	Derived class: Electronics
//	adds attribute: warranty
//	method: show_warranty()

	private int warranty;

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	
	public void show_Warranty() {
		
		System.out.println("product warranty "+warranty+" years");
	}
	
	
	
	
	
	

}
