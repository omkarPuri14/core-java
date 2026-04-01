package com.inheritance;

public class Product {
//	Base class: Product
//
//	attributes(V): name, price
//	method: display_product()
//	Derived class: Electronics
//	adds attribute: warranty
//	method: show_warranty()
	
	private String name;
	private int price;
	
	
	public void setName(String name) {
		
		this.name=name;
		
		
	}
	
	public String getName() {
		
		return name;
	}
	
public void setPrice(int price) {
		
		this.price=price;
		
		
	}
	
	public int getPrice() {
		
		return price;
		
		
		
	}
	public void display() {
		
		System.out.println("product name:- "+name);
		System.out.println("product price:- "+price);
		
	}

	
	

}
