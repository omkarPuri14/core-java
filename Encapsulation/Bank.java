package com.encapsulation;

public class Bank {
	private double balance;
	double total_amount;
	
	
	public double getBalance() {
		
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
		
	}
	
	public void deposit(double deposit) {
		double total_amount=deposit+balance;
		this.total_amount=total_amount;
		System.out.println(deposit+" amount "+"+ "+balance+" blance amount ="+total_amount+" rs");
		
	}
	public void withdraw(double withdraw) {
		double remaing_amounrt=total_amount-withdraw;
		System.out.println(withdraw+" amount "+"- "+total_amount+" blance amount ="+remaing_amounrt+" rs");
		
		
	}


}
