package day3;

public class PaymentMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p1 = new CreditCardPayment(5000.0, "1234-5678-9876-4321");
        Payment p2 = new UPIPayment(1200.0, "user@upi");
        Payment p3 = new CashPayment(300.0);

        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}
