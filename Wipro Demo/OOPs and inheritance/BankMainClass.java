package day3;

public class BankMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount myAccount = new BankAccount(5000); 
		
		myAccount.deposit(1500);    
        myAccount.withdraw(2000);    
        myAccount.withdraw(6000);    

        System.out.println("Current Balance: Rs. " + myAccount.getBalance());
	}

}
