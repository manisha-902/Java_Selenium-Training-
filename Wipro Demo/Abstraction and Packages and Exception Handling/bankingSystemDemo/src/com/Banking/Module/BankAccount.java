package com.Banking.Module;

public abstract class BankAccount {
	private int accountNumber;
	private String accountHolderName; 
	private double balance;
	
	public BankAccount(int accountNumber, String name,  double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = name;
		this.balance = balance;
		}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolderName() {
		return  accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	
	protected void setBalance(double balance) {
        this.balance = balance;
    }
	public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

}
