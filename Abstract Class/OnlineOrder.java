package com.abstracclass;

public class OnlineOrder extends FoodOrder {

	@Override
	void calculateBill(String name, double price, double tax, double delevire_Charge) {
		System.out.println("online food order");
		System.out.println("food name " + name);
		System.out.println("food price " + price);
		System.out.println("tax on food " + tax);
		System.out.println("delevire charge " + delevire_Charge);
		double gst = ( price * tax) / 100;
		endbill = gst + price+delevire_Charge;

	}
}
