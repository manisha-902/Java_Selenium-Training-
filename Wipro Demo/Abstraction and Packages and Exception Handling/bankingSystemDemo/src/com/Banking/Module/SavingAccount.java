package com.Banking.Module;

public class SavingAccount extends BankAccount {
	public SavingAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	public void deposit(double amount) {
		double updated = getBalance() + amount;
		setBalance(updated);
		System.out.println("Deposited ₹" + amount + " to Savings Account.");
	}

	public void withdraw(double amount) {
		if (getBalance() >= amount) {
			setBalance(getBalance() - amount);
			System.out.println("Withdrew ₹" + amount + " from Savings Account.");
		} else {
			System.out.println("Insufficient balance.");
		}
	}
}
 
