package ass1;

public class Account {
	static String bankName = "SBI";
	String accountHolderName;
    double balance;
    
    Account(String name, double initialBalance) {
        accountHolderName = name;
        balance = initialBalance;
    }
    
    void deposit(double amount) {
        double updatedBalance = balance + amount;
        balance = updatedBalance;
        System.out.println("Deposited: " + amount);
    }
    void displayDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account("Manisha", 5000);
        account.deposit(1500);
        account.displayDetails();
	}

}
