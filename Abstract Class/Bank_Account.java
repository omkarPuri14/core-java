package com.abstracclass;

public abstract class Bank_Account {

	long account_No;
	double blance;

	abstract void calculateInterest(double intrest, double year);

	void deposite(double deposit) {

		System.out.println("account no " + account_No);
		System.out.println("account blance " + blance);
		System.out.println("deposit amount "+deposit);

		blance = deposit + blance;
		System.out.println("amount after  deposite " + blance);

	}

}
