package day3;

public abstract class Payment {
	double amount;

	Payment(double amount) {
		this.amount = amount;
	}

	abstract void processPayment();
}

class CreditCardPayment extends Payment {
	String cardNumber;

	CreditCardPayment(double amount, String cardNumber) {
		super(amount);
		this.cardNumber = cardNumber;
	}

	void processPayment() {
		System.out.println("Card: " + cardNumber);
		System.out.println("Processing Credit Card Payment of Rs." + amount );
	}
}

class UPIPayment extends Payment {
	String upiId;

	UPIPayment(double amount, String upiId) {
		super(amount);
		this.upiId = upiId;
	}

	void processPayment() {
		System.out.println("UPI ID: " + upiId);
		System.out.println("Processing UPI Payment of Rs." + amount );
	}
}

class CashPayment extends Payment {

	CashPayment(double amount) {
		super(amount);
	}

	void processPayment() {
		System.out.println("Processing Cash Payment of Rs." + amount);
	}
}
