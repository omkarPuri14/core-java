package com.abstracclass;

public class Clothing extends Product{
	
	@Override
	void calculateDiscount(double discount,double price) {
		System.out.println("prise of product "+price);
		System.out.println("discount on product "+discount);
		
		double discount_Price=(discount*price)/100;
		System.out.println("discount on product "+discount_Price);
		double fainle_price=price-discount_Price;
		System.out.println("price after discount "+fainle_price);
		
	}

}
