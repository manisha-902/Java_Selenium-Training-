package day4and5;
import java.util.Scanner;
class InvalidPinException extends Exception{
	public InvalidPinException(String message) {
		super(message);
	}
}
public class ATMCard {
	
	/*static final int Correct_pin = 1234;
	static void validatePin(int enteredPin) throws InvalidPinException{
		if(enteredPin!= Correct_pin) {
			throw new InvalidPinException("Invalid PIN entered.Access Denied.");
		}else {
			System.out.println("PIN is correct. Access Granted.");
		}
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Correct_pin = 1234;
		try {
			System.out.print("Insert ATM Card...");
			System.out.print("Enter your 4-digit PIN: ");
			int Pin = sc.nextInt();
			//validatePin(Pin);	
			if(Pin!= Correct_pin) {
				throw new InvalidPinException("Invalid PIN entered.Access Denied.");
			}else {
				System.out.println("PIN is correct. Access Granted.");
			}
		}
		catch(InvalidPinException e) {
			System.out.println("Exception caught: " +e.getMessage());
		}
		finally {
			System.out.println("Transection session ended");
		}
	}

}
