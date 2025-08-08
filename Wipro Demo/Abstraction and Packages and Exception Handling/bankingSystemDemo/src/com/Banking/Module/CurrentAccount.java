package com.Banking.Module;

public class CurrentAccount extends BankAccount {
	public CurrentAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	public void deposit(double amount) {
		setBalance(getBalance() + amount);
		System.out.println("Deposited ₹" + amount + " to Current Account.");
	}

	public void withdraw(double amount) {
		if (getBalance() - amount >= 500) {
			setBalance(getBalance() - amount);
			System.out.println("Withdrew ₹" + amount + " from Current Account.");
		} else {
			System.out.println("Cannot withdraw. Must maintain ₹500 minimum balance.");
		}
	}
}
