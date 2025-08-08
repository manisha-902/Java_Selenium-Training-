package com.Banking.Module;
import java.util.Scanner;
public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        BankServices service = new BankServiceImpl();

        System.out.print("Enter Account Number: ");
        int  accountNumber = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        sc.nextLine(); 

        System.out.print("Account Type (savings/current): ");
        String type = sc.nextLine();

        BankAccount account;
        if (type.equalsIgnoreCase("savings")) {
            account = new SavingAccount(accountNumber, name, balance);
        } else {
            account = new CurrentAccount(accountNumber, name, balance);
        }
        service.createAccount(account);

        System.out.print("Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Withdraw Amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        service.showAccountDetails(accountNumber);
        sc.close();
	}

}
