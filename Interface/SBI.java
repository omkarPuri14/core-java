package com.abstraction;

public class SBI implements Bank {

	double total_amount;

	@Override
	public void deposit(double deposit) {

		total_amount = deposit + total_amount;
		System.out.println("amount deposite " + total_amount);

	}

	@Override
	public void withdraw(double withdraw) {

		total_amount = total_amount - withdraw;
		System.out.println("withdraw amount " + total_amount);

	}

	@Override
	public void checkBalance() {

		System.out.println("chek balance " + total_amount);

	}

}
