package com.inheritance;

public class Bank_Account {

//	2> Base class: BankAccount
//
//	attributes: account_holder, balance
//	methods: deposit(), withdraw()
//	Derived class: SavingsAccount
//	adds attribute: interest_rate
//	method: add_interest()

	String account_holder;
	double blance;
	double total_amount;


	public void account_holder(String account_holder) {
		this.account_holder = account_holder;

		System.out.println("account holder name:- " + account_holder);

	}

	public void blance(double blance) {
		this.blance = blance;
		total_amount=blance+total_amount;

		System.out.println("blance amount in account:- " + total_amount);

		System.out.println();

	}

	public void deposit(double deposit) {

		System.out.println("depoite ammount " + deposit);

		double total_amount = blance + deposit;
		this.total_amount = total_amount;
		
		System.out.println("blance ammount " + blance + " +" + " deposit amount " + deposit + "=" + "total amount "
				+ total_amount);
		System.out.println("blance " + total_amount);

		System.out.println();

	}

	public void withdraw(double withdraw) {
		System.out.println("withdraw amount " + withdraw);
		double total=total_amount;
		total_amount = total_amount - withdraw;

System.out.println("total blance " + total + " -" + " withdraw amount " + withdraw + " =" + total_amount);

		System.out.println("blance " + total_amount);

	}

}
