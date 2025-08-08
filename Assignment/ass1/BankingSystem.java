package ass1;

public class BankingSystem {
	static double interestRate = 4.0;

	int accountNumber;
	String accountHolder;
	double balance;

	public BankingSystem(int accNo, String name, double initialBalance) {
		this.accountNumber = accNo;
		this.accountHolder = name;
		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited: ₹" + amount);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: ₹" + amount);
		} else {
			System.out.println("Insufficient Balance!");
		}
	}

	public void checkBalance() {
		System.out.println("Balance: ₹" + balance);
	}

	public void showInterestRate() {
		System.out.println("Interest Rate: " + interestRate + "%");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankingSystem user1 = new BankingSystem(1234, "Manisha Sahoo", 10000);

		int userChoice = 1;
		double transactionAmount = 2000;

		switch (userChoice) {
		case 1:
			user1.deposit(transactionAmount);
			break;

		case 2:
			user1.withdraw(transactionAmount);
			break;

		case 3:
			user1.checkBalance();
			break;

		case 4:
			user1.showInterestRate();
			break;

		case 5:
			System.out.println("Exiting... Thank you!");
			break;

		default:
			System.out.println("Invalid Option");
		}
	}
}
