package day3;

public class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance;
        } else {
            balance = 0;
        }
    }
	
	 public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: Rs. " + amount);
	        } else {
	            System.out.println("Invalid deposit amount!");
	        }
	    }
	 
	 public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: Rs. " + amount);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient balance!");
	        }
	    }
	 public double getBalance() {
	        return balance;
	    }

}
