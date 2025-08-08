package day4and5;

import java.util.Scanner;

class PinEnteredException extends Exception {
	public PinEnteredException(String message) {
		super(message);
	}
}

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class UserBankAcc {
	String pin;
	double balance;

	public UserBankAcc(String pin, double balance) {
		this.pin = pin;
		this.balance = balance;
	}

	public boolean validate(String enteredPin) {
		return this.pin.equals(enteredPin);
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Rs." + amount + "Deposited Successfully.");
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance. Available: Rs." + balance);
		}
		balance -= amount;
		System.out.println("Rs," + amount + " withdrawn successfully.");
	}

	public void checkBalance() {
		System.out.println("Current balance: Rs." + balance);
	}
}

public class ATMSimulator {

	static final int MAX_ATTEMPTS = 3;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserBankAcc[] users = new UserBankAcc[3];
		users[0] = new UserBankAcc("1234", 5000);
		users[1] = new UserBankAcc("5678", 10000);
		users[2] = new UserBankAcc("0000", 7500);

		System.out.println("Welcome to the ATM");

		try {
			UserBankAcc currentUser = authenticate(users);
			if (currentUser != null) {
				showMenu(currentUser);
			}
		} catch (PinEnteredException e) {
			System.out.println("Invaild Pin" + e.getMessage());
		} finally {
			System.out.println("Transaction Successful!");
			sc.close();
		}
	}

	public static UserBankAcc authenticate(UserBankAcc[] users) throws PinEnteredException {
		int attempts = 0;

		while (attempts < MAX_ATTEMPTS) {

			System.out.print("Enter PIN: ");
			String enteredPin = sc.nextLine();

			for (UserBankAcc user : users) {
				if (user.validate(enteredPin)) {
					System.out.println("Login successful.");
					return user;
				}
			}

			attempts++;
			System.out.println(" Invalid credentials. Attempts left: " + (MAX_ATTEMPTS - attempts));
		}

		throw new PinEnteredException("Exceeded maximum login attempts. Card blocked.");
	}

	public static void showMenu(UserBankAcc user) {
		int choice;

		System.out.println("\n------ ATM MENU ------");
		System.out.println("1️ Check Balance");
		System.out.println("2️ Deposit");
		System.out.println("3️ Withdraw");
		System.out.println("4️ Exit");
		System.out.print("Select option: ");
		choice = sc.nextInt();

		try {
			switch (choice) {
			case 1:
				user.checkBalance();
				break;
			case 2:
				System.out.print("Enter amount to deposit: Rs.");
				double depositAmount = sc.nextDouble();
				user.deposit(depositAmount);
				break;
			case 3:
				System.out.print("Enter amount to withdraw: Rs.");
				double withdrawAmount = sc.nextDouble();
				user.withdraw(withdrawAmount);
				break;
			case 4:
				System.out.println("Thank you for using the ATM.");
				break;
			default:
				System.out.println("Invalid option.");
			}
		} catch (InsufficientBalanceException e) {
			System.out.println("Insufficient Balance " + e.getMessage());
		}

	}
}
