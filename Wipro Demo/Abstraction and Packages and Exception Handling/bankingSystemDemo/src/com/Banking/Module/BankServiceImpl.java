package com.Banking.Module;

public class BankServiceImpl implements BankServices{
	private BankAccount[] accounts = new BankAccount[100];
    private int count = 0;
   
    public void createAccount(BankAccount account) {
        accounts[count] = account;
        System.out.println("Account created for " + account.getAccountHolderName());
        count++;
    }

    public void showAccountDetails(int accountNumber) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                BankAccount acc = accounts[i];
                System.out.println("Account Number: " + acc.getAccountNumber());
                System.out.println("Holder Name: " + acc.getAccountHolderName());
                System.out.println("Balance: ₹" + acc.getBalance());
                return;
            }
        }
        System.out.println("Account not found.");
    }

}
