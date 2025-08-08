package day1and2;
import java.util.Scanner;

/*class Bank {
    String accHolder;
    String accNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Rs." + amount + " deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Rs." + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Account Number: " + accNumber);
        System.out.println("Available Balance: Rs." + balance);
    }
}

public class Operations {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        Bank c1 = new Bank();

	        System.out.print("Enter Account Holder Name: ");
	        c1.accHolder = sc.nextLine();

	        System.out.print("Enter Account Number: ");
	        c1.accNumber = sc.nextLine();

	        System.out.print("Enter Initial Balance: Rs.");
	        c1.balance = sc.nextDouble();

	        System.out.print("Enter Deposit Amount: Rs.");
	        double depositAmount = sc.nextDouble();
	        c1.deposit(depositAmount);

	        System.out.print("Enter Withdraw Amount: Rs.");
	        double withdrawAmount = sc.nextDouble();
	        c1.withdraw(withdrawAmount);

	        System.out.println("\n--- Account Summary ---");
	        c1.displayBalance();

	        sc.close();
	}

}*/

/*class employee {
	String employeeName;
	String employeeID;
	double salary;

	void increment(double amount){
		salary += amount;
		System.out.println("Increment in Salary is updated");
	}

	void displayDetails() {
		System.out.println("Employee Name: " + employeeName);
		System.out.println("EmployeeID: " + employeeID);
		System.out.println("Salary: Rs." + salary);
	}
}

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		employee e1 = new employee();

		System.out.print("Enter Employee Name: ");
		e1.employeeName = sc.nextLine();

		System.out.print("Enter EmployeeID: ");
		e1.employeeID = sc.nextLine();

		System.out.print("Enter salary : Rs.");
		e1.salary = sc.nextDouble();

		System.out.print("Enter increment Amount: Rs.");
		double incrementAmount = sc.nextDouble();
		e1.increment(incrementAmount);

		System.out.println("\n Employee Details");
		e1.displayDetails();

		sc.close();
	}
}*/

/*class FileDrive {
    String fileName;
    String fileType;
    double fileSize;

    void upload(String name, String type, double size) {
        fileName = name;
        fileType = type;
        fileSize = size;
        System.out.println("File uploaded successfully!");
    }

    void download() {
        System.out.println("\n--- Downloading File ---");
        System.out.println("Name : " + fileName);
        System.out.println("Type : " + fileType);
        System.out.println("Size : " + fileSize + " MB");
    }
}

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileDrive c2 = new FileDrive();

        System.out.print("Enter File Name: ");
        String name = sc.nextLine();

        System.out.print("Enter File Type (e.g. PDF, DOCX): ");
        String type = sc.nextLine();

        System.out.print("Enter File Size (MB): ");
        double size = sc.nextDouble();

        c2.upload(name, type, size);
        c2.download();

        sc.close();
    }
}*/


class ChatBot {
    String userInput;

    void receiveMessage(String message) {
        userInput = message;
    }

    void respond() {
        System.out.print("Bot: ");
        if (userInput.equalsIgnoreCase("Hi") || userInput.equalsIgnoreCase("Hello")) {
            System.out.println("Hello! How can I help you today?");
        } else if (userInput.equalsIgnoreCase("Bye")) {
            System.out.println("Goodbye! Have a great day!");
        } else if (userInput.toLowerCase().contains("weather")) {
            System.out.println("It's sunny today!");
        } else {
            System.out.println("I'm still learning. Can you rephrase?");
        }
    }
}

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChatBot c3 = new ChatBot();

        System.out.print("You: ");
        String msg = sc.nextLine();

        c3.receiveMessage(msg);
        c3.respond();

        sc.close();
    }
}
